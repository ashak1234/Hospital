package services;

import java.util.List;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import dao.AppointmentDao;
import hibernatebean.Appointment;

@Service("as")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AppointmentService {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	BeanFactory factory =  (BeanFactory)context;		
	AppointmentDao appointmentDao = (AppointmentDao)factory.getBean("a");	
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addAppointment(Appointment a) {
		appointmentDao.addAppointment (a);
	}
	
	public List<Appointment> getAllAppointments() {
		return appointmentDao.getAllAppointments();
	}

	public Appointment getAppointment(int aid) {
		return appointmentDao.getAppointment(aid);
	}
	
	public void deleteAppointment(Appointment a) {
		appointmentDao.deleteAppointment(a);
	}

	public Object getAppointmentsByName(String doctorName) {		
		return getAppointmentsByName(doctorName);
	}

}

