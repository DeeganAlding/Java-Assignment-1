package passignment;

import java.util.ArrayList;

/**
 * 
 * @author Deegan Alding
 *
 */

public class CoronaApp {

/**
 * Creates array and loads data
 * @param args
 */
	public static void main(String[] args) {
		ArrayList<Sort> sort = new ArrayList<Sort>();
		Utilities.load(sort);
		
		GUI gui = new GUI (sort);
		gui.setVisible(true);

	}

}
