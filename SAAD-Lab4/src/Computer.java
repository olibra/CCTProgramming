public class Computer {
	private Processor p;
	private Modem m;
	private Monitor r;
	private String name;
	
	public Computer(){
		this.p = new Processor();
		this.m = new Modem();
		this.r = new Monitor();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return p.getSpeed();
	}

	public void setSpeed(double speed) {
		p.setSpeed(speed);
	}

	public int getCore() {
		return p.getCore();
	}

	public void setCore(int core) {
		p.setCore(core);
	}

	public String getBandSpeed() {
		return m.getBandSpeed();
	}

	public void setBandSpeed(String bandSpeed) {
		m.setBandSpeed(bandSpeed);
	}

	public String getConnet() {
		return m.getConnet();
	}

	public void setConnet(boolean connet) {
		m.setConnet(connet);
	}

	public int getSize() {
		return r.getSize();
	}

	public void setSize(int size) {
		r.setSize(size);
	}

	public String getMake() {
		return r.getMake();
	}

	public void setMake(String make) {
		r.setMake(make);
	}
	
	public void displayDetail(){
		System.out.println("-----Computter Details-----");
		System.out.println("Name: "+this.getName());
		System.out.println("Processor speed: "+ p.getSpeed());
		System.out.println("How many cores: "+p.getCore());
		System.out.println("Modem speed: "+m.getBandSpeed());
		System.out.println("Modem connected?: "+m.getConnet());
		System.out.println("Monitor size: "+ r.getSize());
		System.out.println("Monitor Make: "+r.getMake());
		System.out.println("---------------------------");
		System.out.println("");
	}
}
