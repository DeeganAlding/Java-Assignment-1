package passignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utilities {
	
	private static String fileName = "googledata.csv";
	
	public static void load(ArrayList<Sort> data) {
		String country;
		String line;
		int coronavirus;
		int test;
		int symptoms;
		int cure;
		
		try {
			BufferedReader in = new BufferedReader (new FileReader (fileName));
			while ((line = in.readLine())!= null) {
				String[] fields = line.split(",");
				country = fields[0];
				coronavirus = Integer.parseInt(fields[1]);
				test = Integer.parseInt(fields[2]);
				symptoms = Integer.parseInt(fields[3]);
				cure = Integer.parseInt(fields[4]);
				data.add(new Sort(country, coronavirus, test, symptoms, cure));
			}		
		
	} catch(IOException e ) {
		System.out.println("File missing");
	}for (Sort item: data) {
		System.out.println(item);
	}
		
	}
		

}
