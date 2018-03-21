package com.ipartek.formacion.capitulo3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class mesaTest {

	@Test
	public void testMesa() {
		Mesa mesa = new Mesa();
		assertEquals("Se espera 4", 4, mesa.getNumeroPatas());
		assertEquals("blanco", mesa.getColor());
		assertEquals(1, mesa.getDimension());
		assertEquals(mesa.MATERIAL_MADERA, mesa.getMaterial());
	}

	@Test
	public void testMesaIntIntStringInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNumeroPatas() {
		Mesa mesa = new Mesa();

		mesa.setNumeroPatas(5);
		assertEquals(5, mesa.getNumeroPatas());

		mesa.setNumeroPatas(0);
		assertEquals(1, mesa.getNumeroPatas());

		mesa.setNumeroPatas(-5);
		assertEquals(1, mesa.getNumeroPatas());
	}

	@Test
	public void testGetPrecio() {
		Mesa mesa = new Mesa();
		final int PRECIO_BASE = 13;
		int precio = 0;

		assertEquals(PRECIO_BASE, mesa.getPrecio());

		mesa.setColor(mesa.PRECIO_COLOR_NAME_CUSTOM);
		assertEquals((PRECIO_BASE + mesa.PRECIO_COLOR_CUSTOM), mesa.getPrecio());

		mesa.setColor("rojo");
		assertEquals(PRECIO_BASE, mesa.getPrecio());

		mesa.setMaterial(mesa.PRECIO_MATERIAL_ACERO);
		precio = (PRECIO_BASE - mesa.PRECIO_MATERIAL_MADERA) + mesa.PRECIO_MATERIAL_ACERO;
		assertEquals(precio, mesa.getPrecio());
		// TODO RESTO MATERIALES

		// Inicializo la mesa a precio base
		mesa = new Mesa();
		int nuevaDimension = 5;
		mesa.setDimension(nuevaDimension);

		precio = PRECIO_BASE + (mesa.PRECIO_M2 * mesa.getDimension() - (1 * mesa.PRECIO_M2));
		assertEquals(precio, mesa.getPrecio());

		mesa = new Mesa();
		int numPatas = 8;
		mesa.setNumeroPatas(numPatas);
		precio = PRECIO_BASE + (mesa.PRECIO_PATA * mesa.getNumeroPatas() - (4 * mesa.PRECIO_PATA));
		assertEquals(precio, mesa.getPrecio());

		mesa = new Mesa();
		mesa.setNumeroPatas(-4);
		precio = PRECIO_BASE - ((3 * mesa.PRECIO_PATA) * mesa.getNumeroPatas());

	}

	@Test
	public void comparar() {
		Mesa m1 = new Mesa();
		Mesa m2 = new Mesa();

		assertEquals(m1, m2);
	}

}
