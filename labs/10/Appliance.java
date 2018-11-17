package lab10;
public class Appliance {
	private double voltage;
	private String color;
	private String madeIn;
	private double price;
	
	public Appliance (double voltage, String color, String madeIn, double price) {
		this.voltage = voltage;
		this.color = color;
		this.madeIn = madeIn;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getVoltage() {
		return voltage;
	}
	public String getColor() {
		return color;
	}
	public String getMadeIn() {
		return madeIn;
	}
	public int CompareTo(Object o) {
		if(this.equals(o))
			return 1;
		else 
			return 0;
	}
}
