package services;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Appointment;
import bean.Patient;
import bean.Register;
import dao.PatientDao;
import dao.RegisterDao;

public class Patient_Register_Service {	
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	BeanFactory factory =  (BeanFactory)context;		
	PatientDao pdao = (PatientDao)factory.getBean("d");

	public void savePatient(Patient patient){
		pdao.savePatient(patient);
	}
}
