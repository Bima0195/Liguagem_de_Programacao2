package br.ed.fatec.factory;

public class Triangle implements Calculable{
	private double base;
	private double height;
	
	public Triangle(Double[] values, Double[] values1) {
		this.base = base;
		this.height = height;
	}

	public double calcularArea() {
		return base*height / 2;
	}

}
