package services;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DoctorDao;
import dao.HospitalDao;

public class HospitalService {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	BeanFactory factory =  (BeanFactory)context;		
	HospitalDao hosp_dao = (HospitalDao)factory.getBean("hosp");


}
