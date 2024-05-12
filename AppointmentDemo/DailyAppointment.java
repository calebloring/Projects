package appointment;

import java.util.ArrayList;

public class DailyAppointment extends Appointment {
	
	/**
	 * Creates an appointment from the Appointment superclass.
	 * @param year
	 * @param month
	 * @param day
	 * @param notes
	 */
	public DailyAppointment(int year, int month, int day, ArrayList<String> notes) {
		super(year, month, day, notes);
	}
	
	/**
	 * Overrides the occursOn to always return true,
	 * since a daily appointment occurs every day.
	 */
	@Override
	public boolean occursOn(int year, int month, int day) {
		return true;
	}

}
