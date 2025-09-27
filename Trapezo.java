package br.ed.fatec.factory;

public class Trapezo implements Calculable{
	private double Bbigger;
	private double Bsmaller;
	private double height;

	public Trapezo(Double[] values, Double[] values1, Double[] values2) {
		this.Bbigger = Bbigger;
		this.Bsmaller = Bsmaller;
		this.height = height;
	}

	public double calcularArea() {
		return ((Bbigger + Bsmaller) * height) / 2;
	}

}
