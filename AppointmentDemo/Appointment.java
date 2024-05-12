package appointment;

import java.util.ArrayList;


/**
 * This class is the superclass of all the types of appointments.
 * 
 * @author Caleb Loring
 * @version Nov 29, 2022
 */
public class Appointment {
	private int year;
	private int month;
	private int day;
	private ArrayList<String> notesList;
	
	/**
	 * Create the appointment object
	 * @param year
	 * @param month
	 * @param day
	 * @param notes
	 */
	
	public Appointment(int year, int month, int day, ArrayList<String> notes) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.notesList=notes;
	}
	
	
	/**
	 * Returns the year of the appointment
	 * @return year
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Sets the year 
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * Returns the month of the appointment
	 * @return month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Sets the month
	 * @param month
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * Returns the day of the appointment
	 * @return day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Sets the day
	 * @param day
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * Returns the size of the ArrayList containing the notes
	 * @return noteList size
	 */
	public int getNumNotes() {
		return notesList.size();
	}
	
	/**
	 * Returns the note at the given index
	 * @param index
	 * @return note
	 */
	public String getNote(int index) {
        if (index >= 0 && index < notesList.size()) {
            String s = notesList.get(index);
            return s;
        }
        else {
            System.out.println("Error: No note at index " + index + ".");
            return null;
        }
    }

	/**
	 * Adds a note to the end of the noteList
	 * @param note
	 */
	public void addNote(String note) {
        notesList.add(note);
    }
	
	/**
	 * Removes the note at the given index. Method 
	 * checks if there is a note at the given index. 
	 * @param index
	 */
	public void removeNote(int index) {
        if (index >= 0 && index < notesList.size()) {
            notesList.remove(index);
        }
        else {
            System.out.println("Error: No note at index " + index + ".");
        }
    }
	
	/**
	 * Checks if there is a scheduled appointment on a specific day.
	 * @param year
	 * @param month
	 * @param day
	 * @return true if there is an appointment, false if not.
	 */
	public boolean occursOn(int year, int month, int day) {
		if (getYear()==year && getMonth()==month && getDay()==day) {
			return true;
		}
		else {
			return false;
		}		
	}

	/**
	 * Creates a string with the date of an appointment.
	 * @return String with the date
	 */
	@Override
	public String toString() {
		return "You have the following appointments" + month + "/" 
					+ day + "/" + year + ":";	
	}
	
	/**
	 * Prints out tee date of the appointment and 
	 * all the notes associated with that date.
	 */
	public void printAppointments() {
		System.out.println(toString());
		for (String s : notesList) {
			System.out.println(s);
		}
	}
	
	
	
}
