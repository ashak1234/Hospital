package services;


import java.util.List;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Appointment;
import dao.AppointmentDao;

public class AppointmentService {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	BeanFactory factory =  (BeanFactory)context;		
	AppointmentDao dao = (AppointmentDao)factory.getBean("a");
	
	public List<Appointment> getAllAppointments(){
		return dao.getAllAppointments();
	}
	
	public void addAppointment(Appointment a){
		dao.addAppointment(a);
		System.out.println("Added appointment Succesfully");
	}

}
