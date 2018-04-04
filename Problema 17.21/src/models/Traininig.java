package models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Traininig implements Serializable
{
	private static final long serialVersionUID = 1L;
	public static final Integer pulsationNumber = 7200;
	private LocalDate date;
	private Integer time;
	private List<Integer> pulsations;
	
	public Traininig(List<Integer> pulsations)
	{
		date= LocalDate.now();
		time = 120;
		this.pulsations = pulsations;
	}
	
	public LocalDate getDate()
	{
		return date;
	}
	
	public String toString()
	{
		return "Entrenamiento 1 Fecha:"+date.toString();
	}
	
	public List<Integer> getPulsations()
	{
		return pulsations;
	}
	
	public Integer getTime()
	{
		return time;
	}
	
}
