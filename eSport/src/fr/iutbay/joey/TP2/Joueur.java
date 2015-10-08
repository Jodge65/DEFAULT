package fr.iutbay.joey.TP2;

/**
 * 
 * @author Joey
 * 
 */
public class Joueur
{
	enum Poste
	{
		mid("Mid"), 
		top("Top"), 
		adc("Adc"), 
		support("Support"), 
		jungler("Jungler");

		private String name;

		Poste(String name)
		{
			this.name = name;
		}

		public String getName()
		{
			return name;
		}

		public String toString()
		{
			return getName();
		}
	}

	/** nomdu joueur */
	protected String name;
	/** prenom du joueur */
	protected String subname;
	/** num�ro du maillot */
	protected int number;
	/** poste du joueur */
	protected Poste poste;
	/** true si le joueur est titulaire, false sinon */
	protected boolean titulaire;
	/** identifiantdu joueur */
	protected int identifant;
	
	private static int nbOcc = 0;

	/**
	 * Constructeur normal de la classe Joueur
	 * 
	 * @param name String du nom
	 * @param subname String du prenom
	 * @param number Int du numero maillot
	 * @param poste Poste du poste
	 * @param titulaire Boolean. true = tituralire, false = remplacant
	 */
	Joueur(String name, String subname, int number, Poste poste, boolean titulaire)
	{
		identifant = nbOcc;
		nbOcc++;
		setName(name).setSubname(subname).setNumber(number).setPoste(poste).setTitulaire(titulaire);
	}

	// ----- ----- METHODE SET ----- ----- //
	/**
	 * D�finis le nom du joueur
	 * 
	 * @param nom String du joueur
	 */
	public Joueur setName(String name)
	{
		if (!name.isEmpty())
		{
			this.name = name;
		}
		return this;
	}

	/**
	 * D�finis le prenom du joueur
	 * 
	 * @param prenom String du joueur
	 */
	public Joueur setSubname(String subname)
	{
		this.subname = subname;
		return this;
	}

	/**
	 * D�finis le nombre du joueur
	 * 
	 * @param prenom Int du num�ro du maillot
	 */
	public Joueur setPoste(Poste poste)
	{
		this.poste = poste;
		return this;
	}

	/**
	 * D�finis le nombre du joueur
	 * 
	 * @param prenom Int du num�ro du maillot
	 */
	public Joueur setNumber(int number)
	{
		if (number > 0)
		{
			this.number = number;
		}
		return this;

	}

	/**
	 * D�finis le joueur comme �tant titulaire
	 */
	public Joueur setTitulaire()
	{
		this.titulaire = true;
		return this;
	}

	/**
	 * D�finis le joueur comme �tant remplacant
	 */
	public Joueur setRemplacant()
	{
		this.titulaire = false;
		return this;
	}

	/**
	 * D�finis le joueur comme �tant titulaire ou remplacent
	 * 
	 * @param titulaire true = titulaire, false = remplacant;
	 */
	public Joueur setTitulaire(boolean titulaire)
	{
		if (titulaire)
			setTitulaire();
		else
			setRemplacant();
		return this;
	}

	// ----- ----- METHODE GET ----- ----- //
	public String getName()
	{
		return this.name;
	}

	public String getSubname()
	{
		return this.subname;
	}

	public int getNumber()
	{
		return this.number;
	}

	public Poste getPoste()
	{
		return this.poste;
	}

	public boolean isTitulaire()
	{
		return this.titulaire;
	}

	public boolean isRemplacant()
	{
		return !isTitulaire();
	}
	
	public int getIdentifiant()
	{
		return this.identifant;
	}

	// ----- ----- METHODE ALL ----- ----- //

	public String toString()
	{
		return identifant + " : Nom : " + name + ", Pr�nom : " + subname + ", N� maillot : " + number + ", Poste : " + poste + (titulaire ? ", Titulaire" : ", Remplacant");
	}

}
