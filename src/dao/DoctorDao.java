package dao;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import hibernatebean.Appointment;
import hibernatebean.Doctor;

public class DoctorDao{
	HibernateTemplate ht;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
		System.out.println("Hello from Doctor Setter of hibernate template");
	}
	
	public void register(Doctor user){		
			getHt().save(user);
			System.out.println("Registered Succesfully");
	}
	
	public boolean validate(String userName) {
		boolean userFound = false;		
		List<Doctor> user = ht.find("from Doctor a  where a.userName = ?",new Object[]{ userName}); 
		if (user.isEmpty()) {
			System.out.println("retruning null");
			return userFound;
		}		
		return userFound=true;
	}
	
	public String getUserByUserName(String uname){
		List<Doctor> userList = ht.find("from Doctor a  where a.userName = ?",new Object[]{ uname}); 
		if (userList.isEmpty()) {
			System.out.println("retruning null");
			return null;
		}		
		return userList.get(0).getFirstName();
	}
	
}
