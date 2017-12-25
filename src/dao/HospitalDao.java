package dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class HospitalDao{
	HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
		System.out.println("Hello from Hospital Setter of hibernate template");
	}
}