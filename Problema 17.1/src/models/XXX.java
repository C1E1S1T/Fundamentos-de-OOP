package models;

import java.util.ArrayList;

public class XXX 
{

	public ArrayList<String> substract(String string, String string2) 
	{
		String mayorString=null;
		String minorString=null;		
		if( string.length() >= string2.length()  )
		{
			mayorString = string;
			minorString = string2;
		}
		else
		{
			mayorString = string2;
			minorString = string;
		}
		if( minorString.equals(mayorString)   )
		{
			return null;
		}
		ArrayList<String> remainder = new ArrayList<>();
		StringBuilder difference = new StringBuilder();
		Integer begin = mayorString.indexOf(minorString);
		Boolean isBegginingString = begin == 0;
		if(isBegginingString)
		{
			difference.append(mayorString.substring(minorString.length(), mayorString.length()));
			remainder.add("Linea:1 "+"Columna:"+minorString.length()+" Diferencia:"+difference.toString());
			return remainder;
		}
		Boolean isEndingString = begin == mayorString.length() - minorString.length();
		if( isEndingString  )
		{
			difference.append(mayorString.substring(0, begin));
			remainder.add("Linea:1 "+"Columna:"+begin+" Diferencia:"+difference.toString());
			return remainder;
		}
		Integer j=0;
		ArrayList<Integer> columns = new ArrayList<>();
		for(int i=0; i<mayorString.length(); i++)
		{
			if(mayorString.charAt(i) == minorString.charAt(j))
			{
				difference.append(" ");
			}
			else
			{
				difference.append(mayorString.charAt(i));
				columns.add(i);
			}
			if(j<minorString.length()-1)
			{
				j++;
			}
		}
		if(columns.size() == mayorString.length() )
		{
			remainder.add("Linea:1 "+"Columna:"+0+" Diferencia:"+difference.toString());
		}
		else
		{
			columns.stream().forEach(
						(column) ->  remainder.add("Linea:1 "+"Columna:"+column+" Diferencia:"+difference.toString())
					);
		}
		return remainder;
	}
	
	
	

}
