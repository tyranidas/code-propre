package ex3;

import java.util.List;

/**
 * @author Manuel
 *
 */
public class Animal {
	
	
	/**
	 * nom : nom de l'animal
	 * type : type de l'animal (ex Mammifère, poisson, etc...)
	 * comportement : régime alimentaire de l'animal
	 */
	private String nom;
	private String type;
	private String comportement;
	
	
	/**
	 * Ce constrcuteur sert à instancié un Animal
	 * @param nom
	 * @param type
	 * @param comportement
	 */
	public  Animal(String nom, String type, String comportement){
		
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	
	
	
	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", type=" + type + ", comportement=" + comportement + "]";
	}


	/**
	 * Getter pour nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * Getter pour type
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/** Setter
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * Getter pour comportement
	 * @return comportement
	 */
	public String getComportement() {
		return comportement;
	}
	/** Setter
	 * @param comportement the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}
	
	
}
