package timlogger;
/**Leveler.java
 * Purpose: set the level of the log message
 * @author Shiguang.Tim.Hao
 * @version 1.0 21st-05-2012
 * 
 */

class Leveller{
	/**String, local variable, hold the level of log message
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
	protected String level;
	
	/**Constructor with level value
	 * 
	 * @param i integer, the level of log message{@value 0 1 2}
	 */
	protected Leveller(int i){
		this.setLevel(i);
	}
	
	/**set the level with different value
	 * 
	 * @param i integer, the level of log message{@value 0 1 2}
	 */
	protected void setLevel(int i){
		if (i == 0) this.level = "ERROR";
		if (i == 1) this.level = "WARNING";
		if (i == 2) this.level = "SEVERE";
	}
	
	/**Get the value of log message
	 * 
	 * @return String, the level of the log message
	 */
	protected String getLeveller(){
		return this.level;
	}
}