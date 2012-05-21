package timlogger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.Toolkit;


class TimLogger {
	
	private Conf c;
	private PrintWriter pw = null; 
	
	protected TimLogger(){
		this.c = new Conf();
	}
	
	protected void startSound() throws InterruptedException{
		 
        Toolkit.getDefaultToolkit().beep();
        Thread.sleep(300);
        Toolkit.getDefaultToolkit().beep();
        Thread.sleep(4000);
	}
	
	protected void finishSound() throws InterruptedException{
		 
        Toolkit.getDefaultToolkit().beep();
        Thread.sleep(500);
        Toolkit.getDefaultToolkit().beep();
        Thread.sleep(300);
        Toolkit.getDefaultToolkit().beep();
	}

	protected String getLeveler(){
		return this.c.l.getLeveler();
	}
	protected String getID(){
		Date date = Calendar.getInstance().getTime();
		DateFormat formatter = new SimpleDateFormat("yy-MM-dd-HH-mm-ss-SSS");
		String id = formatter.format(date);
		return id;
	}
	
	protected String getEpoch() {
		long epoch = System.currentTimeMillis();
		String s = String.valueOf(epoch);
		return s;
  	}

	protected String setClassName(String s){
		return this.c.className = s;
	}
	protected String setPackageName(String s){
		return this.c.packageName = s;
	}

	protected void writeLog(int a, int b, int c, String s){	
		this.c.l.setLevel(a);
		this.c.f.setFormat(b);
		this.c.h.setHandler(c);
		
		if (this.c.h.option == 2){
			this.writeToConsole(s);
		}
		if (this.c.h.option == 1){
			this.writeToFile(s);
		}
		if (this.c.h.option == 0){
			this.writeToConsole(s);
			this.writeToFile(s);
		}
	}
	
	protected void writeToConsole(String s){
		System.out.println("-------------------------------------------------------------------");
		System.out.println("BugID\t\t\t"+getID());
		System.out.println(this.c.l.getLeveler()+"\t\t\t"+s);
		if (this.c.f.option == 1){
			System.out.println("Time\t\t\t"+getEpoch());
	    	System.out.println("Class\t\t\t"+this.c.className);
			System.out.println("Package\t\t\t"+this.c.packageName);
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	protected void writeToFile(String s){
			
			try {
				FileWriter logFile = new FileWriter(this.c.logFile, true);
				//If the file already exists, start writing at the end of it.
				pw = new PrintWriter(logFile);

				pw.println("-------------------------------------------------------------------");
				pw.println("BugID\t\t\t"+getID());
				pw.println(this.c.l.getLeveler()+"\t\t\t"+s);
				if (this.c.f.option == 1){
					pw.println("Time\t\t\t"+getEpoch());
			    	pw.println("Class\t\t\t"+this.c.className);
					pw.println("Package\t\t\t"+this.c.packageName);
				}
				pw.println("-------------------------------------------------------------------");
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
