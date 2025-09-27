package br.ed.fatec.factory;

public class Hexagon implements Calculable{
	
	private double side;
	
	public Hexagon(Double[] values) {
		this.side = side;
		
	}
	
	public double calcularArea() {
		return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
	}

}
