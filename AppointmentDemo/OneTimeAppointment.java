package appointment;

import java.util.ArrayList;

public class OneTimeAppointment extends Appointment{
	
	/**
	 * Creates an appointment from the Appointment superclass.
	 * @param year
	 * @param month
	 * @param day
	 * @param notes
	 */
	public OneTimeAppointment(int year, int month, int day, ArrayList<String> notes) {
		super(year, month, day, notes);
	}
}
