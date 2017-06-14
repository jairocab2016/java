package solo.learn;

public class Vehicle {
	
	private String color;
	
	public Vehicle () {
		this.setColor("Rojo");
	}
	
	public Vehicle (String c) {
		
		this.setColor(c);		
	}
	
	public void setColor(String c) {
		
		this.color = c;
	}
	
	public String getColor() {
		
		return color;
	}

}
