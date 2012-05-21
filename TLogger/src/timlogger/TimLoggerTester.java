package timlogger;

import java.io.FileWriter;

/**TimLoggerTester.java
 * Purpose: Test timLogger
 * @author Shiguang.Tim.Hao
 * @version 1.0 21st-05-2012
 * 
 * And A list of the options:
	 * Leveller: 			0 - ERROR
	 * 						1 - WARNING
	 * 						2 - SEVERE
	 * 
	 * Formatter:			0 - SUMMARY
	 * 						1 - DETAIL
	 * 
	 * Handler:				0 - Console and file
	 * 						1 - file
	 * 						2 - Console			
	 * 
 * 
 */
public class TimLoggerTester {
	/**Main class*/
	public static void main(String [] args){
		
		/**Create a new object of TimLogger class*/
		TimLogger t = new TimLogger();

		/**Save the current method name to Conf*/
		t.setClassName(Thread.currentThread().getStackTrace()[1].getMethodName());

		/**Save the current package name to Conf*/
		t.setPackageName(TimLoggerTester.class.getName());

		/**Try to play a start sound, log error if there is any*/
		try {
			t.startSound();
		} catch (Exception e) {
			t.writeLog(1, 0, 2, "Start Sound is not working!!!");
		}

		/**Try to write file, WILL give a error, log the error message*/
		try {
			FileWriter logFile = new FileWriter("No One Can write Me.txt", true);
		} catch (Exception e) {
			t.writeLog(2, 1, 0, "Can not access file!");
		}
		
		/**Try to play a finish sound, log error if there is any*/
		try {
			t.finishSound();
		} catch (Exception e) {
			t.writeLog(0, 1, 1, "Finish Sound is not working!!!");
		}
		
		
	}
}
