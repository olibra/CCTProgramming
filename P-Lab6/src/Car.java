/**
 * 18th May 2012
 * Car.java
 * Purpose: example of JavaDoc
 *
 * @author Shiguang.Tim.Hao
 * @version 1.0
 */
public class Car {
	
	String name;
	String color;
	Double engine;
	
	
	public Car(){
		this.setName("Toyata");
		this.setColorAndEngine("Red", 1.8);
		this.getName();
		this.getColor();
		this.getEngine();
		this.stopCar();
	}
	
	public void getName(){
		System.out.println("The name of this Car is "+this.name);
	}
	
	public String setName(String a){
		return this.name = a;
	}
	
	public void setColorAndEngine(String c, Double e){
		this.engine = e;
		this.color = c;
	}
	
	public void getColor(){
		System.out.println("The color of this Car is "+this.color);
	}
	
	public void getEngine(){
		System.out.println("The engine of this Car is "+this.engine);
	}
	
	private void stopCar(){
		System.out.println(">>>>>...");
	}

	public static void main(String [] args){
		new Car();
	}
}
