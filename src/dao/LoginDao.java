package dao;

import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import bean.Login;
import bean.Register;


public class LoginDao {	
	HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
		System.out.println("Hello from Register Setter of hibernate template");
	}

	@SuppressWarnings("unchecked")
	public Register checkLogin(String userName, String userPassword) {
		//boolean userFound = false;
		
		List<Register> user = ht.find("from Register a  where a.userName = ? and a.password=?", new Object[]{ userName, userPassword} ); 
		if (user.isEmpty()) {
			System.out.println("retruning null");
			return null;
		}
		return user.get(0);
	}
	
	public void login(Login user){
		getHt().save(user);		
	}	

}
