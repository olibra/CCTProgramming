package timlogger;

public class Leveler{
	
	private String level;
	
	private void setLevel(int i){
		switch (i){
			case 0:	level = "WEVERE";
			case 1:	level = "WARNING";
			case 2: level = "ERROR";
		}
	}
}