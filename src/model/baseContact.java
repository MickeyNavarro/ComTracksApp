//Almicke "Mickey" Navarro 
//CST135
//January 28, 2019 
//This is my own work. 

//This class represents the base contact that will be used as a super class 
package model;

public class baseContact implements Comparable<baseContact> {
	private int id; 
	private String name; 
	private int phoneNumber; 
	private String emailAddress; 
	private int location_id; 
	private int photo_id; 
	
	//constructor
	public baseContact(int id, String name, int phoneNumber, String emailAddress, int location_id, int photo_id) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.location_id = location_id;
		this.photo_id = photo_id;
		
		//System.out.println("New Base Contact: " + this.name +" "+ this.phoneNumber +" "+ this.emailAddress +" "+  this.location_id +" "+ this.photo_id); 
	}
	
	//setters and getters 
	public int getId() {
		return id; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public int getPhoto_id() {
		return photo_id;
	}

	public void setPhoto_id(int photo_id) {
		this.photo_id = photo_id;
	}

	public String toString() {
		return name; 
	}
		
	//method to edit a contact by replacing their attributes 
	//*** when it becomes an app, the id will be used to access a certain contact
	//**** we would probably use the setters to help with this instead 
	public void edit(int id, baseContact bc) { 
		if (this.getId() == id) { 
			this.name = bc.name; 
			this.phoneNumber = bc.phoneNumber; 
			this.emailAddress = bc.emailAddress; 
			this.location_id = bc.location_id; 
			this.photo_id = bc.photo_id; 
		}
	}
	
	//actions of the contact
	public void textTo(String message) { 
		System.out.println("Now texting " + this.name + " at the number: " + this.phoneNumber); 
		System.out.println("*Message: " + message + "*");
	}
	
	public void callTo() { 
		System.out.println("Now calling " + this.name + " at the number: " + this.phoneNumber); 
	}
	
	public void emailTo(String message) { 
		System.out.println("Now emailing " + this.name + " at the email: " + this.emailAddress); 
		System.out.println("*Message: " + message + "*");
		
	}

	@Override
	public int compareTo(baseContact o) {
		int compareName = this.name.compareTo(o.name); 
		int compareId = this.id - o.id; 

		//if the names match, compare id
		if (compareName == 0) { 
			return compareId; 
		}
		//if names do not match
		else { 
			return compareName; 
		}
	}
	
}
