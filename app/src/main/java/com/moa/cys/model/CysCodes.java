package com.moa.cys.model;


import java.util.ArrayList;

public class CysCodes {
	
	private static CysCodes ourInstance = new CysCodes();
	private ArrayList<String> colors = new ArrayList<>();
	private ArrayList<String> sizes = new ArrayList<>();
	private ArrayList<String> genders = new ArrayList<>();
	
	
	public static CysCodes get() {
		return ourInstance;
	}
	
	public CysCodes() {
		
		colors.add("White");
		colors.add("Black");
		colors.add("Red");
		colors.add("Blue");
		colors.add("Gray");
		
		sizes.add("Small");
		sizes.add("Medium");
		sizes.add("Large");
		sizes.add("Extra Large");
		colors.add("XXLarge");
		
		genders.add("Woman");
		genders.add("Man");
		
	}
	
	public ArrayList<String> getColors() {
		return colors;
	}
	
	public ArrayList<String> getSizes() {
		return sizes;
	}
	public ArrayList<String> getGenders() {
		return genders;
	}
	
}
