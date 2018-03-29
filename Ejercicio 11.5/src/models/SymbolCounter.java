package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymbolCounter 
{

	private String text;

	public SymbolCounter(String text) 
	{
		this.text = text.toLowerCase();
	}
	
	@Override
	public String toString() 
	{
		return text; 
	}

	public Integer countVowels() 
	{
		String vowels = "[a|e|i|o|u]";
		return countCoincidences(vowels);
	}

	public Integer countConsonants() 
	{
		String consonants = "[^a|e|i|o|u| ]";
		return countCoincidences(consonants);
	}

	public Integer countDigits() 
	{
		String digits = "\\d";
		return countCoincidences(digits);
	}
		
	private Integer countCoincidences(String regex) {
		Integer coincidences=0;
		Matcher matcher = Pattern.compile(regex).matcher(this.text);
		while(matcher.find())
		{
			coincidences++;
		}
		return coincidences;
	}

	
	

}
