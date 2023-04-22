package edu.westga.cs6312.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.Model.Contact;

class TestContactClass {
	private Contact contact;
	
	@BeforeEach
	void setUp() throws Exception {
		this.contact = new Contact("John", "Doe", "sample@gmail.com", "123 Main St.", "Atlanta", "Georgia", "30000");
	}

	@AfterEach
	void tearDown() throws Exception {
		this.contact = null;
	}

	@Test
	void testValidConstructor() {
		assertEquals("John", this.contact.getFirstName(), "Testing Constructor");
	}
	
	@Test
	void testSetState() {
		this.contact.setState("Florida");
		assertEquals("Florida", this.contact.getState(), "Testing getState");	
	}
	
	@Test
	void testSetPostal() {
		this.contact.setPostal("31111");
		assertEquals("31111", this.contact.getPostal(), "Testing getPostal");	
	}
	
	@Test
	void testSetCity() {
		this.contact.setCity("Orlando");
		assertEquals("Orlando", this.contact.getCity(), "Testing getCity");	
	}
	
	@Test
	void testSetAddress() {
		this.contact.setAddress("123 Main Rd.");
		assertEquals("123 Main Rd.", this.contact.getAddress(), "Testing getAddress");	
	}
	
	@Test
	void testSetEmail() {
		this.contact.setEmail("123@gamil.com");
		assertEquals("123@gamil.com", this.contact.getEmail(), "Testing getEmail");	
	}
	
	@Test
	void testSetFirstName() {
		this.contact.setFirstName("Test");
		assertEquals("Test", this.contact.getFirstName(), "Testing getFirstName");	
	}
	
	@Test
	void testLastName() {
		this.contact.setLastName("Test");
		assertEquals("Test", this.contact.getLastName(), "Testing getLastName");	
	}

}
