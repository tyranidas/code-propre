package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	
	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * type = LA
	 * @param solde représente le solde du compte
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	
	public LivretA(double solde, double tauxRemuneration) {
		super("LA", solde);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/**
	 * methode qui permet d'appliquer la rémunération annuelle en fonction de son taux
	 */
	
	public void appliquerRemuAnnuelle(){
		
			this.solde += solde*tauxRemuneration/100;
		
	}
	
	/**
	 * fonction qui débite un montant du compte 
	 * SI le solde ne devient pas négatif
	 */
	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant >= 0){
			this.solde = solde - montant;
		}		

	}
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}


	
	
}
