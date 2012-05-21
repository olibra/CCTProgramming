package timlogger;

public class Leveler{
	
	private String level;
	
	protected Leveler(){
		this.setLevel(2); 
	}
	protected Leveler(int i){
		this.setLevel(i);
	}
	
	protected void setLevel(int i){
		switch (i){
			case 0:	level = "WEVERE";
			case 1:	level = "WARNING";
			case 2: level = "ERROR";
		}
	}
	protected String getLeveler(){
		return level;
	}
}