// 1. Definicion package
package com.ipartek.formacion.capitulo3;

//2. Los imports => ahora mismo no hay ninguno

//3. Definicion de la clase
public class Mesa {
	// Precio en Euros
	final int PRECIO_PATA = 1;
	final int PRECIO_M2 = 5;
	final int PRECIO_MATERIAL_MADERA = 4;
	final int PRECIO_MATERIAL_ACERO = 6;
	final int PRECIO_MATERIAL_ALUMINIO = 5;
	final int PRECIO_MATERIAL_PLASTICO = 2;
	final int PRECIO_COLOR_CUSTOM = 23;
	final String PRECIO_COLOR_NAME_CUSTOM = "custom";

	final int MATERIAL_MADERA = 1;
	final int MATERIAL_ACERO = 2;
	final int MATERIAL_ALUMINIO = 3;
	final int MATERIAL_PLASTICO = 4;

	// 4. Atributos SIEMPRE private para mantener la encapsulación
	private int numeroPatas;
	private int dimension; // m2
	private String color;
	private int material;

	/*
	 * 5. Metodos 5.1 Contructors 5.2 getter and setters 5.3 Others
	 */

	public Mesa() {

		super();

		this.numeroPatas = 4;
		this.dimension = 1;
		this.color = "blanco";
		this.material = 1;
	}

	/**
	 * Sirve para comentar con JavaDoc
	 * 
	 * @author Aintzi
	 * @param numeroPatas
	 *            int. En caso de ser negativo se inicializa con 0
	 */
	/*
	 * public Mesa(int numeroPatas) { super(); // this.numeroPatas = numeroPatas;
	 * setNumeroPatas(numeroPatas); }
	 */

	public Mesa(int numeroPatas, int dimension, String color, int material) {
		super();
		this.numeroPatas = numeroPatas;
		this.dimension = dimension;
		this.color = color;
		this.material = material;
	}

	public int getNumeroPatas() {
		return this.numeroPatas;
	}

	/**
	 * Cambia el numero de patas
	 * 
	 * @param numeroPatas
	 */
	public void setNumeroPatas(int numeroPatas) {

		this.numeroPatas = (numeroPatas < 0) ? 0 : numeroPatas;
	}

	public int getDimension() {
		return this.dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaterial() {
		return this.material;
	}

	public void setMaterial(int material) {
		this.material = material;
	}

	public int getPrecio() {

		return 0;

	}

}
