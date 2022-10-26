package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Manuel
 *
 */
public class Zoo {
	
	/**
	 * Nom = nom du Zoo
	 * animals = liste des différents animaux composant le zoo
	 */
	private String nom;
	private List<Animal> animals;
	
	
	/**
	 * Ce constructeur est utilisé pour instancier un zoo via son nom
	 * @param nom = de type String
	 * la liste des animaux est créée vide
	 */
	public Zoo(String nom){
		this.nom = nom;
		this.animals = new ArrayList<Animal>();
	}
	
	/**
	 * Une méthode pour ajouter un animal à la liste
	 * @param nom le nom de la variable animal
	 */
	public void ajouterAnimal(Animal nom) {
		this.animals.add(nom);
	}
	
	/**
	 *Une méthode pour afficher chaque animaux du Zoo 
	 */
	public void afficherListeAnimaux(){
		for (int i=0; i<taille(); i++) {
			System.out.println(animals.get(i));
		}
	}
	
	
	/**
	 * une méthode pour connaitre le nombre d'animaux différents dans le zoo
	 * @return int
	 */
	public int taille() {
		return this.animals.size();
	}

	/** Getter for nom
	 * @return the nom
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
	
	/** Getter for Animal
	 * @return the animal
	 */

	public List<Animal> getAnimals() {
		return animals;
	}

	/** Setter
	 * @param animals the animals to set
	 */

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	
	
}
