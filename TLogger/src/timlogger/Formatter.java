package timlogger;

public class Formatter {
	
	protected int option;
	
	protected Formatter(int i){
		this.setFormat(i);
	}
	
	protected void setFormat(int i){
		this.option = i;
	}
}
