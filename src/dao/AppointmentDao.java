package dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import hibernatebean.Appointment;
import hibernatebean.Doctor;
import hibernatebean.DoctorLogin;

public class AppointmentDao {
	
	HibernateTemplate ht;	
	Doctor doctor = new Doctor();
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
		System.out.println("Hello from Setter of hibernate template");
	}
	
	public void addAppointment(Appointment a){
		a.setPending("yes");			
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
	
	public List<Appointment> getAppointmentsByName(String doctor){
		List<Appointment> userList = ht.find("from Appointment a  where a.doctor = ?",new Object[]{doctor}); 
		if (userList.isEmpty()) {
			System.out.println("retruning null");
			return null;
		}		
		return userList;
	}

	public List<Appointment> getAllPendingRequests(String Doctor) {
		List<Appointment> pendingList = ht.find("from Appointment a  where a.pending = 'yes' and a.doctor=?",new Object[]{doctor}); 
		if (pendingList.isEmpty()) {
			System.out.println("retruning null");
			return null;
		}		
		return pendingList;
	}	
	
	public void remove(Appointment a){		
		ht.delete(a);
		System.out.println("Deleted appointment for"+a.getFirstName());
	}
}
