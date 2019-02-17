//Almicke "Mickey" Navarro 
//CST135
//January 28, 2019 
//This is my own work. 

//This class represents a business contact that extends from the base contact
package model;

public class businessContact extends baseContact {
	private String businessHours; 
	private String website;
	private String description; 

	public businessContact(int id, String name, int phoneNumber, String emailAddress, int location_id, int photo_id, String businessHours, String website, String description) {
		super(id, name, phoneNumber, emailAddress, location_id, photo_id);
		this.businessHours = businessHours; 
		this.website = website; 
		this.description = description; 
		
	}

	public String getBusinessHours() {
		return businessHours;
	}

	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	//TODO : create a method to load the business website url into the web browser
	public void openURLinBrowser() { 
		System.out.println("We are now loading... " + this.getWebsite());
	}

	@Override
	public int compareTo(baseContact o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() { 
		return this.getName() +" "+ this.getPhoneNumber() +" "+ this.getEmailAddress() +" "+  this.getLocation_id() +" "+ this.getPhoto_id() + " " + this.businessHours +" "+ this.website +" "+ this.description; 

	}
	
	public businessContact findById(int id) { 
		businessContact bc = new businessContact(this.getId(), this.getName(), this.getPhoneNumber(), this.getEmailAddress(), this.getLocation_id(), this.getPhoto_id(), this.businessHours, this.website, this.description); 
		return bc; 
	}

}
