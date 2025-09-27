package br.ed.fatec.factory;

public class Square implements Calculable {
	
	private double   side;
	
	
	
    public Square(Double[] values) {
        this.side = side;
    }
	
	public double calcularArea () {
		return Math.pow(side, side);
		
	}

}
