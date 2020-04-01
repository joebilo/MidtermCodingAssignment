package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Ellipse;

public class EllipseTest {
	
	@Test 
	public void elipseTest(){
		Ellipse elps = new Ellipse(10, 20);

		assertEquals(628.32, elps.area(), .01);
		}

	}
