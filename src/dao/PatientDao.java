package dao;  

import org.springframework.orm.hibernate3.HibernateTemplate;

import bean.Patient;

import java.util.*;  

public class PatientDao {  
	
HibernateTemplate template;  

public void setTemplate(HibernateTemplate template) {  
    this.template = template;  
}  
//method to save employee  
public void savePatient(Patient e){  
    template.save(e);  
}  
//method to update employee  
public void updatePatient(Patient e){  
    template.update(e);  
}  
//method to delete employee  
public void deletePatient(Patient e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Patient getById(int pid){  
	Patient p = (Patient)template.get(Patient.class,pid);  
    return p;  
}  
//method to return all employees  
public List<Patient> getPatients(){  
    List<Patient> list=new ArrayList<Patient>();  
    list=template.loadAll(Patient.class);  
    return list;  
}  

public HibernateTemplate getHibernateTemplate() {
	return template;
}

public void setHibernateTemplate(HibernateTemplate template) {
	this.template = template;
	System.out.println("Hello from Register Setter of hibernate template");
}


}  