package de.entwicklergemeinde.calendartool.persistence;

import java.util.List;

import de.entwicklergemeinde.calendartool.persistence.entity.Appointment;

public interface IDbHandler {
	
	List<Appointment> getAllDates();
	
	void saveAppointment(Appointment appointment);
	
}