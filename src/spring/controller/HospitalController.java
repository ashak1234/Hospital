 package spring.controller;

import java.util.Iterator;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bean.Appointment;
import bean.Login;
import bean.Patient;
import bean.Register;
import services.AppointmentService;
import services.LoginService;
import services.RegisterService;

@Controller
public class HospitalController {		
		
		AppointmentService as = new AppointmentService();	
		RegisterService rs = new RegisterService();
		LoginService ls = new LoginService();

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
	public ModelAndView doctorPage(@ModelAttribute("user") Login user){
		System.out.println("Before logging without name "+user.getPassword() +" "+ user.getUserName());
		Register registeredUser = ls.checkLogin(user.getUserName(),user.getPassword());
		if(registeredUser != null){
			System.out.println("After logging Mr/Miss " +registeredUser.getFirstName());
			ls.login(user);
			return new ModelAndView("home", "firstname", registeredUser.getFirstName());
		}
		else
			return new ModelAndView("invalidlogin", "message", "Invalid Login");
		
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView registerPage(@ModelAttribute("user") Register user){
		System.out.println("Before Registering without name");
		System.out.println("Before Registering Mr/Miss" +user.getFirstName());
		rs.register(user);
		System.out.println("After Registering Mr/Miss" +user.getFirstName());
		return new ModelAndView("home", "firstname", user.getFirstName());
	}
	
	@RequestMapping(value="/patient_Register", method=RequestMethod.POST)
	public ModelAndView registerPage(@ModelAttribute("patient") Patient patient){
		
		System.out.println(patient.getFirstName());
		
		return new ModelAndView("Patient_Home", "firstname", patient.getFirstName());
	}
	
}
