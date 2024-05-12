package appointment;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MonthlyAppointmentsTest {

	String note1;
	ArrayList<String> nList;
	MonthlyAppointment m;

	@Before
	public void setUp() throws Exception {
		note1 = new String("Blood Pressure Check");
		nList = new ArrayList<String>();
		nList.add(note1);
		m = new MonthlyAppointment(2022,11,29,nList);
	}

	@Test
	public void testOccursOn() {
		assertEquals("valid date wrong",true,m.occursOn(2022, 11, 29));
		assertEquals("zero date wrong",false,m.occursOn(0, 0, 0));
		assertEquals("future date wrong",true,m.occursOn(2050, 11, 29));
		assertEquals("past date wrong",true,m.occursOn(1958, 11, 29));
	}

}
