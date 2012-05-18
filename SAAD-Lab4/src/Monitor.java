public class Monitor {
	private int size;
	private String make;
	
	public Monitor(){
		this.size = 15;
		this.make = "Dell";
	}
	public Monitor(int size, String make){
		this.size = size;
		this.make = make;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
}
