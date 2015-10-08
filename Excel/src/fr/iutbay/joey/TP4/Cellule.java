package fr.iutbay.joey.TP4;

public class Cellule
{
	/** Valeur affich� enregistrer sous forme de Double */
	protected double value;
	
	/**
	 * Constructeur Cellule 
	 * 
	 * @param value (Double) valeur � affich�
	 */
	public Cellule()
	{
		this(0);
	}

	public Cellule(double value)
	{
		this.value = value;
	}

	public double getValue()
	{
		return value;
	}

	public Cellule setValue(double value)
	{
		this.value = value;
		return this;
	}
	
	
}
