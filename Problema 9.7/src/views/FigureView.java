package views;


import models.Circle;
import models.Figure;
import models.Rectangle;
import models.Square;
import models.Triangle;

public class FigureView 
{
	private IO io;
	
	public FigureView()
	{
		io = new IO();
	}
	
	public void interact()
	{
		io.writeln("Figuras Triangulo(1), Cuadrado(2), Circulo(3), Rectangulo(4)");
		int numberFigure = io.readInt("Ingrese la figura: ");
		
		Figure figure = null;
		switch(numberFigure)
		{
			case 1:
					figure = new Triangle(io.readDouble("Lado A:"),io.readDouble("Lado B:"), io.readDouble("Lado C:")); break;
					
			case 2: 
					figure = new Square(io.readDouble("Lado:")); break;
				
			case 3: 
					figure = new Circle(io.readDouble("Radio:")); break;
			
			case 4: 
					figure = new Rectangle(io.readDouble("Lado A:"),io.readDouble("Lado B:")); break;
		}
		io.writeln(figure.getName());
		io.writeln("El area de la figura es: "+figure.calculateArea());
		io.writeln("El perimetro de la figura es: "+figure.calculatePerimeter());
		
	}
	
}
