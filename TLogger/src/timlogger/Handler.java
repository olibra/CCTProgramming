package timlogger;
/**Handler.java
 * Purpose: set how to handle of the log message
 * @author Shiguang.Tim.Hao
 * @version 1.0 21st-05-2012
 * 
 */

class Handler {
	/**Integer, local variable, hold the option of how to handle log message
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
	 * @param i integer, the option of how to handle the log message{@value 0 1 2}
	 */
	protected Handler(int i){
		this.option =i;
	}

	/**set the option with different value
	 * 
	 * @param i integer, the option of how to handle the log message{@value 0 1 2}
	 */
	protected void setHandler(int i){
		this.option = i;
	}
	
}
