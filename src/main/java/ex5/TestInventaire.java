package ex5;

import java.util.ArrayList;
import java.util.List;

public class TestInventaire {

	public static void main(String[] args) {
		Inventaire test = new Inventaire();
		
		List<Item> listItem = new ArrayList<Item>();
		
		listItem.add(new Item ("a", 10));
		listItem.add(new Item ("b", 15));
		listItem.add(new Item ("c", 4));
		listItem.add(new Item ("d", 12));
		listItem.add(new Item ("e", 25));
		
		for (Item i : listItem)
		{
			test.addItem(i);
			
		}
				
		System.out.println("L\'inventaire a une taille de "+test.taille());
		
	}

}
