package timlogger;

import java.awt.Toolkit;

public class BeepTesting{

    public BeepTesting() throws InterruptedException{
 
	        Toolkit.getDefaultToolkit().beep();
	        
	        Thread.sleep(2000);
	        
	        Toolkit.getDefaultToolkit().beep();
    }

    public static void main(String[] args) throws InterruptedException{

    	//get current method
    	System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		
    	//get package name
		System.out.println((new BeepTesting()).getClass().getPackage().getName());
		
		//get class name
		System.out.println(BeepTesting.class.getSimpleName());
		
    }
}