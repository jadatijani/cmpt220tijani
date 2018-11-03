package lab8;

public class GeometricObject {

	private String TheColor;
	private boolean isFilled;
	
	public String getcolor() {
		return TheColor;
	}
	
	public void putcolor(String c) {
		this.TheColor = c;
	}
	
	public void setFill (boolean fill) {
		isFilled = fill;
	}
	
	public boolean isFilled() {
		return isFilled;
	}
}
