
public class Processor {
	private double speed;
	private int core;
	
	public Processor(){
		this.speed = 2.0;
		this.core = 2;
	}
	public Processor(double speed, int core){
		this.speed = speed;
		this.core = core;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getCore() {
		return core;
	}
	public void setCore(int core) {
		this.core = core;
	}
	
}