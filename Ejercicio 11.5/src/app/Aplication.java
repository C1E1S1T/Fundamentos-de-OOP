package app;

import models.SymbolCounter;

public class Aplication {

	public static void main(String[] args) 
	{
		new Aplication().start();
	}

	private void start() 
	{
		IO io = new IO();
		SymbolCounter count = new SymbolCounter(io.readString("Ingrese la palabra:"));
		io.writeln("Palabra:"+count.toString());
		io.writeln("Vocales:"+count.countVowels());
		io.writeln("Consonantes:"+count.countConsonants());
		io.writeln("Digitos:"+count.countDigits());
	}

}
