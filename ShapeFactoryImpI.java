package br.ed.fatec.factory;

public class ShapeFactoryImpI implements ShapeFactory{

	public Calculable getShape(ShapeType type, Double[] values) {
		switch (type) {
		case SQUARE:
			return  new Square(values);

		case RECTANGLE:
			return new Rectangle(values, values);

		case CIRCLE:
			return new Circle(values);

		case CUBE:
			return  new Cube(values);

		case DIAMOND:
			return new Diamond(values, values);

		case HEXAGON:
			return new Hexagon(values);

		case PARALLELOGRAM:
			return  new Parallelogram(values, values);

		case TRAPEZO:
			return new Trapezo(values, values, values);
			
		case TRIANGLE:
			return (Calculable) new Triangle(values, values);
		default:
			break;

		}
		return null;
	}

}
