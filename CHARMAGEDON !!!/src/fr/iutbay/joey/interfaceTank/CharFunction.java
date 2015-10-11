package fr.iutbay.joey.interfaceTank;

import fr.iutbay.joey.base.ChampDeBatail;
import fr.iutbay.joey.base.CharBase;

/**
 * 
 * @author Joey
 *
 */
public interface CharFunction
{
	/**
	 * 
	 * @param cible (CharBase) cible touch� par l'attaque
	 * @return (float) les d�gats qui ont �t� inflig� (avant passage sur �treToucher
	 */
	public float attaquer(CharBase cible);
	
	/**
	 * 
	 * @param value (float) montant de d�gat � inflig�
	 * @return (boolean) return true si la cible a �t� touch�, false sinon
	 */
	public boolean etreToucher(float value);
	
	/**
	 * Rend le char "mort" (inactif)
	 */
	public void setDead();
	
	/**
	 * 
	 * @return (boolean) returne true si le char est mort, false sinon
	 */
	public boolean isDead();
	
	/**
	 * Action r�alis� � chaque fin de tour
	 * @param a (champDeBatail) champ de l'attaquant 
	 * @param b (champDeBatail) champ du d�fenceurs
	 */
	public void onUpdate(ChampDeBatail a, ChampDeBatail b);

}
