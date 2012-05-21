package timlogger;

public class Formatter {
	protected String format;
	
	protected Formatter(){
		this.setFormat(0); 
	}
	protected Formatter(int i){
		this.setFormat(i);
	}
	
	
	protected void setFormat(int i){
		switch (i){
			case 0:	format = "SUMMARY";
			case 1:	format = "ALL";
		}
	}

}
