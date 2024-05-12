package appointment;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class AppointmentTest {
	String note1;
	String note2;
	String note3;
	ArrayList<String> nList;
	Appointment a;

	@Before
	public void setUp() throws Exception {
		note1 = new String("Blood Pressure Check");
		note2 = new String("Visit to grandma");
		note3 = new String("Dentist");
		nList = new ArrayList<String>();
		nList.add(note1);
		nList.add(note2);
		nList.add(note3);
		a = new Appointment(2022,11,29,nList);
	}

	@Test
	public void testAppointment() {
		assertEquals("year wrong",2022, a.getYear());
		assertEquals("month wrong",11, a.getMonth());
		assertEquals("day wrong",29, a.getDay());
		assertEquals("num of notes wrong",3, a.getNumNotes());
	}

	@Test
	public void testGetYear() {
		assertEquals("year wrong",2022, a.getYear());
	}

	@Test
	public void testSetYear() {
		a.setYear(2023);
		assertEquals("year wrong",2023, a.getYear());
		assertEquals("month wrong",11, a.getMonth());
		assertEquals("day wrong",29, a.getDay());
		assertEquals("num of notes wrong",3, a.getNumNotes());
		
	}

	@Test
	public void testGetMonth() {
		assertEquals("month wrong",11, a.getMonth());
	}

	@Test
	public void testSetMonth() {
		a.setMonth(12);
		a.setYear(2023);
		assertEquals("year wrong",2023, a.getYear());
		assertEquals("month wrong",12, a.getMonth());
		assertEquals("day wrong",29, a.getDay());
		assertEquals("num of notes wrong",3, a.getNumNotes());
	}

	@Test
	public void testGetDay() {
		assertEquals("day wrong",29, a.getDay());
	}

	@Test
	public void testSetDay() {
		a.setDay(30);
		assertEquals("year wrong",2022, a.getYear());
		assertEquals("month wrong",11, a.getMonth());
		assertEquals("day wrong",30, a.getDay());
		assertEquals("num of notes wrong",3, a.getNumNotes());
	}

	@Test
	public void testGetNumNotes() {
		assertEquals("num of notes wrong",3, a.getNumNotes());
	}
	
	@Test
	public void testGetNote() {
		assertEquals("first note","Blood Pressure Check",a.getNote(0));
		assertEquals("last note","Dentist",a.getNote(2));
		assertEquals("invalid note index",null,a.getNote(10));
	}

	@Test
	public void testAddNote() {
		String note4 = new String("test note");
		String note5 = new String("test note 2");
		String note6 = new String("test note 3");
		a.addNote(note4);
		a.addNote(note5);
		a.addNote(note6);
		assertEquals("Size wrong",6,a.getNumNotes());
		assertEquals("first note","Blood Pressure Check",a.getNote(0));
		assertEquals("last note","test note 3",a.getNote(5));
	}

	@Test
	public void testRemoveNote() {
		String note4 = new String("test note");
		a.addNote(note4);
		a.removeNote(1); //removing from middle 
		assertEquals("size after remove",3,a.getNumNotes());
		assertEquals("first note","Blood Pressure Check",a.getNote(0));
		assertEquals("2nd note","Dentist",a.getNote(1));
		a.removeNote(-1);
		assertEquals("neg index remove",3,a.getNumNotes());
		a.removeNote(10);
		assertEquals("too large index remove",3,a.getNumNotes());
	}

	@Test
	public void testOccursOn() {
		assertEquals("valid date wrong",true,a.occursOn(2022, 11, 29));
		assertEquals("invalid date wrong",false,a.occursOn(2012, 10, 30));
	}

	@Test
	public void testToString() {
		System.out.println(a.toString());
	}

	@Test
	public void testPrintAppointments() {
		a.printAppointments();
	}

}
