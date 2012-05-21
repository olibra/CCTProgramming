package timlogger;

public class Leveler{
	
	protected String level;
	
	protected Leveler(int i){
		this.setLevel(i);
	}
	
	protected void setLevel(int i){
		if (i == 0) this.level = "ERROR";
		if (i == 1) this.level = "WARNING";
		if (i == 2) this.level = "SEVERE";
	}
	protected String getLeveler(){
		return this.level;
	}
}