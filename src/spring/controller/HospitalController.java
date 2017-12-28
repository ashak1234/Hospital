package spring.controller;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import hibernatebean.Appointment;
import hibernatebean.Doctor;
import hibernatebean.DoctorLogin;
import services.AppointmentService;
import services.DoctorLoginService;
import services.DoctorService;
import springbean.AppointmentBean;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HospitalController {		
		
	@Autowired
	private AppointmentService as;	
	
	@Autowired
	private DoctorService ds;
	
	@Autowired
	private DoctorLoginService dls;

	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/appointment" , method=RequestMethod.POST)
	public ModelAndView displayAppt(@ModelAttribute("appoint") Appointment appoint){
		String name = "hello " + appoint.getFirstName();
		System.out.println("Appointment task: "+name);
		as.addAppointment(appoint);
		List<Appointment> list = as.getAllAppointments();
		Appointment appt = null;
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			appt = (Appointment) itr.next();
			System.out.println(appt);						
		}				
		return new ModelAndView("result", "apptList", list); 		
	}
	
	@RequestMapping(value = "/savePending", method = RequestMethod.POST)
	public ModelAndView savePendingAppointment(@ModelAttribute("command") AppointmentBean aBean, 
			BindingResult result) {
		Appointment a = prepareModel(aBean);
		as.addAppointment(a);
		return new ModelAndView("redirect:/pending");
	}
	
	@RequestMapping(value = "/saveModify", method = RequestMethod.POST)
	public ModelAndView saveModifyAppointment(@ModelAttribute("command") AppointmentBean aBean, 
			BindingResult result) {
		Appointment a = prepareModel(aBean);
		as.addAppointment(a);
		return new ModelAndView("redirect:/modify");
	}
	
	@RequestMapping(value="/pending", method = RequestMethod.GET)
	public ModelAndView pendingPage(@ModelAttribute("command")  AppointmentBean aBean,
			BindingResult result){
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("appointments",  prepareListofBean(as.getAllAppointments()));
		return new ModelAndView("pending", model);
	}	
	
	@RequestMapping(value="/modify", method = RequestMethod.GET)
	public ModelAndView modifyPage(@ModelAttribute("command")  AppointmentBean aBean,
			BindingResult result){
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("appointments",  prepareListofBean(as.getAllAppointments()));
		return new ModelAndView("modify", model);
	}		
	
	@RequestMapping(value="/show", method = RequestMethod.GET)
	public ModelAndView listEmployees() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("list",  prepareListofBean(as.getAllAppointments()));
		return new ModelAndView("appointmentList", model);
	}
	
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteAppointment(@ModelAttribute("command")  AppointmentBean aBean,
			BindingResult result) {
		as.deleteAppointment(prepareModel(aBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("a", null);
		model.put("appointments", prepareListofBean(as.getAllAppointments()));
		return new ModelAndView("modify", model);
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editAppointment(@ModelAttribute("command")  AppointmentBean aBean, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();		
		System.out.println("from Edit" +aBean.getfirstName());
		System.out.println("from Edit" +aBean.getAid());
		model.put("a", prepareAppointmentBean(as.getAppointment (aBean.getAid())));
		model.put("appointments",  prepareListofBean(as.getAllAppointments()));
		return new ModelAndView("modify", model);
	}	
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView registerPage(@ModelAttribute("user") Doctor user){
		String message = null;
		System.out.println("Before Registering without name");		
		System.out.println("Before Registering Mr/Miss" +user.getFirstName());
		
		if(ds.getDoc_dao().validate(user.getUserName())){
			
			message = "Username Already exists! Try with another username";
			return new ModelAndView("register", "message", message);			
		}
		else{
			ds.register(user);
			message = "Successfully Registered! Login Now";	
			return new ModelAndView("doctorLogin", "message", message);
		}		
	}
	
	@RequestMapping(value="/doctorLogin", method=RequestMethod.POST)
	public ModelAndView doctorPage(@ModelAttribute("user") DoctorLogin user){
		System.out.println("Before logging without name "+user.getPassword() +" "+ user.getUserName());
		Doctor registeredUser = dls.isUserExist(user.getUserName(),user.getPassword());
		if(registeredUser != null){
			System.out.println("After logging Mr/Miss " +registeredUser.getFirstName());
			dls.login(user);			
			return new ModelAndView("welcome", "firstname", registeredUser.getFirstName());
		}
		else
			return new ModelAndView("invalidlogin", "message", "Invalid Login");		
	}
	
	private List<AppointmentBean> prepareListofBean(List<Appointment> allAppointments) { 
		List<AppointmentBean> beans = null;
		if(allAppointments != null && !allAppointments.isEmpty()){
			beans = new ArrayList<AppointmentBean>();
			AppointmentBean bean = null;
			for(Appointment a : allAppointments){
				bean = new AppointmentBean();
				bean.setAid(a.getAid());
				bean.setfirstName(a.getFirstName());
				bean.setLastName(a.getLastName());
				bean.setEmail(a.getEmail());
				bean.setAddress(a.getAddress());
				bean.setReason(a.getReason());
				bean.setDoctor(a.getDoctor());
				bean.setDept(a.getDept());
				bean.setContactType(a.getContactType());
				bean.setPending(a.getPending());
				bean.setTime(a.getTime());
				bean.setDay(a.getDay());
				bean.setMobile(a.getMobile());
				
				beans.add(bean);
			}
		}
		return beans;
	}		
	
	private Appointment prepareModel(AppointmentBean aBean){
		
		Appointment a = new Appointment();
		
		a.setAid(a.getAid());
		a.setFirstName(aBean.getfirstName());
		a.setLastName(aBean.getLastName());
		a.setEmail(aBean.getEmail());
		a.setAddress(aBean.getAddress());
		a.setReason(aBean.getReason());
		a.setDoctor(aBean.getDoctor());
		a.setDept(aBean.getDept());
		a.setContactType(aBean.getContactType());
		a.setPending(aBean.getPending());
		a.setTime(aBean.getTime());
		a.setDay(aBean.getDay());
		a.setMobile(aBean.getMobile());
		
		return a;
	}
	
	private AppointmentBean prepareAppointmentBean(Appointment a){
		
		AppointmentBean bean = new AppointmentBean();
		
		bean.setAid(a.getAid());
		bean.setfirstName(a.getFirstName());
		bean.setLastName(a.getLastName());
		bean.setEmail(a.getEmail());
		bean.setAddress(a.getAddress());
		bean.setReason(a.getReason());
		bean.setDoctor(a.getDoctor());
		bean.setDept(a.getDept());
		bean.setContactType(a.getContactType());
		bean.setPending(a.getPending());
		bean.setTime(a.getTime());
		bean.setDay(a.getDay());
		bean.setMobile(a.getMobile());
		
		return bean;
	}	
}
