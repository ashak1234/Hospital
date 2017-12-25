package dao;
//dao
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;

import hibernatebean.Doctor;
import hibernatebean.DoctorLogin;


public class DoctorLoginDao {	
	HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
		System.out.println("Hello from DoctorLogin Setter of hibernate template");
	}

	@SuppressWarnings("unchecked")
	public Doctor isUserExist(String userName, String userPassword) {
		//boolean userFound = false;
		
		List<Doctor> user = ht.find("from Doctor a  where a.userName = ? and a.password=?", new Object[]{ userName, userPassword} ); 
		if (user.isEmpty()) {
			System.out.println("retruning null");
			return null;
		}
		return user.get(0);
	}
	
	public void login(DoctorLogin user){
		getHt().save(user);		
	}	

}
