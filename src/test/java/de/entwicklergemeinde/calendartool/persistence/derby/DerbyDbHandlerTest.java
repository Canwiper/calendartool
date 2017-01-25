package de.entwicklergemeinde.calendartool.persistence.derby;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import de.entwicklergemeinde.calendartool.persistence.IDbHandler;
import de.entwicklergemeinde.calendartool.persistence.entity.Appointment;

public class DerbyDbHandlerTest {

	private IDbHandler dbHandler = new DerbyDbHandler();

	@Test
	public void testGetAllDates() {
		assertTrue(dbHandler.getAllDates().size() > 0);
	}
	
	@Test
	public void testSaveAppointment() {
		Appointment appointment = new Appointment();
		appointment.setAppointmentDate(new Date());
		appointment.setDateCategory("Geburtstag");
		appointment.setDateName("JUnit_Test_Eintrag");
		
		dbHandler.saveAppointment(appointment);
		
		boolean testEntryCreated = false;
		
		for(Appointment dbAppointment : dbHandler.getAllDates())
		{
			if("JUnit_Test_Eintrag".equals(dbAppointment.getDateName()))
			{
				testEntryCreated = true;
				break;
			}
		}
		
		assertTrue(testEntryCreated);
	}

}
