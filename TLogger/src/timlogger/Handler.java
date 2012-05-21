package timlogger;

public class Handler {

	private String where;
	
	private Handler(int i){
		if (i == 0){
			this.where = "Both";
		}
		if (i == 1){
			this.where = "File";
		}
		if (i == 2){
			this.where = "Console";
		}
	}
	
	private void write(int i){
		if (i == 0){
			this.where = "Both";
		}
		if (i == 1){
			this.where = "File";
		}
		if (i == 2){
			this.where = "Console";
		}
	}
}
