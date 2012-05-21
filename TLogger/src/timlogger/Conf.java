package timlogger;

class Conf{
	
	protected Leveler l;
	protected Handler h;
	protected Formatter f;
	protected String logFile = "Tim Logger.txt";
	
	protected String className;
	protected String packageName;
	
	protected Conf(){
		this.l = new Leveler(0);
		this.f = new Formatter(0);
		this.h = new Handler(2);
		this.className = "Unknown";
		this.packageName = "Unknown";
	}
}