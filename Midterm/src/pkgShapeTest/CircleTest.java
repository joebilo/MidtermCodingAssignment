package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Circle;

public class CircleTest {

	@Test
	public void circleTest(){
		Circle cir = new Circle(10);
		
		assertEquals(314.15, cir.area(), .01);
	}

}
