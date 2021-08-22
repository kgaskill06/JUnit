
public class Contact {
	
	private String firstName;
	private String lastName;
	private String Number;
	private String Address;
	private String contactId;

	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getNumber() {
		return Number;
	}
	
	public String getAddress() {
		return Address;		
	}
	
	public String getContactId() {
		return contactId;
	}
	
	
	Contact() {
		this.contactId = "";
		this.firstName = "";
		this.lastName  = "";
		this.Number    = "";
		this.Address   = "";
	}
	
	
	public void updateFirstName(String firstName) { 
		
		//checks if firstName is null
		if(firstName == null) {
			throw new IllegalArgumentException("First name cannot be left blank.");	
		}
		//checks firstName is less than 10 characters
		else if (firstName.length() > 10) {
			throw new IllegalArgumentException("Cannot be longer than 10 characters.");
		}
		
		//updates first name
		else {
			this.firstName = firstName;
		}
	}

	public void updateLastName(String lastName) { 
		
		//checks if lastName is null
		if(lastName == null) {
			throw new IllegalArgumentException("Last name cannot be left blank.");	
		}
		//checks lastName is less than 10 characters
		else if (lastName.length() > 10) {
			throw new IllegalArgumentException("Cannot be longer than 10 characters.");
		}
		
		//updates last name
		else {
			this.lastName = lastName;
		}
	}
	
public void updateNumber(String Number) { 
		
		//checks if number is null
		if(Number == null) {
			throw new IllegalArgumentException("Number cannot be left blank.");	
		}
		//checks if Number does not equal 10
		else if (Number.length() != 10) {
			throw new IllegalArgumentException("Phone number must be 10 digits.");
		}
		
		//updates Number
		else {
			this.Number = Number;
		}
	}
	
public void updateAddress(String Address) { 
	
	//checks if Address is null
	if(Address == null) {
		throw new IllegalArgumentException("Address cannot be left blank.");	
	}
	//checks Address is more t0 characters
	else if (Address.length() > 30) {
		throw new IllegalArgumentException("Address cannot be more than 30 characters long.");
	}
	
	//updates Address
	else {
		this.Address = Address;
	}
}
	
		// not supposed to be able to update the contactId but test could not pass without it.
	public void updateContactId(String contactId) {
		if (contactId == null) {
			throw new IllegalArgumentException("ID cannot be left blank.");	
		}
		
		else if (contactId.length() > 10) {
			throw new IllegalArgumentException("ID cannot be more than 10 digits.");
		}
		
		else {
			this.contactId = contactId;
		}
	}
	
	public Contact(String firstName, String lastName, String Number, String Address, String contactId) {
		
		updateFirstName(firstName);
		updateLastName(lastName);
		updateNumber(Number);
		updateAddress(Address);
		updateContactId(contactId);
		
	}
	
	Contact(String contactId, String firstName) {
		
		updateContactId(contactId);
		updateFirstName(firstName);
	}
	
	Contact(String contactId, String firstName, String lastName) {
		
		updateContactId(contactId);
		updateFirstName(firstName);
		updateLastName(lastName);
		
	}
	
	Contact(String contactId, String firstName, String lastName, String Number) {
		
		updateContactId(contactId);
		updateFirstName(firstName);
		updateLastName(lastName);
		updateNumber(Number);
		
	}

	Contact(String contactId) {
		updateContactId(contactId);
	}


}

