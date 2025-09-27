package br.ed.fatec.factory;

public class Diamond implements Calculable {

	private double dlonger;
	private double dshort;

	public Diamond(Double[] values, Double[] values1) {
		this.dlonger = dlonger;
		this.dshort = dshort;
	}

	public double calcularArea() {
		return dlonger * dshort / 2;
	}

}
