package fr.iutbay.joey.tankMMO;

import fr.iutbay.joey.base.CharBase;

/**
 * 
 * @author Florian
 *
 */
public class CharMoine extends CharBase
{
	public CharMoine()
	{
		super();
		nom = "Char moine";
		carburant = 50;
		carburantMax = carburant;
		arme = Armes.canon_30;
		description = "Char tr�s puissant, mais peu r�sistant";
		initiative = 15.0F;
	}
}
