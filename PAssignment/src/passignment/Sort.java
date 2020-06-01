package passignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author Deegan Alding
 *
 */

public class Sort {
	
	private String country;
	private int coronavirus;
	private int test;
	private int symptoms;
	private int cure;	
	
/**
 * Gets and sets variables for the data
 * @param country
 * @param coronavirus
 * @param test
 * @param symptoms
 * @param cure
 */
	
	public Sort(String country, int coronavirus, int test, int symptoms, int cure) {
		super();
		this.country = country;
		this.coronavirus = coronavirus;
		this.test = test;
		this.symptoms = symptoms;
		this.cure = cure;
	}
	
/**
 * Gets and returns country string
 * @return
 */
	
	public String getCountry() {
		return country;
	}
	
/**
 * Sets and returns country
 * @param country
 */
	
	public void setCountry(String country) {
		this.country = country;
	}

/**
 * Gets and returns coronavirus int
 * @return
 */

	public int getCoronavirus() {
		return coronavirus;
	}
	
/**
 * Sets coronavirus
 * @param coronavirus
 */
	
	public void setCoronavirus(int coronavirus) {
		this.coronavirus = coronavirus;
	}
	
/**
 * Gets test and returns int
 * @return
 */
	
	public int getTest() {
		return test;
	}
	
/**
 * Sets test
 * @param test
 */
	
	public void setTest(int test) {
		this.test = test;
	}

/**
 * Gets symptoms and returns int
 * @return
 */
	
	public int getSymptoms() {
		return symptoms;
	}
	
/**
 * Sets symptoms 
 * @param symptoms
 */
	
	public void setSymptoms(int symptoms) {
		this.symptoms = symptoms;
	}
	
/**
 * Gets cure and returns int
 * @return
 */
	
	public int getCure() {
		return cure;
	}
	
/**
 * Sets cure
 * @param cure
 */
	
	public void setCure(int cure) {
		this.cure = cure;
	}

	 


}
