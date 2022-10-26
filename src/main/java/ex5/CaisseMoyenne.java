package ex5;

/**
 * @author Manuel
 *
 */
public class CaisseMoyenne extends Caisse {
	/**Constructeur d'une caisse moyenne selon son nom
	 * @param nom
	 */
	public CaisseMoyenne(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	/**rajoute à la caisse uniquement si poids compris entre 5 et 20
	 *
	 */
@Override
public void filterItem(Item item) {
	if (item.getPoids() >= 5 && item.getPoids() <= 20) {
		this.getItems().add(item);
	}
}

}