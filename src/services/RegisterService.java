package services;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Appointment;
import bean.Register;
import dao.RegisterDao;

public class RegisterService {	
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	BeanFactory factory =  (BeanFactory)context;		
	RegisterDao rdao = (RegisterDao)factory.getBean("r");

	public void register(Register user){
		rdao.register(user);
	}
}
