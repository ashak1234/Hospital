package dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
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
	
	protected Session getSession() {
		return ht.getSessionFactory().getCurrentSession();
	}
	
	public void saveAppointment(Appointment a){
		a.setPending("yes");			
		getHt().save(a);			
	}		
	
	@SuppressWarnings("unchecked")
	public List<Appointment> getAllAppointments(){		 
		return  (List<Appointment>)getSession().createCriteria(Appointment.class).list();				 		
	}
	
	public void addAppointment(Appointment a){		
		getSession().saveOrUpdate(a);		
	}	
	
	public Appointment getAppointment(int empid) {
		return (Appointment) getSession().get(Appointment.class, empid);
	}
	
	public void deleteAppointment(Appointment a) {
		getSession().createQuery("DELETE FROM Appointment WHERE aid = "+a.getAid()).executeUpdate();
	}
	
	public List<Appointment> getAppointmentsByName(String doctor){
		System.out.println("doctor");
		List<Appointment> userList = ht.find("from Appointment a  where a.doctor = ?",new Object[]{doctor}); 
		if (userList.isEmpty()) {
			System.out.println("retruning null");
			return null;
		}		
		System.out.println(userList);
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
	
}
