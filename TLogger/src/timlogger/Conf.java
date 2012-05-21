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