//Almicke "Mickey" Navarro 
//CST135
//January 28, 2019 
//This is my own work. 

//This class represents the address book; this address book will be able to add, delete, display, sort, and search through contact(s).
package model;

import java.util.ArrayList;
import java.util.List;

public class addressBook {
	private List<baseContact> listOfContacts; 
	
	public addressBook() { 
		this.listOfContacts = new ArrayList<baseContact>(); 
	}
	
	public List<baseContact> getListOfContacts() {
		return listOfContacts;
	}


	public void setListOfContacts(List<baseContact> listOfContacts) {
		this.listOfContacts = listOfContacts;
	}

	public <T extends baseContact>void add(T contact) { 
		if (listOfContacts.contains(contact)) { 
			System.out.println(contact.getName() + " has already been added to your address book.");
		}
		else { 
			listOfContacts.add(contact); 
			System.out.println(contact.getName() + " has been added to your address book.");
		}
	}
	
	public <T extends baseContact> boolean remove(T contact) {
		if (listOfContacts.contains(contact)) { 
			listOfContacts.remove(contact); 
			//System.out.println(contact.getName() + " has been removed from your address book.");
			return true; 
			
		}
		else { 
			//System.out.println(contact.getName() + " does not exist in your address book. ");
			return false; 
		}
	}
	
	public baseContact displayOne(int id) { 
		for (baseContact contact : listOfContacts) {
	        if (contact.getId() == id ) {
	            return contact;
	        }
	    }
		return null;
	}
	
	public ArrayList<baseContact> search(String property) { 
		ArrayList<baseContact> results = new ArrayList<baseContact>(); 
		for (baseContact contact : listOfContacts) {
	        if (contact.getName().contains(property)) {
	            results.add(contact); 
	        }
	    }
		return results; 
	}
	
}
