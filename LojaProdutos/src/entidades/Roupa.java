package entidades;

public class Roupa extends Produto{

	public Roupa(String nome, double preco) {
		super(nome, preco);
		
	}
	
	public double cularPrecoFinal() {
		return  preco * 0.8;
		
	}

}
