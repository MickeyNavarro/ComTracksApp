//Almicke "Mickey" Navarro 
//CST135
//January 28, 2019 
//This is my own work. 

//This class is used to test the app and output the results onto the console. 
import java.sql.Date;
import java.util.Iterator;

import model.addressBook;
import model.baseContact;
import model.businessContact;
import model.personalContact;

public class ConsoleApp {

	public static void main(String[] args) {				
		//create 3 instances of contacts
		personalContact personal = new personalContact(1, "Jane Doe", 1234567890, "jd@gmail.com", 1, 1, "January 1, 1999", "none", "Friend");  
		businessContact business =  new businessContact(2, "Dutch Bros", 199999992, "dbaz@gmail.com", 2, 2, "5 AM - 11 PM", "www.dutchbros.com", "Coffee company"); 
		businessContact business2 =  new businessContact(3, "Starbucks", 199999992, "starbucks@gmail.com", 3, 3, "5 AM - 8 PM", "www.starbucks.com", "Coffee company"); 
		
		
		//create an instance of the address book to add our contacts to 
		addressBook abook = new addressBook(); 
		
		//add the three new contacts to the address book
		abook.add(personal);
		abook.add(business);
		abook.add(business2);
		
		//check what happens when you try to add a contact already in the address book 
		abook.add(personal);
		
		//print out each contact
		System.out.println(personal);
		System.out.println(business); 
		System.out.println(business2); 
		
		//print out the address book 
		for (int i = 0; i<abook.getListOfContacts().size(); i++) { 
			System.out.println(abook.getListOfContacts().get(i));
		}
		
		//search for a contact with an "a" in their name then output the results
		System.out.println("Search results...");
		for (baseContact bc : abook.search("a")) { 
			System.out.println(bc);
		}
		
		//display a contact 
		System.out.println("On Display..." + abook.displayOne(1));
		
		//edit a contact by overriding their old attributes 
		System.out.println("Editting..." + personal);
		personalContact personalEdit = new personalContact(1, "Jane Doe", 1234567890, "jd@yahoo.com", 6, 7, "January 1, 1999", "none", "Friend");  
		personal.edit(1, personalEdit);
		System.out.println(personal.getEmailAddress());
		System.out.println(personal.getLocation_id()); 
		System.out.println(personal.getPhoto_id()); 

		//delete a contact 
		abook.remove(business); 
		
		//print out the address book to show that the business contact was deleted
		for (int i = 0; i<abook.getListOfContacts().size(); i++) { 
			System.out.println(abook.getListOfContacts().get(i));
		}
		
		//show the actions of a personal contact 
		personal.callTo();
		personal.emailTo("Hello");
		personal.textTo("Hey");
		
		//show the actions of a business contact
		business2.callTo();
		business2.emailTo("Hello");
		business2.textTo("Hey");
		business2.openURLinBrowser();
		
		
	}

}
