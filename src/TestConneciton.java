import java.util.Iterator;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Appointment;
import dao.AppointmentDao;

public class TestConneciton {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-hibernate.xml");
		BeanFactory factory =  (BeanFactory)context;
		AppointmentDao dao = (AppointmentDao) factory.getBean("a");
		
		Iterator itr = (Iterator) dao.getAllAppointments();
		while(itr.hasNext()){
			Appointment appt = (Appointment) itr.next();
			System.out.println(appt);
		}
	}

}
