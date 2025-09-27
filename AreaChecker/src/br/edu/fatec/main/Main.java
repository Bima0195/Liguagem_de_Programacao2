package br.edu.fatec.main;

import br.ed.fatec.factory.Calculable;

import br.ed.fatec.factory.ShapeFactoryImpI;
import br.ed.fatec.factory.ShapeType;
import br.ed.fatec.factory.ShapeFactory;

@SuppressWarnings("unused")
public class Main {
	
	public static void main(String[] args) {
		
		
		
		ShapeFactory shape = new ShapeFactoryImpI();
		
		System.out.println(shape.getShape(ShapeType.SQUARE, new Double[]{2.0}).calcularArea());
		
		
		
		
	}
		
		
		
		
}