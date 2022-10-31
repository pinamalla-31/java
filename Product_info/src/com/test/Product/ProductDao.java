package com.test.Product;

import java.util.ArrayList;

public interface ProductDao {
	public ArrayList<Electronics> displayElectronics();
	public void buyElectronics(Electronics electronics);
	public void diplayKitchen();
	public void buyCloths(Cloths cloth);
	public void displayCloths(Cloths cloth);
	public void displayBath();
	

}
