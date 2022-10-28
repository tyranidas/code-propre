package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Manuel
 *
 */
public class Inventaire {

	/**
	 * List des caisses pour l'inventaire
	 */
	private List<Caisse> caisses;

	/**
	 * création de 3 caisses à l'instanciation
	 */
	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", 0.5 ,5.0));
		caisses.add(new Caisse("Moyens objets", 5.0,20.0));
		caisses.add(new Caisse("Grands objets", 20.0, 100.0));
	}

	/**
	 * ranger les Items dans les caisses selon leur poids
	 * @param item
	 */
	public void addItem(Item item) {

		for(Caisse c : caisses)
		{
			c.filterItem(item);
		}
		
	}
	
	/**
	 * afficher la taille de l'inventaire
	 * @return
	 */
	public int taille() {
		
		int taille = 0;
		for(Caisse c : caisses)
		{
			System.out.println(c.getNom()+" contient "+c.getItems().size()+" objets");
			taille += c.getItems().size();
		}
		return taille;
	}
}
