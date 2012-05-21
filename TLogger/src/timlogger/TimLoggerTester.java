package timlogger;

import java.io.FileWriter;

public class TimLoggerTester {
	
	public static void main(String [] args){
		
		TimLogger t = new TimLogger();
		
		t.setClassName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		t.setPackageName(TimLoggerTester.class.getName());
		
		try {
			t.startSound();
		} catch (Exception e) {
			t.writeLog(1, 0, 2, "Start Sound is not working!!!");
		}

		try {
			FileWriter logFile = new FileWriter("No One Can write Me.txt", true);
		} catch (Exception e) {
			t.writeLog(2, 1, 0, "Can not access file!");
		}
		
		try {
			t.finishSound();
		} catch (Exception e) {
			t.writeLog(0, 1, 1, "Finish Sound is not working!!!");
		}
		
		
	}
}
