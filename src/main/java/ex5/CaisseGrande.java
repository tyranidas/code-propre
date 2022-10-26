package ex5;
/**
 * @author Manuel
 *
 */
public class CaisseGrande extends Caisse {
	/**Constructeur d'une grande caisse selon son nom
	 * @param nom
	 */
	public CaisseGrande(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	/**rajoute à la caisse uniquement si poids supérieur à 20
	 *
	 */
@Override
public void filterItem(Item item) {
	if (item.getPoids() > 20) {
		this.getItems().add(item);
	}
}

}