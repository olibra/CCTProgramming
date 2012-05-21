package timlogger;

import java.io.FileWriter;

/**TimLoggerTester.java
 * Purpose: Test timLogger
 * @author Shiguang.Tim.Hao
 * @version 1.0 21st-05-2012
 * 
 * <p>And A list of the options:
 * <p>
 * Leveller:
 * <p>			 			0 - ERROR
 * <p>						1 - WARNING
 * <p>						2 - SEVERE
 * <p>
 * <p>Formatter:
 * <p>						0 - SUMMARY
 * <p>						1 - DETAIL
 * <p>
 * <p>Handler:
 * <p>						0 - Console and file
 * <p>						1 - file
 * <p>						2 - Console			
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
