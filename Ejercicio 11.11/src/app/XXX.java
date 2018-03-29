package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XXX 
{
		
	public String convertToOrdinal(String date)
	{
		String regex = "(\\d+)/(\\d+)/(\\d+)";
		Pattern patron = Pattern.compile(regex);
		Matcher emparejador = patron.matcher(date);

		emparejador.find();
		String day = emparejador.group(1);
		String month = emparejador.group(2);
		String year = emparejador.group(3);
				
		return day + " "+ convertToMonthOrdinal(month) + " de " + "20"+year;
	}
	
	private String convertToMonthOrdinal(String month)
	{
		
		switch(Integer.parseInt(month))
		{
			case 1: return "Enero";
			case 2: return "Febrero";
			case 3: return "Marzo";
			case 4: return "Abril";
			case 5: return "Mayo";
			case 6: return "Junio";
			case 7: return "Julio";
			case 8: return "Agosto";
			case 9: return "Septiembre";
			case 10: return "Octubre";
			case 11: return "Noviembre";
			case 12: return "Diciembre";
		}
		return month;
	}
	
	
	
	
}
