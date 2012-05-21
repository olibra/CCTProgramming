import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFileTest{

	public static void main(String[] args) {
		
	      PrintWriter pw = null; 
	      try {

		      FileWriter logFile = new FileWriter("Log.txt", true);
		      
	        if (true) {
	          //If the file already exists, start writing at the end of it.
	          pw = new PrintWriter(logFile);
	        }
	          //this is equal to:
	          //pw = new PrintWriter(new FileWriter(filename, false));
	        pw.print("line 1");
	        pw.println("sdiguskldg");
	        pw.write("Line 2");
	      
	        pw.flush();
	      }
	      catch (IOException e) {
	        e.printStackTrace();
	      }
	      
	      finally {  
	        //Close the PrintWriter
	        if (pw != null)
	          pw.close();
	      }
	}
 }

	   
