package timlogger;

public class Conf{
	
	protected Leveler l;
	protected Handler h;
	protected Formatter f;
	protected String fileName = "Tim Logger.txt";
	
	protected Conf(){
		this.l = new Leveler();
		this.h = new Handler();
		this.f = new Formatter();
	}
	
	protected Conf(int a, int b, int c){
		this.l = new Leveler(a);
		this.h = new Handler(b);
		this.f = new Formatter(c);
	}
	
}