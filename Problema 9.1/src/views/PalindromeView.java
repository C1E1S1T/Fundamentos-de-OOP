package views;

public class PalindromeView 
{
	private IO io;
	
	public PalindromeView()
	{
		io = new IO();
	}
	
	public void interact()
	{
		String word = io.readString("Ingrese la palabra: ");
		String result = (isPalindrome(word)) ? "Es palindromo" : "No es palindromo"; 
		io.writeln(result);
	}
	
	private boolean isPalindrome(String word)
	{
		String inverseWord = word;
		int j=inverseWord.length()-1;
		for(int i=0; i<word.length(); i++)
		{
			if(inverseWord.charAt(j) != word.charAt(i))
			{
				return false;
			}
			j--;
		}
		return true;
	}
	
	
}
