package services;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import bean.Login;
import bean.Register;
import dao.LoginDao;
import dao.RegisterDao;


public class LoginService {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	BeanFactory factory =  (BeanFactory)context;		
	LoginDao logindao = (LoginDao)factory.getBean("l");
	
	public  Register checkLogin(String userName, String userPassword){
		Register user = logindao.checkLogin(userName, userPassword);
		return user;
	}
	
	public  void login(Login user){
		logindao.login(user);
		System.out.println("Logged in successfully");
	}

}
