

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactClass() {
		
		Contact contact = new Contact("Kyle", "Gaskill", "1234567890", "101 Basketball Ln", "1245");
		assertTrue(contact.getFirstName().equals("Kyle"));
		assertTrue(contact.getLastName().equals("Gaskill"));
		assertTrue(contact.getNumber().equals("1234567890"));
		assertTrue(contact.getAddress().equals("101 Basketball Ln"));
		assertTrue(contact.getContactId().equals("1245"));
	}
	
	@Test
	void testContactClassNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("KYLEGASKILL12", "12345", "123454", "101 sal32aslkdfjs;ldkfja;sdlfkj;salddsfasdfsdfasdf", "12345678900");
		});
	}
}
