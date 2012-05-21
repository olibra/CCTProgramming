package timlogger;

import java.util.Date;

import java.awt.Toolkit;

public class BeepTesting{

    public BeepTesting() throws InterruptedException{
		
    	whatIsMyName();
		getPackageName();
 
	        Toolkit.getDefaultToolkit().beep();
	        
	        Thread.sleep(2000);
	        
	        Toolkit.getDefaultToolkit().beep();
    }
    public void whatIsMyName() {
        System.out.println(
 	           Thread.currentThread().getStackTrace()[1].getMethodName()); // output : doit
 	     }
	public void getPackageName(){
		     Package pack = (new Date()).getClass().getPackage();
		     String packageName = pack.getName();
		     System.out.println("Package Name = " + packageName);
	     }

    public static void main(String[] args) throws InterruptedException{

		BeepTesting o = new BeepTesting();
		String packageName = o.getClass().getPackage().getName();
		System.out.println("Package Name = " + packageName);
		
    }
}