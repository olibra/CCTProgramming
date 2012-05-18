/**
 * Car.java
 * Purpose: example of JavaDoc
 *
 * @author Shiguang.Tim.Hao
 * @version 1.0 18th May 2012
 */

public class Car {
	
	String name;
	String color;
	Double engine;
	
	/**
	 *Public constructor, and run methods by default.
	 * 
	 */
	public Car(){
		this.setName("Toyata");
		this.setColorAndEngine("Red", 1.8);
		this.getName();
		this.getColor();
		this.getEngine();
		this.stopCar();
	}
	
    /**
     * Setup the name for the car.
     *
     * @param a String The name of the car.
     */
	public String setName(String a){
		return this.name = a;
	}
	
	/**
	 * Print out the name of the car to the console.
	 */
	public void getName(){
		System.out.println("The name of this Car is "+this.name);
	}

    /**
     * Setup the color and engine for the car.
     * @param c String The color of the car.
     * @param e Double The size of the engine of the car.
     */
	public void setColorAndEngine(String c, Double e){
		this.engine = e;
		this.color = c;
	}
	
    /**
     * Print out the color of the car to the console.
     */
	public void getColor(){
		System.out.println("The color of this Car is "+this.color);
	}
	
	/**
     * Print out the engine of the car to the console.
     */
	public void getEngine(){
		System.out.println("The engine of this Car is "+this.engine);
	}
	
	/**
     * Stop the car to the console.
     */
	private void stopCar(){
		System.out.println(">>>>>...");
	}
	
    /**
     * The main method begins, create a new car class.
     *
     * @param args not used
     */
	public static void main(String [] args){
		new Car();
	}
}
