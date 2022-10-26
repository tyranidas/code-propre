package ex5;
/**
 * @author Manuel
 *
 */
public class CaissePetite extends Caisse {

	/**Constructeur d'une petite caisse selon son nom
	 * @param nom
	 */
	public CaissePetite(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}


/**rajoute à la caisse uniquement si poids inférieur à 5
 *
 */
@Override
public void filterItem(Item item) {
	if (item.getPoids() < 5) {
		this.getItems().add(item);
	}
}

}