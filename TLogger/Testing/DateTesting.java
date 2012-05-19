
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class DateTesting {
   public static void main(String args[]) throws InterruptedException{
	   
	   for (int l = 0; l<5; l++){
		   Date date = Calendar.getInstance().getTime();
		   DateFormat formatter = new SimpleDateFormat("yy-MM-dd-HH-mm-ss-SSS");
		   String today = formatter.format(date);
		   System.out.println("Today : " + today);
	       
			  int i = (int)(Math.random()*1000);
			  System.out.println(i);
			  Thread.sleep(i);
			  
			  System.out.println("Finish the day......\n\n");
	   }
		       
   }
}