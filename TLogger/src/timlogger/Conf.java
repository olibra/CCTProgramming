package timlogger;
/**Conf.java
 * Purpose: the default configuration of the log message
 * @author Shiguang.Tim.Hao
 * @version 1.0 21st-05-2012
 * 
 */

class Conf{
	/**Contains Leveller, Handler, and Formatter
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
	protected Leveller l;
	protected Handler h;
	protected Formatter f;
	
	/**String, local variable, the name of the log file*/
	protected String logFile = "Tim Logger.txt";
	
	/**String, local variable, hold the class name of where the error message come from*/
	protected String className;
	
	/**String, local variable, hold the package name of where the error message come from*/
	protected String packageName;
	
	/**Constructor with default values, which are level is Error, format is SUMMARY and HANDLER is CONSOLE
	 */
	protected Conf(){
		this.l = new Leveller(0);					
		this.f = new Formatter(0);
		this.h = new Handler(2);
		this.className = "Unknown";
		this.packageName = "Unknown";
	}
}