package ex1;

import java.util.Date;

/**
 * @author Manuel
 *
 */
public class Entreprise {

	
	/**
	 * siret : numéro de siret de l'entreprise
	 * nom : nom de l'entreprise
	 * adresse : adresse de l'entreprise
	 * dateCreation : date de la création de l'entreprise
	 */
	public int siret;
	public String nom;
	public String adresse;
	public Date dateCreation;
	
	
	/**
	 * CAPITAL_MAX : capital maximum que peut avoir l'entreprise
	 */
	public static final int CAPITAL_MAX = 3000000;
	
	/**
	 * permet d'afficher les status de l'entreprise
	 */
	public void afficherStatut(){
		
	}
	
}
