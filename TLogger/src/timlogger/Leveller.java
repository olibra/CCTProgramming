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
	protected String level;
	
	/**Constructor with level value
	 * 
	 * @param i integer, the level of log message
	 */
	protected Leveller(int i){
		this.setLevel(i);
	}
	
	/**set the level with different value
	 * 
	 * @param i integer, the level of log message
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