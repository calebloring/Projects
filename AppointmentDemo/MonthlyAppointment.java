package appointment;

import java.util.ArrayList;

public class MonthlyAppointment extends Appointment {
	
	/**
	 * Creates an appointment from the Appointment superclass.
	 * @param year
	 * @param month
	 * @param day
	 * @param notes
	 */
	public MonthlyAppointment(int year, int month, int day, ArrayList<String> notes) {
		super(year, month, day, notes);
	}
	
	/**
	 * Overrides the occursOn to  return true
	 * if the day of the month matches since 
	 * the appointment is monthly.
	 */
	@Override
	public boolean occursOn(int year, int month, int day) {
		if (getDay()==day) {
			return true;
		}
		else {
			return false;
		}		
	}

}
