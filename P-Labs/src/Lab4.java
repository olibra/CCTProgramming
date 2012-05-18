public class Lab4 {
	
	public String s = "this is first variable.";
	public int k = 6;
	
	private double d = 3.14;
	private int i = 100;
	
	public Lab4(){
		printString();
		printInt();
		System.out.println(cal(k, i, i));
		exit();
	}
	public void printString(){
		System.out.println(s);
	}
	private void printInt(){
		System.out.println(i);
	}
	public int cal(int a, int b, int d){
		return (a+b+d);
	}
	private void exit(){
		System.out.println("Let's end this program.");
	}
	public static void main(String args []){
		new Lab4();
	}
}
