package timlogger;

public class TimLogger {
	private Conf c;
	
	protected TimLogger(){
		this.c = new Conf();
	}
	
	protected TimLogger(int a, int b, int c){
		this.c = new Conf(a,b,c);
	}
	
	protected void writeLog(){
		c.h.write(c.fileName);
	}
	
}
