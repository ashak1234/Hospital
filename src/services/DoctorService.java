package services;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DoctorDao;
import hibernatebean.Appointment;
import hibernatebean.Doctor;

public class DoctorService {	
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	BeanFactory factory =  (BeanFactory)context;		
	private DoctorDao doc_dao = (DoctorDao)factory.getBean("doc");

	public void register(Doctor user){		
		getDoc_dao().register(user);
	}

	public DoctorDao getDoc_dao() {
		return doc_dao;
	}

	public void setDoc_dao(DoctorDao doc_dao) {
		this.doc_dao = doc_dao;
	}
	
}
