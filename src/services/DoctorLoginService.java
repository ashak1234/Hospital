package services;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DoctorLoginDao;
import hibernatebean.Doctor;
import hibernatebean.DoctorLogin;
import dao.DoctorDao;


public class DoctorLoginService {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	BeanFactory factory =  (BeanFactory)context;		
	DoctorLoginDao logindao = (DoctorLoginDao)factory.getBean("doclogin");
	
	public  Doctor isUserExist(String userName, String userPassword){
		Doctor user = logindao.isUserExist(userName, userPassword);
		return user;
	}
	
	public  void login(DoctorLogin user){
		logindao.login(user);
		System.out.println("Logged in successfully");
	}

}
