import java.util.List;
import java.util.UUID;
import java.util.ArrayList;





public class ContactService {
	
	private String id;
 List<Contact> contactList = new ArrayList<>(); {
		
		id = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10)); //unique id passed through string
	}
	
	// generates unique id
	public String createId() {
		
		id = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
		
		return id;
	}
	
	//for testing contact updates per ID
	public String staticContactId() {
		
		return id = "123456";
	}
	
	// get contactList
	public List<Contact> getContactList() {
		
		return contactList;
	}
	
	// search list by credentials
	public Contact searchList(String id) throws Exception {
		
		for (int i = 0; i < contactList.size(); i++) {
			if (id.equals(contactList.get(i).getContactId())) {
				
				return contactList.get(i);
			}
		}
		
		throw new Exception("ID not Found");
	}
	
	// add new contact to list
	public void addContact() {
		
		Contact contact = new Contact(createId());
		contactList.add(contact);
		
	}
	
	public void newContactStaticTest() {
		
		Contact contact = new Contact(staticContactId());
		contactList.add(contact);
		
	}
	
	/*public void deleteContactStatic(String id) throws Exception {
		
		newContactStaticTest();
		contactList.remove(id);
		
	} */
	
	// add w/ first name
	public void addContact(String firstName) {
		Contact contact = new Contact(createId(), firstName);
		contactList.add(contact);
	}
	
	// add w/ first & last name
	public void addContact(String firstName, String lastName) {
		
		Contact contact = new Contact(createId(), firstName, lastName);
		contactList.add(contact);
		
	}
	
	// add w/ first, last, and number
	public void addContact(String firstName, String lastName, String Number) {
		
		Contact contact = new Contact(createId(), firstName, lastName, Number);
		contactList.add(contact);
		
	}
	
	// add w/ first, last, number and address
	public void addContact(String firstName, String lastName, String Number, String Address) {
		
		Contact contact = new Contact(createId(), firstName, lastName, Number, Address);
		contactList.add(contact);
		
	}

	public void updateFirstName(String firstName) throws Exception {
		
		searchList(id).updateFirstName(firstName);
	}
	
	public void updateLastName(String lastName) throws Exception {
		
		searchList(id).updateLastName(lastName);
	}
	
	public void updateNumber(String Number) throws Exception {
		
		searchList(id).updateNumber(Number);
	}
	
	public void updateAddress(String Address) throws Exception {
		
		searchList(id).updateAddress(Address);
	}
	
	public void removeContact(String id) throws Exception {
		
		contactList.remove(searchList(id));
	}
	
	
	

}
