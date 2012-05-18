import static org.junit.Assert.*;
import org.junit.Test;

public class Lab7{

	public Lab7(){
	
		boolean test = false;
		System.out.println(howMuchVat(200.00));	
		System.out.println(printlnString("Class Is Over."));
		System.out.println(printInt(10));
	}
	
	@Test
	public void myTestMethod(){
		// 46 - Is the expected result
		// howMuchVat(200) is calling the method we want to test, and passing it 200
		// 0.0 is the delta, we do not need this!
		assertEquals(46.0, howMuchVat(200), 0.0);
		assertEquals("The Message is - Class Is Over.", printlnString("Class Is Over."));
		assertEquals(3650, printInt(10));
	}

	public double howMuchVat(double amount){
		
		double result = 0.0;
		result = (amount / 100) * 23;
		return result;
	}
	
	public int printInt(int num){
		
		num = 365*num;
		return num;
	}
	
	public String printlnString(String a){
		
		String temp = "The Message is - "+a;		
		return temp;
	}

	public static void main(String[]args){
		new Lab7();
	}
}