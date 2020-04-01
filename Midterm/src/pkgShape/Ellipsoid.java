package pkgShape;

public class Ellipsoid extends Ellipse{
	private double HeightRadius;
	
	public Ellipsoid(double radius, double minorRadius, double heightRadius) throws IllegalArgumentException{
		super(radius, minorRadius);
		if (heightRadius > 0) {
			HeightRadius = heightRadius;
		}
		else {
			throw new IllegalArgumentException();
		
		}
	}
	
	public double volume() {
		return HeightRadius * super.getRadius() * super.getMinorRadius() * 4 * Math.PI / 3;
	}
	
	public int compareTo(Ellipsoid o) {
		if(this.volume() < o.volume()) {
			return -1;
		}
		else if(this.volume() > o.volume()) {
			return 1;
		}
		return 0;
	}
}
