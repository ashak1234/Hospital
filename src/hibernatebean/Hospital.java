package hibernatebean;

import javax.persistence.*;

@Entity 
@Table(name="hospitalInfo")
public class Hospital {
	@Id@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="doctorCnt")
	private int doctorCnt;
	@Column(name="patientCnt")
	private int patientCnt;
	@Column(name="appointmentCnt")
	private int appointmentCnt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getDoctorCnt() {
		return doctorCnt;
	}
	public void setDoctorCnt(int doctorCnt) {
		this.doctorCnt = doctorCnt;
	}
	public int getPatientCnt() {
		return patientCnt;
	}
	public void setPatientCnt(int patientCnt) {
		this.patientCnt = patientCnt;
	}
	public int getAppointmentCnt() {
		return appointmentCnt;
	}
	public void setAppointmentCnt(int appointmentCnt) {
		this.appointmentCnt = appointmentCnt;
	}
	
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", location=" + location + ", doctorCnt=" + doctorCnt
				+ ", patientCnt=" + patientCnt + ", numOfAppointments=" + appointmentCnt + "]";
	}
	

}

	