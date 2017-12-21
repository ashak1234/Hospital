package dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import bean.Appointment;
import bean.Login;

public class AppointmentDao {
	
	HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
		System.out.println("Hello from Setter of hibernate template");
	}
	
	public void addAppointment(Appointment a){
		getHt().save(a);
	}	
	
	@SuppressWarnings("unchecked")
	public List<Appointment> getAllAppointments(){
		List<Appointment> list = ht.find("from Appointment"); 
		return list;		
	}
	
	public void update(){
		String query = 	"update Appointment set firstName=? where firstName=?";
		int res = ht.bulkUpdate(query, new Object[]{"asha", "deepa"});
		System.out.println("No of records updated:" +res);
	}

}
