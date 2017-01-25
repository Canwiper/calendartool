package de.entwicklergemeinde.calendartool;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import de.entwicklergemeinde.calendartool.DateAppointment;
import de.entwicklergemeinde.calendartool.DateProvider;

public class DatesProviderTest {

	private DateProvider testDateProvider = new DateProvider();
	
	@Before
	public void setUp() {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2017, 1, 12);

		DateAppointment dateAppointment1 = new DateAppointment(new Date(), "Test appointment");
		DateAppointment dateAppointment2 = new DateAppointment(new Date(), "Test appointment 2");
		DateAppointment dateAppointment3 = new DateAppointment(calendar.getTime(), "Test appointment 3");

		testDateProvider.addDate(dateAppointment1);
		testDateProvider.addDate(dateAppointment2);
		testDateProvider.addDate(dateAppointment3);
	}

	@Test
	public void testGetDatesForToday() {
		
		assertEquals(2, testDateProvider.getDatesForToday().size());
	}

}
