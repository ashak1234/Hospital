package hibernatebean;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Appointment {
	private int aid;
	private String firstName;
	private String lastName;	
	private String dept;
	private String doctor;	
	private String day;
	private String time;
	private String reason;
	private String email;
	private String mobile;
	private String address;
	private String contactType;
	private String pending;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
		public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getPending() {
		return pending;
	}
	public void setPending(String pending) {
		this.pending = pending;
	}	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	@Override
	public String toString() {
		return "Appointment [aid=" + aid + ", firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept
				+ ", doctor=" + doctor + ", date=" + day + ", time=" + time + ", reason=" + reason + ", email=" + email
				+ ", mobile=" + mobile + ", address=" + address + ", contactType=" + contactType + ", pendingType="
				+ pending + "]";
	}
	
	
	
	
}
