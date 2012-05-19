package Testing;

import java.awt.Toolkit;

public class BeepTesting{

    public BeepTesting() throws InterruptedException{

 
	        Toolkit.getDefaultToolkit().beep();
	        
	        Thread.sleep(2000);
	        
	        Toolkit.getDefaultToolkit().beep();
	        Thread.sleep(500);
	        
	        Toolkit.getDefaultToolkit().beep();
	        Thread.sleep(500);
	        
	        Toolkit.getDefaultToolkit().beep();
	        Thread.sleep(500);
	        
	        Toolkit.getDefaultToolkit().beep();
	        Thread.sleep(1000);
	        
	        Toolkit.getDefaultToolkit().beep();
    }


    public static void main(String[] args) throws InterruptedException{
    	new BeepTesting();
    }
}