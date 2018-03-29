package app;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Aplication {

	public static void main(String[] args) {
		String regex = "(\\d+) de (\\w+) de (\\d+)";
		Pattern patron = Pattern.compile(regex);

		String texto = "30 de Enero de 2015";
		Matcher emparejador = patron.matcher(texto);

		emparejador.find();

		String el1 = emparejador.group(1);
		String el2 = emparejador.group(2);
		String el3 = emparejador.group(3);

	System.out.println("Contenido en la variable $1: \'" + el1 + "\', en la variable $2: \'" + el2 + "\', en la variable $3: \'" + el3 + "\'");
	}

}