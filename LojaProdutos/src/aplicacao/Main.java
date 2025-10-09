package aplicacao;

import entidades.Eletronico;
import entidades.Produto;
import entidades.Roupa;

 class Main {
	
	public static void main(String[] args) {
		
	    Produto e = new Eletronico("Calca", 2300.00);
	    Produto r = new Roupa("Teste", 90.23);
			
		System.out.println("Celular: R$" + e.cularPrecoFinal());
		
		System.out.println("Calça: R$" + r.cularPrecoFinal());
		
	}

}
