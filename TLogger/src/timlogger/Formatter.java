package timlogger;

public class Formatter {
	private String format;
	
	protected Formatter(){
		this.setFormat(0); 
	}
	protected Formatter(int i){
		this.setFormat(i);
	}
	
	private void setFormat(int i){
		switch (i){
			case 1:	format = "ALL";
			case 0:	format = "SUMMARY";
		}
	}

}
