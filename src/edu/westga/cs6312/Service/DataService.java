/**
 * 
 */
package edu.westga.cs6312.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import edu.westga.cs6312.Model.Contact;

/**
 * DataService class to read file
 * 
 * @author justinmaxwell
 * @version 3/19/23
 */
public class DataService {
	
	/**
	 * read data from contact_data.csv
	 * @return ArrayList of contacts 
	 */
	public static ArrayList<Contact> readContactCsv() {
		ArrayList<Contact> contacts = new ArrayList<>();

		File file = new File("contact_data.csv");

		try (Scanner input = new Scanner(file);) {
			input.useDelimiter(",");
			while (input.hasNext()) {
				String firstName = input.next();
				String lastName = input.next();
				String email = input.next();
				String address = input.next();
				String city = input.next();
				String state = input.next();
				String postal = input.nextLine().replace(",", "");

				Contact newContact = new Contact(firstName, lastName, email, address, city, state, postal);

				contacts.add(newContact);
				// System.out.println(newContact.toString());
			}

			input.close();
		} catch (FileNotFoundException e) {
			logExceptions(e.toString());
		}

		return contacts;
	}
	
	/**
	 * Write arraylist of contacts to contact_output.txt file
	 * @param contacts
	 * @throws Exception
	 */
	public static void writeContactDetails(ArrayList<String> contacts) {
		File file = new File("contact_output");
		

		try (PrintWriter output = new PrintWriter(file);) {
			for (int index = 0; index < contacts.size(); index++) {
				output.println(contacts.get(index));
			}

			output.close();
		} catch (FileNotFoundException e) {
			logExceptions(e.toString());
		}
	}

	/**
	 * Write log exceptions to error_log file -- if file exists, append new exception else create new file
	 * @param exception
	 */
	public static void logExceptions(String exception) {
		ArrayList<String> errors = new ArrayList<>();
		File file = new File("error_log");
		
		if (file.exists()) {
			try (Scanner input = new Scanner(file);) {
				while (input.hasNext()) {
					String error = input.nextLine();
					errors.add(error);
				}
				input.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			try (PrintWriter output = new PrintWriter(file);) {
				for (int index = 0; index < errors.size(); index++) {
					output.println(errors.get(index));
				}
				output.println(exception);
				output.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			try (PrintWriter output = new PrintWriter(file);) {
				output.println(exception);

				output.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

}
