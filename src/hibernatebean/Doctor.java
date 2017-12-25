package hibernatebean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="doctor")
public class Doctor {
	@Id @GeneratedValue
	@Column(name="rid")
	private int rid;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private int numOfAppointments;
	private int numOfRecords;
	private String dept;
	//private String numOfPatients;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getNumOfAppointments() {
		return numOfAppointments;
	}
	public void setNumOfAppointments(int numOfAppointments) {
		this.numOfAppointments = numOfAppointments;
	}
	public int getNumOfRecords() {
		return numOfRecords;
	}
	public void setNumOfRecords(int numOfRecords) {
		this.numOfRecords = numOfRecords;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}
