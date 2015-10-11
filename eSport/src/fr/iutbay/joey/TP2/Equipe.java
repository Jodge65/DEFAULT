package fr.iutbay.joey.TP2;

/**
 * 
 * @author Joey
 * 
 */
public class Equipe
{
	/** Nom de l'�quipe */
	protected String name;
	/** Nombre de joueurs max dans l'�quipe */
	protected final static int NB_MAX_JOUEUR = 10;
	/** tableau de joueur */ 
	protected Joueur[] joueurs = new Joueur[NB_MAX_JOUEUR];
	/** id du joueurs */
	protected int identifiant;
	/** variable de s�l�ction de l'ID */
	protected static int nbOcc = 0;

	/**
	 * Constructeur  
	 * @param name (String) nom de l'�quipe
	 * @param player... (Joueurs | optionnel) liste de Joueurs (entre 0 et NB_MAX_JOUEUR joueurs)
	 *
	 */
	Equipe(String name)
	{
		identifiant = nbOcc;
		nbOcc++;
		setName(name);
	}
	Equipe(String name, Joueur... player)
	{
		this(name);

		int i = 0;
		for (Joueur j : player)
		{
			joueurs[i] = j;
			i++;
			if (i >= NB_MAX_JOUEUR)
				break;
		}
	}

	// ----- ----- METHODE SET ----- ----- //
	/**
	 * D�finis le nom du joueur
	 * 
	 * @param nom String du joueur
	 */
	public Equipe setName(String name)
	{
		if (!name.isEmpty())
		{
			this.name = name;
			return this;
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * 
	 * @param player (Joueur) joueurs � rajouter
	 * @return boolean true si le joueurs a pus �tre rajout�, false sinon
	 */
	public boolean addJoueur(Joueur player)
	{
		boolean isAdd = false;
		
		int pos = 0;
		while (joueurs[pos] != null)
		{
			pos++;
			if(pos >= NB_MAX_JOUEUR)
				break;
		}
			
		if(!(pos >= NB_MAX_JOUEUR))
		{
			joueurs[pos] = player;
			isAdd = true;
		}
			
		return isAdd;
	}
	
	/**
	 * 
	 * @param pos (int) position dans le tableau a effacer. Pr�f�rer l'usage de subJoueur(Joueur j)
	 * @return (boolean) true si la position existe, false sinon
	 */
	public boolean subJoueur(int pos)
	{
		if(pos < NB_MAX_JOUEUR)
		{
			joueurs[pos] = null;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * 
	 * @param j J(oueur) Joueurs � supprimer
	 * @return (boolean) true si le joueur a pus �tre supprim�, false sinon
	 */
	public boolean subJoueur(Joueur j)
	{
		int i = 0;
		do
		{
			if(joueurs[i] != null)
				if(joueurs[i].equals(j))
					break;
			i++;
		}while(i <= NB_MAX_JOUEUR);
		return subJoueur(i);
	}
	
	// ----- ----- METHODE GET ----- ----- //
	public String getName()
	{
		return this.name;
	}

	public int getIdentifiant()
	{
		return this.identifiant;
	}

	// ----- ----- METHODE ALL ----- ----- //

	/**
	 * 
	 * @return (String) retourne un chaine de plusieur ligne ayant chacun des joueurs de l'�quipe (utilis� par d�faut lors de l'utilisation de la variable de type �quipe dans une chaine de caract�re)
	 */
	public String toString()
	{
		String temps = "Nom : " + name + ", Identifiant : " + identifiant + "\nListe des Joueurs : \n";
		for(int i=0; i < NB_MAX_JOUEUR; i++)
			if(joueurs[i] != null)
				temps += (joueurs[i] + "\n");
		return temps; 
	}
	
	/**
	 * 
	 * @return (String) retourne un chaine de plusieur ligne ayant chacun des joueurs Titulaire
	 */
	public String listOfTitulaire()
	{
		String temps = "Liste des Joueurs Titulaire : \n";
		for(int i=0; i < NB_MAX_JOUEUR; i++)
			if(joueurs[i] != null)
				if(joueurs[i].isTitulaire())
					temps += (joueurs[i] + "\n");
		return temps;
	}
	
	/**
	 * 
	 * @return (String) retourne un chaine de plusieur ligne ayant chacun des joueurs Remplacant
	 */
	public String listOfRemplacant()
	{
		String temps = "Liste des Joueurs Remplacant : \n";
		for(int i=0; i < NB_MAX_JOUEUR; i++)
			if(joueurs[i] != null)
				if(joueurs[i].isRemplacant())
					temps += (joueurs[i] + "\n");
		return temps;
	}
	
	
}
