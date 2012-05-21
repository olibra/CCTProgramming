package timlogger;
/**TimLogger.java
 * Purpose: log error message
 * @author Shiguang.Tim.Hao
 * @version 1.0 21st-05-2012
 * 
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.Toolkit;


class TimLogger {

	/**contains Conf, hold the configuration file of logger
	 * PrintWriter, for write to file
	 * 
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
	 */
	private Conf c;
	private PrintWriter pw = null; 
	
	/**Constructor, set new logger with default configuration
	 */
	protected TimLogger(){
		this.c = new Conf();
	}
	
	/**Play a system sound to start*/
	protected void startSound() throws InterruptedException{
		 
        Toolkit.getDefaultToolkit().beep();
        Thread.sleep(300);
        Toolkit.getDefaultToolkit().beep();
        Thread.sleep(4000);
	}
	
	/**Play a system sound to finish*/
	protected void finishSound() throws InterruptedException{
		 
        Toolkit.getDefaultToolkit().beep();
        Thread.sleep(500);
        Toolkit.getDefaultToolkit().beep();
        Thread.sleep(300);
        Toolkit.getDefaultToolkit().beep();
	}
	
	/**@return String, Get the system time which with millisecond, to use as unique ID*/
	protected String getID(){
		Date date = Calendar.getInstance().getTime();
		DateFormat formatter = new SimpleDateFormat("yy-MM-dd-HH-mm-ss-SSS");
		String id = formatter.format(date);
		return id;
	}
	
	/**@return String, Get the Epoch time*/
	protected String getEpoch() {
		long epoch = System.currentTimeMillis()/1000;
		String s = String.valueOf(epoch);
		return s;
  	}

	/**@param s String, the class name of the error message
	 * @return String, get the class name of the error message*/
	protected String setClassName(String s){
		return this.c.className = s;
	}
	
	/**@param s String, the package name of the error message
	 * @return String, get the package name of the error message*/
	protected String setPackageName(String s){
		return this.c.packageName = s;
	}

	/**Write error log with custom setting
	 * 
	 * @param a Integer, the level of error message
	 * @param b Integer, the option of how to format the message
	 * @param c Integer, the option of how to handle the message
	 * @param s String, the message of error
	 */
	protected void writeLog(int a, int b, int c, String s){	
		this.c.l.setLevel(a);
		this.c.f.setFormat(b);
		this.c.h.setHandler(c);
		
		if (this.c.h.option == 2){
			this.writeToConsole(s);
		}
		if (this.c.h.option == 1){
			this.writeToFile(s);
		}
		if (this.c.h.option == 0){
			this.writeToConsole(s);
			this.writeToFile(s);
		}
	}
	
	/**Write error log to the console, with message s
	 * 
	 * @param s String, The message of error
	 */
	protected void writeToConsole(String s){
		System.out.println("-------------------------------------------------------------------");
		System.out.println("BugID\t\t\t"+getID());
		System.out.println(this.c.l.getLeveller()+"\t\t\t"+s);
		if (this.c.f.option == 1){
			System.out.println("Time\t\t\t"+getEpoch());
	    	System.out.println("Class\t\t\t"+this.c.className);
			System.out.println("Package\t\t\t"+this.c.packageName);
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	/**Write error log to the text file, which has been setup in configuration file, 
	 * with message s, by using FileWriter.
	 * 
	 * @param s String, the message of error
	 */
	protected void writeToFile(String s){
			
			try {
				FileWriter logFile = new FileWriter(this.c.logFile, true);
				//If the file already exists, start writing at the end of it.
				pw = new PrintWriter(logFile);

				pw.println("-------------------------------------------------------------------");
				pw.println("BugID\t\t\t"+getID());
				pw.println(this.c.l.getLeveller()+"\t\t\t"+s);
				if (this.c.f.option == 1){
					pw.println("Time\t\t\t"+getEpoch());
			    	pw.println("Class\t\t\t"+this.c.className);
					pw.println("Package\t\t\t"+this.c.packageName);
				}
				pw.println("-------------------------------------------------------------------");
				pw.flush();
				pw.close();
			}
			catch (IOException e) {
				this.writeLog(2, 1, 2,"Can Not Write To The File!");
			}
			finally {  
				//Double check, and close the PrintWriter AGAIN.
				if (pw != null)
					pw.close();
			}
	}
}
