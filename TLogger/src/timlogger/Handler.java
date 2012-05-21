package timlogger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Handler {

	private int option;
	private String fileName;
	private PrintWriter pw = null; 
	
	protected Handler(){
		this.option = 2;
	}
	
	protected Handler(int i){
		this.option =i;
	}
	
	protected void write(){
		if (this.option == 2){
			this.writeToConsole();
		}
		if (this.option == 1){
			this.writeToFile();
		}
		if (this.option == 0){
			this.writeToConsole();
			this.writeToFile();
		}
	}
	
	protected void writeToConsole(){
		System.out.println("Message from Handler....");
		System.out.println("Message from Handler....");
		System.out.println("Message from Handler....");
	}
	
	protected void writeToFile(){
			
			try {
				FileWriter logFile = new FileWriter(fileName, true);
				//If the file already exists, start writing at the end of it.
				pw = new PrintWriter(logFile);
				pw.print("line 1\t\t");
				pw.write("sdiguskldg");
				pw.println();
				pw.println();
				pw.flush();
				pw.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {  
				//Double check, and close the PrintWriter AGAIN.
				if (pw != null)
					pw.close();
			}
	}
}
