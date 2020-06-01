package passignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sort {

	 private static Scanner x;
	 public static ArrayList<ArrayList<String>> lines = new ArrayList<>();
	 
	 public static void StoreToArray()
	 {
		 String fileName = "googledata.csv";
		 File file = new File(fileName);
		 
		 
	     Scanner inputStream;
	     
	     try{
	            inputStream = new Scanner(file);

	            while(inputStream.hasNext()){
	                String line= inputStream.next();
	                String[] values = line.split(",");
	                lines.add((ArrayList<String>) Arrays.asList(values));
	            }
	            
	            inputStream.close();
	            
	     }catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	     
		 
	 }
	
	 public static void SortToArray()
	 {
		 String fileName = "googledata.csv";
			File file = new File(fileName);
			Main obj = new Main();
			ArrayList[] data = new ArrayList[250];
			
			try {
			Scanner inputStream = new Scanner(file);
				while (inputStream.hasNext()) {
					String datas = inputStream.next();
					
					for (int i = 0; i < data.length; i++)
					{
						data[i] = datas;
					}
					
					System.out.println(data);
				}
				inputStream.close();
			} 
			
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
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
