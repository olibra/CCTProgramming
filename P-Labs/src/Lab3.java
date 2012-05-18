import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Lab3 {

	public static void main(String args[]) {
		 try {
			 
			  Logger logger = Logger.getLogger("Lab3");
			  FileHandler fh = new FileHandler("log_test.txt");
			  fh.setFormatter(new SimpleFormatter());
			  logger.setLevel(Level.ALL);
			  logger.addHandler(fh);
		
			  logger.log(Level.WARNING , "			\"WARNING\" is a message level indicating a potential problem.");
			  logger.log(Level.INFO , "			\"INFO\" is a message level for informational messages.");
			  logger.log(Level.SEVERE , "			\"SEVERE\" is a message level indicating a serious failure.");
			  
			  fh.close();
		    } catch (Exception e) {
		      System.out.println("Exception thrown: " + e);
		      e.printStackTrace();
		    }	
	}

}