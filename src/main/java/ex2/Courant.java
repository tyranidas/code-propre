package ex2;

public class Courant extends CompteBancaire {
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;

	

	/** Ce constructeur est utilisé pour créer un compte de type Courant
	 * type = CC
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
		 */
	public Courant(double solde, double decouvert) {
		super("CC", solde);
		this.decouvert = decouvert;
		
	}
	
	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant > -(this.decouvert)){
			this.solde = solde - montant;
		}		

	}

	
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
