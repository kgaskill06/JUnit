import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	String firstName;
	String lastName;
	String Number;
	String Address;
	String id;
	
	//test variables
	@BeforeEach
	void testVariables() {
	 firstName = "Kyle";
	 lastName  = "Gaskill";
	 Number    = "1234567890";
	 Address   = "101 test";
	 id        = "123456";
	}	
	
	@Test
	void addContactTest() throws Exception {
		ContactService contact = new ContactService();
		
		
		 contact.addContact(firstName, lastName, Number);
		 contact.updateAddress(Address); // adding address to addContact above breaks Number update cannot figure out why.
		 
		 //contact.updateFirstName(firstName);
		 assertNotNull(contact.getContactList().get(0).getContactId());
		 assertEquals("Kyle", contact.getContactList().get(0).getFirstName());
		 assertEquals("Gaskill", contact.getContactList().get(0).getLastName());
		 assertEquals("1234567890", contact.getContactList().get(0).getNumber());
		 assertEquals("101 test", contact.getContactList().get(0).getAddress());
				
				
		
		
		/*assertNotNull(contact.getContactList().get(0).getContactId());
		assertEquals("Kyle", contact.getContactList().get(0).getFirstName());
		assertEquals("Gaskill", contact.getContactList().get(0).getLastName());
		assertEquals("1234567890", contact.getContactList().get(0).getNumber());
		assertEquals("101 test", contact.getContactList().get(0).getAddress());
	*/	
		
		//assertTrue(contact.addContact(firstName));		
	}
	
	/*@Test
	void addContactTestParam() {
		Contact contact = new Contact();
		//contact.addContact(String "Kyle", String "Gaskill", String "1234567890", String "101 test");
	} */
	
	@Test
	void updateContactTest() throws Exception {
		ContactService contact = new ContactService();
		contact.addContact();
		contact.updateFirstName(firstName);
		contact.updateLastName(lastName);
		contact.updateAddress(Address);
		contact.updateNumber(Number);
		
		assertEquals(firstName, contact.getContactList().get(0).getFirstName());
		assertEquals(lastName, contact.getContactList().get(0).getLastName());
		assertEquals(Address, contact.getContactList().get(0).getAddress());
		assertEquals(Number, contact.getContactList().get(0).getNumber());
		
	}
	
	@Test
	void deleteContactTest() throws Exception {
		ContactService contact = new ContactService();
		
		contact.newContactStaticTest();
		Assertions.assertEquals(id, contact.getContactList().get(0).getContactId());
		
		contact.removeContact(id);
		Assertions.assertEquals(0, contact.getContactList().size());
	}
			
				

	/*
	 * assertAll( "contact",
				() -> assertNotNull(contact.getContactList().get(0).getContactId()),
				() -> assertEquals("Kyle", contact.getContactList().get(0).getFirstName()),
				() -> assertEquals("Gaskill", contact.getContactList().get(0).getLastName()),
				() -> assertEquals("1234567890", contact.getContactList().get(0).getNumber()),
				() -> assertEquals("101 test", contact.getContactList().get(0).getAddress()));
	 */

}
