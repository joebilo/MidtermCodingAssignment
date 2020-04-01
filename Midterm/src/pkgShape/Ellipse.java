package pkgShape;

public class Ellipse extends Circle{
	private double MinorRadius;
	
	
	public Ellipse(double radius, double minorRadius) throws IllegalArgumentException {
		super(radius);
		if (minorRadius > 0) {
			MinorRadius = minorRadius;
		}
		else {
			throw new IllegalArgumentException("radius must be positive");
		
		}
	}
	
	protected double getMinorRadius() {
		return this.MinorRadius;
	}
	
	protected void setRadius(double radius) {
		this.MinorRadius = radius;
	}
	
	
	public boolean isCircle() {
		return getRadius() == MinorRadius;
	}
	
	public double area() {
		return MinorRadius * super.getRadius() * Math.PI; 
		
	}
	
	public int compareTo(Object o) {
		Ellipse elps = (Ellipse)o;
		if(this.area() < elps.area()) {
			return -1;
		}
		else if(this.area() > elps.area()) {
			return 1;
		}
		return 0;
	}
}