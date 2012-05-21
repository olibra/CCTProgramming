package timlogger;

public class TimLoggerTester {
	
	public static void main(String [] args){
		TimLogger t = new TimLogger();
		
		t.setClassName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		t.setPackageName(TimLoggerTester.class.getName());

		t.writeLog(1,1,2,"sdfhskdjfgskjhdg");
	}
}
