//Almicke "Mickey" Navarro 
//CST135
//January 28, 2019 
//This is my own work. 

//This class represents a personal contact that extends from the base contact
package model;

//import to allow the use of a date format of yyyy-mm-dd
import java.sql.Date;

public class personalContact extends baseContact {
	private String dateOfBirth; 
	private String relation; 
	private String nickname; 

	public personalContact(int id, String name, int phoneNumber, String emailAddress, int location_id, int photo_id, String dateOfBirth, String relation, String nickname) {
		super(id, name, phoneNumber, emailAddress, location_id, photo_id);
		this.dateOfBirth = dateOfBirth; 
		this.relation = relation; 
		this.nickname = nickname; 
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public int compareTo(baseContact o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() { 
		return this.getName() +" "+ this.getPhoneNumber() +" "+ this.getEmailAddress() +" "+  this.getLocation_id() +" "+ this.getPhoto_id() + " " + this.dateOfBirth +" "+ this.nickname +" "+ this.relation; 

	}
	
	public personalContact findById(int id) { 
		personalContact bc = new personalContact(this.getId(), this.getName(), this.getPhoneNumber(), this.getEmailAddress(), this.getLocation_id(), this.getPhoto_id(), this.dateOfBirth, this.nickname, this.relation); 
		return bc; 
	}

}
