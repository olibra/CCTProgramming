package timlogger;
/**Formatter.java
 * Purpose: set the option of layout of the log message
 * @author Shiguang.Tim.Hao
 * @version 1.0 21st-05-2012
 * 
 */

class Formatter {
	/**Integer, local variable, hold the option of how to layout the log message
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
	protected int option;
	
	/**Constructor with option value
	 * 
	 * @param i integer, the option of how to layout the log message{@value 0 1}
	 */
	protected Formatter(int i){
		this.setFormat(i);
	}
	
	/**set the option with different value
	 * 
	 * @param i integer, the option of how to layout the log message{@value 0 1}
	 */
	protected void setFormat(int i){
		this.option = i;
	}
}
