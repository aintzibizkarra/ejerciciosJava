package com.ipartek.formacion.capitulo3_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class HamburguesaTest {

	@Test
	public void testHamburguesa() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPrecioHamburguesa() {
		Hamburguesa viuda = new Hamburguesa();
		assertEquals(1.0f, viuda.getPrecioHamburguesa(), 0.01);

		Hamburguesa completa = new Hamburguesa();
		boolean[] ingredientesCompleta = { true, true, true, true, true, true };
		// completa.setIngredientes(ingredientesCompleta);
		assertEquals(2.75f, completa.getPrecioHamburguesa(), 0.01);
	}

}
