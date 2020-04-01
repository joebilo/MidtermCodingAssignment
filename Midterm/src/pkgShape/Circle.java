package pkgShape;
import java.lang.Math;
public class Circle extends Shape implements Comparable{

	protected double Radius;
	
	public Circle(double radius){
		if (radius > 0) {
			Radius = radius;
		}
		else {
			throw new IllegalArgumentException("radius must be positive");
		}
	}

	public double area(){
		return Math.PI * this.Radius * this.Radius;
	}

	protected double getRadius() {
		return this.Radius;
	}
	
	protected void setRadius(double radius) {
		this.Radius = radius;
	}
	

	public int compareTo(Object o) {
		Circle circ = (Circle) o;
		if(this.area() < circ.area()) {
			return -1;
		}
		else if(this.area() > circ.area()) {
			return 1;
		}
		return 0;
	}
}
                                       