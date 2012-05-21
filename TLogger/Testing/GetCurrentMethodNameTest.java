
public class GetCurrentMethodNameTest {

	     public static void main(String args[]) {
	        new GetCurrentMethodNameTest().doit();
	     }
	     
	     public void doit() {
	        System.out.println(
	           Thread.currentThread().getStackTrace()[1].getMethodName()); // output : doit
	     }
}
