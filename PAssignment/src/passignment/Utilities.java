package passignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author Deegan Alding
 *
 */

public class Utilities {
	
	
	private static ArrayList<Sort> sort;
	private static String fileName = "googledata.csv";

/**
 * Loads csv file and splits data on commas
 * @param data
 */
	
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
			
			sort = data;
		
	} catch(IOException e ) {
		System.out.println("File missing");
	}for (Sort item: data) {
		System.out.println(item);
	}
			
	}
	
/**
 * Returns average searches for Coronavirus Cure	
 * @return
 */
	
	public static String findAverageCure() 
	{
		int average = 0;
		
		for (int i = 0; i < 250; i++) {
			
			int test = + sort.get(i).getCure(); 
			average = test + average;								
		}
		
		average = average / 250;
	
		String number = Integer.toString(average);
		
		return number;					
	}
	
/**
 * Returns Min searches for Coronavirus Cure
 * @return
 */
	
	public static String findMinCure() 
	{
		int min = 0;
		
		for (int i = 0; i < 250; i++) {
			
			int test = sort.get(i).getCure(); 
			
			if (test < min)
			{
				min = test;
			}						
		}
		
		String number = Integer.toString(min);
		
		return number;					
	}
	
/**
 * Returns Max searches for Coronavirus Cure
 * @return
 */
	
	public static String findMaxCure() 
	{
		int max = 0;
		
		for (int i = 0; i < 250; i++) {
			
			int test = sort.get(i).getCure(); 
			
			if (test > max)
			{
				max = test;
			}						
		}
		
		String number = Integer.toString(max);
		
		return number;					
	}
	
/**
 * Returns Average searches for Coronavirus Symptoms
 * @return
 */
	
	public static String findAverageSymptoms() 
	{
		int average = 0;
		
		for (int i = 0; i < 250; i++) {
			
			int test = + sort.get(i).getSymptoms(); 
			average = test + average;								
		}
		
		average = average / 250;
	
		String number = Integer.toString(average);
		
		return number;					
	}
	
/**
 * Returns Min searches for Coronavirus Symptoms
 * @return
 */
	
	public static String findMinSymptoms() 
	{
		int min = 0;
		
		for (int i = 0; i < 250; i++) {
			
			int test = sort.get(i).getSymptoms(); 
			
			if (test < min)
			{
				min = test;
			}						
		}
		
		String number = Integer.toString(min);
		
		return number;					
	}
	
/**
 * Returns Max searches for Coronavirus Symptoms
 * @return
 */
	
	public static String findMaxSymptoms() 
	{
		int max = 0;
		
		for (int i = 0; i < 250; i++) {
			
			int test = sort.get(i).getSymptoms(); 
			
			if (test > max)
			{
				max = test;
			}						
		}
		
		String number = Integer.toString(max);
		
		return number;					
	}
	
/**
 * Returns Average searches for Coronavirus Test
 * @return
 */
	
	public static String findAverageTest() 
	{
		int average = 0;
		
		for (int i = 0; i < 250; i++) {
			
			int test = + sort.get(i).getTest(); 
			average = test + average;								
		}
		
		average = average / 250;
	
		String number = Integer.toString(average);
		
		return number;					
	}
	
/**
 * Returns Min searches for Coronavirus Test
 * @return
 */
	
	public static String findMinTest() 
	{
		int min = 0;
		
		for (int i = 0; i < 250; i++) {
			
			int test = sort.get(i).getTest(); 
			
			if (test < min)
			{
				min = test;
			}						
		}
		
		String number = Integer.toString(min);
		
		return number;					
	}
	
/**
 * Returns Max searches for Coronavirus Test
 * @return
 */
	
	
	public static String findMaxTest() 
	{
		int max = 0;
		
		for (int i = 0; i < 250; i++) {
			
			int test = sort.get(i).getTest(); 
			
			if (test > max)
			{
				max = test;
			}						
		}
		
		String number = Integer.toString(max);
		
		return number;					
	}
	
/**
 *  Returns Average searches for Coronavirus
 * @return
 */
	
	public static String findAverageCoronavirus() 
	{
		int average = 0;
		
		for (int i = 0; i < 250; i++) {
			
			int test = + sort.get(i).getCoronavirus(); 
			average = test + average;								
		}
		
		average = average / 250;
	
		String number = Integer.toString(average);
		
		return number;					
	}
	
/**
 * Returns Min searches for Coronavirus
 * @return
 */
	
	public static String findMinCoronavirus() 
	{
		int min = 0;
		
		for (int i = 0; i < 250; i++) {
			
			int test = sort.get(i).getCoronavirus(); 
			
			if (test < min)
			{
				min = test;
			}						
		}
		
		String number = Integer.toString(min);
		
		return number;					
	}
	
/**
 * Returns Max searches for Coronavirus
 * @return
 */
	
	
	public static String findMaxCoronavirus() 
	{
		int max = 0;
		
		for (int i = 0; i < 250; i++) {
			
			int test = sort.get(i).getCoronavirus(); 
			
			if (test > max)
			{
				max = test;
			}						
		}
		
		String number = Integer.toString(max);
		
		return number;					
	}		
}
