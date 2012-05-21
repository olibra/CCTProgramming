package timlogger;

public class TimLogger {
	private Conf c;
	
	protected TimLogger(){
		this.c = new Conf();
	}
	
	protected void writeLog(){
		c.h.writeToConsole();
	}
	
}
