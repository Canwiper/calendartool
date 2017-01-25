package de.entwicklergemeinde.calendartool.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Appointments
 *
 */
@Entity
public class Appointment implements Serializable {

	private static final long serialVersionUID = 1L;

	public Appointment() {
		super();
	}

	@Id
	@GeneratedValue
	private long id;

	private Date appointmentDate;
	private String dateName;
	private String dateCategory;
	private String dateDescription;
	private String dateOwner;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getDateName() {
		return dateName;
	}

	public void setDateName(String dateName) {
		this.dateName = dateName;
	}

	public String getDateCategory() {
		return dateCategory;
	}

	public void setDateCategory(String dateCategory) {
		this.dateCategory = dateCategory;
	}

	public String getDateDescription() {
		return dateDescription;
	}

	public void setDateDescription(String dateDescription) {
		this.dateDescription = dateDescription;
	}

	public String getDateOwner() {
		return dateOwner;
	}

	public void setDateOwner(String dateOwner) {
		this.dateOwner = dateOwner;
	}

}
