package spring.controller;

import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

@Controller
public class HospitalController {		
		
		AppointmentService as = new AppointmentService();	
		DoctorService ds = new DoctorService();
		DoctorLoginService dls = new DoctorLoginService();

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
			//return null;
		}

	@RequestMapping(value="/patientLogin")
	public String patientPage(){
		return "patientLogin";
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
	
	@RequestMapping(value="/Pending Requests", method=RequestMethod.GET)
	public ModelAndView pendingRequest(HttpServletRequest request, Model model){
		System.out.println("Before cofirming");
		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("firstName");
		List<Appointment> pendinglist  = as.getAllPendingRequests(userName);
		return new ModelAndView("pending", "list", pendinglist );
		
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
	
	/*@RequestMapping(value="/patient_Register", method=RequestMethod.POST)
	public ModelAndView registerPage(@ModelAttribute("patient") Patient patient){
		
		System.out.println(patient.getFirstName());
		
		return new ModelAndView("Patient_Home", "firstname", patient.getFirstName());
	}*/
	
}
