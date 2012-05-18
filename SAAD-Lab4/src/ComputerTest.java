public class ComputerTest {
	public static void main(String [] args){
		Computer c = new Computer();
		c.setName("PC-one");
		c.displayDetail();
		
		c.setName("PC - two");
		c.setCore(16);
		c.setSize(42);
		c.setConnet(true);
		c.setBandSpeed("25mb");
		c.setMake("Apple");
		c.displayDetail();
	}
}
