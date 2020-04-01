package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Ellipsoid;

class EllipsoidTest {

	@Test
	public void elipseTest(){
		Ellipsoid elpd = new Ellipsoid(10, 20, 25);

		assertEquals(20943.95, elpd.volume(), .01);
		}

	

}
