package aplication;


public class Triangle 
{	
	public int[] drawLine(int limit) 
	{
		int line[] = new int[limit+1];
		for(int i=0; i<limit; i++)
		{
			line[i] = i+1;
		}
		line[limit] = -1;
		return line;
	}

	public int[] drawLines(int limitLines) 
	{
		int lines[] = new int[calculateSize(limitLines)];
		int[] line; int temp=0;
		for(int i=limitLines; i>0;i--)
		{
			line = drawLine(i);
			System.arraycopy(line, 0, lines, temp, line.length);
			temp += (i+1);
		}
		return lines;
	}

	private int calculateSize(int limitLines)
	{
		int squaredLimitLines = limitLines * limitLines;
		return (int)(squaredLimitLines + 3*limitLines) /2;
	}
	

}
