package passignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sort {
	
	private String country;
	private int coronavirus;
	private int test;
	private int symptoms;
	private int cure;	
	
	public Sort(String country, int coronavirus, int test, int symptoms, int cure) {
		super();
		this.country = country;
		this.coronavirus = coronavirus;
		this.test = test;
		this.symptoms = symptoms;
		this.cure = cure;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getCoronavirus() {
		return coronavirus;
	}
	public void setCoronavirus(int coronavirus) {
		this.coronavirus = coronavirus;
	}
	public int getTest() {
		return test;
	}
	public void setTest(int test) {
		this.test = test;
	}
	public int getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(int symptoms) {
		this.symptoms = symptoms;
	}
	public int getCure() {
		return cure;
	}
	public void setCure(int cure) {
		this.cure = cure;
	}

	 


}
