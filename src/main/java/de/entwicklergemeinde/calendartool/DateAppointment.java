package de.entwicklergemeinde.calendartool;

import java.util.Date;

public class DateAppointment {

	private Date appointmentDate;
	private String dateName;
	private String dateCategory;
	private String dateDescription;
	private String dateOwner;

	public DateAppointment(Date appointmentDate, String dateName) {
		this.appointmentDate = appointmentDate;
		this.dateName = dateName;
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
