package de.entwicklergemeinde.calendartool;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DateProvider {

	private List<DateAppointment> dateAppointments = new ArrayList<DateAppointment>();

	public void addDate(DateAppointment dateAppointment) {
		dateAppointments.add(dateAppointment);
	}

	public List<DateAppointment> getDatesForToday() {
		List<DateAppointment> result = new ArrayList<DateAppointment>();
		Calendar cal = Calendar.getInstance();
		for (DateAppointment dateAppointment : dateAppointments) {
			Calendar calAppointment = Calendar.getInstance();
			calAppointment.setTime(dateAppointment.getAppointmentDate());
			if (cal.equals(calAppointment))
				result.add(dateAppointment);
		}
		return result;
	}

}
