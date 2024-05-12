package appointment;

import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentDemo {
	
	

	public static void main(String[] args) {
		String note1 = new String("Blood Pressure Check");
		String note2 = new String("Visit to grandma");
		ArrayList<String> nList = new ArrayList<String>(); //daily
		nList.add(note1);
		nList.add(note2);
		
		String note4 = new String("exercise");
		String note5 = new String("go to school");
		ArrayList<String> nList2 = new ArrayList<String>(); //daily
		nList2.add(note4);
		nList2.add(note5);	
		
		String note6 = new String("call cousin");
		ArrayList<String> nList3 = new ArrayList<String>();  //monthly
		nList3.add(note6);
		
		String note7 = new String("Doctor");
		ArrayList<String> nList4 = new ArrayList<String>(); //monthly
		nList4.add(note7);
		
		String note8 = new String("movie");
		ArrayList<String> nList5 = new ArrayList<String>(); //one time
		nList5.add(note8);
		
		String note9 = new String("movie #2");
		ArrayList<String> nList6 = new ArrayList<String>(); //one time
		nList6.add(note9);
		


		
		Appointment[] appointmentList;    
		appointmentList = new Appointment[6]; 
		
		DailyAppointment d = new DailyAppointment(2022,10,10,nList);
		DailyAppointment d2 = new DailyAppointment(2011,2,19,nList2);
		MonthlyAppointment m = new MonthlyAppointment(2016,12,12,nList3);
		MonthlyAppointment m2 = new MonthlyAppointment(2007,5,13,nList4);
		OneTimeAppointment o = new OneTimeAppointment(2019,2,21,nList5);
		OneTimeAppointment o2 = new OneTimeAppointment(2021,10,30,nList6);
		
		appointmentList[0]= d;
		appointmentList[1]= d2;
		appointmentList[2]= m;
		appointmentList[3]= m2;
		appointmentList[4]= o;
		appointmentList[5]= o2;
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter a Year");
	    int year = sc.nextInt();
	    
	    System.out.println("Enter a Month");
	    int month = sc.nextInt();
	    
	    System.out.println("Enter a Day");
	    int day = sc.nextInt();
	    sc.close();
	    
	    System.out.println("You have the following appointments on "
    			+ month+"/"+day+"/"+year+": ");
	    
	    for (Appointment a : appointmentList) {
	    	if(a.occursOn(year, month, day)) {
	    		for (int i=0;i<a.getNumNotes();i++)
	    		System.out.println(a.getNote(i));
	    	}
	    }
		
	}
	
}
