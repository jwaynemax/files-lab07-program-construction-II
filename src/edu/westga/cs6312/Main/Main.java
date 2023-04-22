/**
 * 
 */
package edu.westga.cs6312.Main;

import java.util.ArrayList;

import edu.westga.cs6312.Model.Contact;
import edu.westga.cs6312.Service.DataService;

/**
 * Main class
 * @author justinmaxwell
 * @version 3/19/23
 */
public class Main {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
				
		//read CSV
		DataService.readContactCsv();
		
		//write first, last, and three random values to contact_output
		ArrayList<String> array = new ArrayList<>();
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;
		
		for (int i = 1; i <= 3; i++) {
			r1 = (int) Math.floor(Math.random() * (999 - 1 + 1) + 1); 
			r2 = (int) Math.floor(Math.random() * (999 - 1 + 1) + 1); 
			r3 = (int) Math.floor(Math.random() * (999 - 1 + 1) + 1); 
		}
		
		array.add(DataService.readContactCsv().get(0).toString());
		array.add(DataService.readContactCsv().get(DataService.readContactCsv().size() - 1).toString());
		array.add(DataService.readContactCsv().get(r1).toString());
		array.add(DataService.readContactCsv().get(r2).toString());
		array.add(DataService.readContactCsv().get(r3).toString());
				
		DataService.writeContactDetails(array);
				
	}

}
