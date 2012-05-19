
public class EpochTesting {
  public static void  main(String arg[]) throws InterruptedException {
  // Getting the current epoch time
		  long epoch = System.currentTimeMillis();
		  System.out.println("Epoch time =>"+ epoch);
		  
		  int i = (int)(Math.random()*100);
		  System.out.println(i);
		  Thread.sleep(i);

		  long epoch2 = System.currentTimeMillis();
		  System.out.println("Epoch time =>"+ epoch2);
  }
}