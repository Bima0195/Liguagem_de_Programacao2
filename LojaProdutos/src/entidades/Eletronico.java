package entidades;

public class Eletronico extends Produto{

	public Eletronico(String nome, double preco) {
		super(nome, preco);
		
	}
	
	
	public double cularPrecoFinal() {
		return  preco * 0.9;
		
	}

}
