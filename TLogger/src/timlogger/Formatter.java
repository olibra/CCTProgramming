package timlogger;

public class Formatter {
	private String format;
	
	private Formatter(){
		this.setFormat(0); 
	}
	private Formatter(int i){
		this.setFormat(i);
	}
	
	private void setFormat(int i){
		switch (i){
			case 1:	format = "ALL";
			case 0:	format = "SUMMARY";
		}
	}

}
