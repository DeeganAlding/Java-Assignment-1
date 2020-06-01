package passignment;

import java.util.ArrayList;

public class CoronaApp {

	public static void main(String[] args) {
		ArrayList<Sort> sort = new ArrayList<Sort>();
		Utilities.load(sort);
		
		GUI gui = new GUI (sort);
		gui.setVisible(true);

	}

}
