package passignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileNotFoundException;

public class Main{
	
    Sort sort = new Sort();
	
	private static Scanner x;

	public static void main(String[] args) {
		
		sort.SearchByName();
	}
		
		
		
//		List<ArrayList<String>> csvLines = new ArrayList<ArrayList<String>>();
//		Comparator<ArrayList<String>> comp = new Comparator<ArrayList<String>>() {
//		    public int compare(ArrayList<String> csvLine1, ArrayList<String> csvLine2) {
//		        // TODO here convert to Integer depending on field.
//		        // example is for numeric field 2
//		        return Integer.valueOf(csvLine1.get(2)).compareTo(Integer.valueOf(csvLine2.get(2)));
//		    }
//		};
//		Collections.sort(csvLines, comp);

	}

}
