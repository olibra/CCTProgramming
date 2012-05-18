public class Modem {
	private String bandSpeed;
	private boolean connet;
	
	public Modem(){
		bandSpeed = "10mb";
		connet = false;
	}
	public Modem(String bandSpeed, boolean connet){
		this.bandSpeed = bandSpeed;
		this.connet = connet;
	}
	
	public String getBandSpeed() {
		return bandSpeed;
	}
	public void setBandSpeed(String bandSpeed) {
		this.bandSpeed = bandSpeed;
	}
	public String getConnet() {
		String s;
		if(connet) s = "Yes";
		else s = "No";
		return s;
	}
	public void setConnet(boolean connet) {
		this.connet = connet;
	}
}
