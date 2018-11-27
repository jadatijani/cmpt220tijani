package lab10;
public class Toaster extends Appliance {
	public Toaster (double voltage, String color, String madeIn, double price) {
		super (voltage, color, madeIn, price);
	}
	public double getVoltage() {
		return super.getVoltage();
	}
	public double getPrice() {
		return super.getPrice();
	}
	public String getColor() {
		return super.getColor();
	}
}
