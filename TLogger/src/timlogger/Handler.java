package timlogger;
/**Handler.java
 * Purpose: set how to handle of the log message
 * @author Shiguang.Tim.Hao
 * @version 1.0 21st-05-2012
 * 
 * <p>And A list of the options:
 * <p>
 * <p>Leveller:
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

class Handler {
	/**Integer, local variable, hold the option of how to handle log message 
	 */
	protected int option;
	
	/**Constructor with option value
	 * 
	 * @param i integer, the option of how to handle the log message
	 */
	protected Handler(int i){
		this.option =i;
	}

	/**set the option with different value
	 * 
	 * @param i integer, the option of how to handle the log message
	 */
	protected void setHandler(int i){
		this.option = i;
	}
	
}
