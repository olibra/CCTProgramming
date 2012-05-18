import java.lang.reflect.*;

public class Lab4Test {
	public Lab4Test(){
		getMethod();
	}
	public void getMethod(){
		try{

			Class c = Class.forName("Lab4");
			
			System.out.println("*****************************************");
			
			
			Class partypes[] = new Class[3];
            partypes[0] = Integer.TYPE;
            partypes[1] = Integer.TYPE;
            partypes[2] = Integer.TYPE;
            Method meth = c.getMethod(
              "cal", partypes);
		       
            Lab4 methobj = new Lab4();
            Object arglist[] = new Object[3];
            arglist[0] = new Integer(2345);
            arglist[1] = new Integer(4567);
            arglist[2] = new Integer(3088);
            
            System.out.println("*****************************************");
			System.out.println("Now, let us try to use the method in that class:");
            System.out.println("To call the method from original class to add 3 integers--->\n");
            
            Object retobj = meth.invoke(methobj, arglist);
            Integer retval = (Integer)retobj;
            System.out.println(retval.intValue());
            
			System.out.println("*****************************************\n");
			System.out.println("the methods in this class: \n");
			Method m[] = c.getDeclaredMethods();
			for(int i = 0;i<m.length;i++){
				System.out.println(m[i].toString());
			}
			System.out.println("*****************************************\n");
			System.out.println("And all the variables are:\n");
			Field fieldList [] = c.getDeclaredFields();
			for(int l = 0;l<fieldList.length;l++){
				Field fld = fieldList[l];
				System.out.println(fld.getName());
				System.out.println(fld.getDeclaringClass());
				System.out.println(fld.getType());
				int mod = fld.getModifiers();
				System.out.println(Modifier.toString(mod));
				System.out.println("\n");
			}
		}
		catch(Throwable e){
			System.err.println(e);
		}
	}
	public static void main(String args[]){
		new Lab4Test();
	}
}
