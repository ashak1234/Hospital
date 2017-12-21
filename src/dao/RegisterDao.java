package dao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bean.Register;

public class RegisterDao{
	HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
		System.out.println("Hello from Register Setter of hibernate template");
	}
	
	public void register(Register user){
		getHt().save(user);
		System.out.println("Registered Succesfully");
	}	
	
}
