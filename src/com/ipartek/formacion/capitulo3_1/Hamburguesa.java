package com.ipartek.formacion.capitulo3_1;

public class Hamburguesa {

	public static float LISTA_INGREDIENTES_PRECIO[] = { (float) 0.30, (float) 0.70, (float) 0.50, (float) 0.25,
			(float) 0.30, (float) 0.70 };
	public static String[] LISTA_INGREDIENTES = { "pan", "carne", "tomate", "lechuga", "pepino", "queso" };

	private boolean[] ingredientes;

	public Hamburguesa() {
		super();

		this.ingredientes[0] = true;
		this.ingredientes[1] = true;

	}

	public float getPrecioHamburguesa() {
		return 0;

	}

}
