package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private String nom;
	private Double capaMin;
	private Double capaMax;
	private List<Item> items;

	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom, Double capaMin, Double capaMax) {
		super();
		this.nom = nom;
		this.capaMin = capaMin;
		this.capaMax = capaMax;
		this.items = new ArrayList<>();
	}

	public void filterItem(Item item) {
		if ((item.getPoids() > capaMin) && (item.getPoids() < capaMax))   {
			this.getItems().add(item);
		}
	}
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
