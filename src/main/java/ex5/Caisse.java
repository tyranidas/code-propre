package ex5;

import java.util.ArrayList;
import java.util.List;

public abstract class Caisse {

	protected String nom;
	protected List<Item> items;

	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom) {
		super();
		this.nom = nom;
		this.items = new ArrayList<>();
	}

	public void filterItem(Item item) {}
	
	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
