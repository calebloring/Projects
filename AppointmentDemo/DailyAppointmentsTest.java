package appointment;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class DailyAppointmentsTest {
	String note1;
	ArrayList<String> nList;
	DailyAppointment d;

	@Before
	public void setUp() throws Exception {
		note1 = new String("Blood Pressure Check");
		nList = new ArrayList<String>();
		nList.add(note1);
		d = new DailyAppointment(2022,11,29,nList);
	}

	@Test
	public void testOccursOn() {
		assertEquals("valid date wrong",true,d.occursOn(2022, 11, 29));
		assertEquals("zero date wrong",true,d.occursOn(0, 0, 0));
		assertEquals("future date wrong",true,d.occursOn(2050, 4, 15));
		assertEquals("past date wrong",true,d.occursOn(1958, 8, 28));
	}

}
