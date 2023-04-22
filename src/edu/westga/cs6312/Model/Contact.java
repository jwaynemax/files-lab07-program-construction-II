/**
 * 
 */
package edu.westga.cs6312.Model;

import edu.westga.cs6312.Service.DataService;

/**
 * Contact class to define fields from file
 * @author justinmaxwell
 * @version 3/19/23
 *
 */
public class Contact {
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String city;
	private String state;
	private String postal;	
	
	
	public Contact(String firstName, String lastName, String email, String address, String city, String state, String postal) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setAddress(address);
		this.setCity(city);
		this.setState(state);
		this.setPostal(postal);
	}
	
	/**
	 * Returns firstName
	 * @return the firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}
	/**
	 * Sets firstName
	 * @precondition cannot be null, empty string, whitespace
	 * @postcondition none
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		try {
			if (firstName.isEmpty() || firstName.equals("") || firstName.equals(" ") || firstName.equals(null)) {
				throw new IllegalArgumentException("firstName cannot be null, an empty string, or only white space.");
			}
			
			this.firstName = firstName;
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			DataService.logExceptions(e.toString());
		}
	}
	/**
	 * Returns lastName
	 * @return the lastName
	 */
	public String getLastName() {
		return this.lastName;
	}
	/**
	 * Sets lastName
	 * @precondition cannot be null, empty string, whitespace
	 * @postcondition none
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		try {
			if (lastName.isEmpty() || lastName.equals("") || lastName.equals(" ") || lastName.equals(null)) {
				throw new IllegalArgumentException("lastName cannot be null, an empty string, or only white space.");
			}
			
			this.lastName = lastName;
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			DataService.logExceptions(e.toString());
		}
	}
	/**
	 * Returns email
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}
	/**
	 * Sets email
	 * @precondition cannot be null, empty string, whitespace, must be a valid address
	 * @postcondition none
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		try {
			if (email.isEmpty() || email.equals("") || email.equals(" ") || email.equals(null) || !email.contains("@") || !email.contains(".")) {
				throw new IllegalArgumentException("email cannot be null, an empty string, only white space and must be a valid address.");
			}
			
			this.email = email;
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			DataService.logExceptions(e.toString());
		}
	}
	/**
	 * Returns address
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * Sets address
	 * @precondition cannot be null, empty string, whitespace
	 * @postcondition none
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		try {
			if (address.isEmpty() || address.equals("") || address.equals(" ") || address.equals(null)) {
				throw new IllegalArgumentException("address cannot be null, an empty string, or only white space.");
			}
			
			this.address = address;
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			DataService.logExceptions(e.toString());
		}
	}
	/**
	 * Returns city
	 * @return the city
	 */
	public String getCity() {
		return this.city;
	}
	/**
	 * Sets city
	 * @precondition cannot be null, empty string, whitespace
	 * @postcondition none
	 * @param city the city to set
	 */
	public void setCity(String city) {
		try {
			if (city.isEmpty() || city.equals("") || city.equals(" ") || city.equals(null)) {
				throw new IllegalArgumentException("city cannot be null, an empty string, or only white space.");
			}
			this.city = city;
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			DataService.logExceptions(e.toString());
		}
	}
	/**
	 * Returns state
	 * @return the state
	 */
	public String getState() {
		return this.state;
	}
	/**
	 * Sets state
	 * @precondition cannot be null, empty string, whitespace
	 * @postcondition none
	 * @param state the state to set
	 */
	public void setState(String state) {
		
		try {
			if (state.isEmpty() || state.equals("") || state.equals(" ") || state.equals(null)) {
				throw new IllegalArgumentException("state cannot be null, an empty string, or only white space.");
			}
			
			this.state = state;
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			DataService.logExceptions(e.toString());
		}
	}
	/**
	 * Returns postal
	 * @return the postal
	 */
	public String getPostal() {
		return this.postal;
	}
	/**
	 * Sets postal
	 * @precondition cannot be null, empty string, whitespace or less than 5 chars
	 * @postcondition none
	 * @param postal the postal to set
	 */
	public void setPostal(String postal) {
		try {
			if (postal.isEmpty() || postal.equals("") || postal.equals(" ") || postal.equals(null) || postal.length() < 5) {
				throw new IllegalArgumentException("postal cannot be null, an empty string, only white space, or less than 5 characters.");
			}
			this.postal = postal;
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			DataService.logExceptions(e.toString());
		}
	}

	/**
	 * Override toString to print contact details
	 */
	@Override
	public String toString() {
		return "Contact Details - firstName: " + this.firstName + ", lastName: " + this.lastName + ", email: " + this.email + ", address: "
				+ this.address + ", city: " + this.city + ", state: " + this.state + ", postal: "  + this.postal;
	}
	
	

}
