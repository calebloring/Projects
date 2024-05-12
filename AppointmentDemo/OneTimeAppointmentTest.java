package appointment;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class OneTimeAppointmentTest {

	String note1;
	ArrayList<String> nList;
	OneTimeAppointment o;

	@Before
	public void setUp() throws Exception {
		note1 = new String("Blood Pressure Check");
		nList = new ArrayList<String>();
		nList.add(note1);
		o = new OneTimeAppointment(2022,11,29,nList);
	}

	@Test
	public void testOccursOn() {
		assertEquals("valid date wrong",true,o.occursOn(2022, 11, 29));
		assertEquals("zero date wrong",false,o.occursOn(0, 0, 0));
		assertEquals("future date wrong",false,o.occursOn(2050, 4, 15));
		assertEquals("past date wrong",false,o.occursOn(1958, 8, 28));
	}
}
