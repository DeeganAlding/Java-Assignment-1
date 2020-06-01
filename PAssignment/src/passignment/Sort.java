package passignment;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sort {

	 private static Scanner x;
	
	 public static void FindMaxSearch()
	 {
		 
	 }
	
	 
	 public static void SearchByName()	
	 {
		boolean found = false;
		
       
		String country = "";
		String query1 = "";
		String query2 = "";
		String query3 = "";
		String query4 = "";
		
		String searchTerm = "Canada";
		String filename = "googledata.csv";
		
		try {
			
				x = new Scanner(new File(filename));
				x.useDelimiter("[,\n]");
				
				while(x.hasNext() && !found)
				{
					country = x.next();
					query1 = x.next();
					query2 = x.next();
					query3 = x.next();
					query4 = x.next();  
					
					if(country.equals(searchTerm))
					{
						found = true;
					}
				}
				
				if (found)
				{
					JOptionPane.showMessageDialog(null,"Country: " + country + " Coronavirus Searches: " + query1 + " Coronavirus Test Searches: " + query2 + " Coronavirus Symptoms Searches: " + query3 + " Coronavirus Cure Searches: " + query4);
				}
				
				else 
				{
					JOptionPane.showMessageDialog(null,"Record not found");
				}
					
			} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}


}
