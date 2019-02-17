//Almicke "Mickey" Navarro 
//CST135
//January 28, 2019 
//This is my own work. 

//This class is used to test the app and output the results onto the console. 
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import model.addressBook;
import model.businessContact;
import model.location;
import model.personalContact;
import model.photo;

public class ConsoleApp {

	public static void main(String[] args) {				
		//create 3 instances of contacts, locations, and photos that belong to a single contact
		photo p1 = new photo(1, "photo1.jpg", "February 17, 2019", "None"); 
		location l1 = new location(1, "1111 Fake Addy", "Fake City", "Fake State", "1111", "Fake Contry"); 
		personalContact personal = new personalContact(1, "Jane Doe", 1234567890, "jd@gmail.com", 1, 1, "January 1, 1999", "none", "Friend");  
		
		photo p2 = new photo(2, "photo1.jpg", "February 17, 2019", "None"); 
		location l2 = new location(2, "1111 Fake Addy", "Fake City", "Fake State", "1111", "Fake Contry"); 
		businessContact business =  new businessContact(2, "Dutch Bros", 199999992, "dbaz@gmail.com", 2, 2, "5 AM - 11 PM", "www.dutchbros.com", "Coffee company"); 
		
		photo p3 = new photo(3, "photo1.jpg", "February 17, 2019", "None"); 
		location l3 = new location(3, "1111 Fake Addy", "Fake City", "Fake State", "1111", "Fake Contry"); 
		businessContact business2 =  new businessContact(3, "Starbucks", 199999992, "starbucks@gmail.com", 3, 3, "5 AM - 8 PM", "www.starbucks.com", "Coffee company"); 
		
		
		//create an instance of the address book to add our contacts to 
		addressBook abook = new addressBook(); 
		
		//add the three new contacts to the address book
		abook.add(personal);
		abook.add(business);
		abook.add(business2);
		
		
		System.out.println(); 
		
		//check what happens when you try to add a contact already in the address book 
		//abook.add(personal);
			
		
		/*
		 * //print out each contact System.out.println(personal);
		 * System.out.println(business); System.out.println(business2);
		 * 
		 * //print out the address book for (int i = 0;
		 * i<abook.getListOfContacts().size(); i++) {
		 * System.out.println(abook.getListOfContacts().get(i)); }
		 * 
		 * //search for a contact with an "a" in their name then output the results
		 * System.out.println("Search results..."); for (baseContact bc :
		 * abook.search("a")) { System.out.println(bc); }
		 * 
		 * //display a contact System.out.println("On Display..." +
		 * abook.displayOne(1));
		 * 
		 * //edit a contact by overriding their old attributes
		 * System.out.println("Editting..." + personal); personalContact personalEdit =
		 * new personalContact(1, "Jane Doe", 1234567890, "jd@yahoo.com", 6, 7,
		 * "January 1, 1999", "none", "Friend"); personal.edit(1, personalEdit);
		 * System.out.println(personal.getEmailAddress());
		 * System.out.println(personal.getLocation_id());
		 * System.out.println(personal.getPhoto_id());
		 * 
		 * //delete a contact abook.remove(business);
		 * 
		 * //print out the address book to show that the business contact was deleted
		 * for (int i = 0; i<abook.getListOfContacts().size(); i++) {
		 * System.out.println(abook.getListOfContacts().get(i)); }
		 * 
		 * //show the actions of a personal contact personal.callTo();
		 * personal.emailTo("Hello"); personal.textTo("Hey");
		 * 
		 * //show the actions of a business contact business2.callTo();
		 * business2.emailTo("Hello"); business2.textTo("Hey");
		 * business2.openURLinBrowser();
		 */
		
		//output a welcome statement with a choice to output certain list of contacts 
		System.out.println("Welcome to ComTracks!"); 
		System.out.println("The app where you can communicate with and keep track of contacts!"); 
		System.out.println(); 
		System.out.println("List of Contacts: All Contacts, Personal Contacts, or Business Contacts"); 
		System.out.println("Please type which list of contacts you would like to see: "); 
		
		//create a scanner to read user input 
		Scanner s = new Scanner(System.in);
		
		//create a bool to hold the condition
		boolean condition = false; 
		
		//create a hashmap to create a position number for each contact
			//have the hasmap be <int, int> to hold <position #, id #>
		Map<Integer, Integer> contacts = new HashMap<Integer, Integer>(); 
		
		//create a hashmap to create a position number for each contact
		Map<Integer, Integer> locations = new HashMap<Integer, Integer>();
		locations.put(1, l1.getLocation_id()); 
		locations.put(2, l2.getLocation_id()); 
		locations.put(3, l3.getLocation_id()); 
		
		//create a hashmap to create a position number for each contact
		Map<Integer, Integer> photos = new HashMap<Integer, Integer>();
		photos.put(1, p1.getPhoto_id()); 
		photos.put(2, p2.getPhoto_id()); 
		photos.put(3, p3.getPhoto_id()); 
		
		//loop to check if the condition returned true
			//if true, the program will continues 
			//if false, the program will reprompt the user to input the list chosen again
		while(!condition) {
			//create a string to get/hold the user input 
			String chosenList = s.nextLine(); 
			
			//determine what the user input will execute
			switch (chosenList) { 
				case "All Contacts": case "all contacts": case "All": case "all":
					/*//sort contacts alphabetically 
					abook.sortByAlpha(); */
					
					//loop to add all contacts to the contacts hashmap
					for (int i = 0;i<abook.getListOfContacts().size(); i++) {
						contacts.put(i + 1, abook.getListOfContacts().get(i).getId()); 
					}
					//loop to output each contact and their position 
					for(Map.Entry<Integer,Integer> conPair : contacts.entrySet()) { 
						System.out.println(conPair.getKey() + " "+ abook.displayOne(conPair.getValue())); 
					}
					
					//set the condition to true to indicate a contact list has now been shown
					condition = true;
					break; 
					
				case "Personal Contacts": case "personal contacts": case "Personal": case "personal":
					//output list of personal contacts
					System.out.println("Sorry! This action does not work yet."); 
					
					//set this condition as false for now because the method does not work yet
					condition = false;
					break; 
					
				case "Business Contacts": case "business contacts": case "Business": case "business":
					//output list of business contacts 
					System.out.println("Sorry! This action does not work yet."); 
					
					//set this condition as false for now because the method does not work yet
					condition = false;
					break; 
				default: 
					//output to tell the user that the input was invalid
					System.out.println("Please try again: ");
					condition = false;
			}
		}

		System.out.println();
		System.out.println("Here's a list of actions you can execute ");
		
		//create a hashmap to create a position number for each action
		Map<Integer, String> actions1 = new HashMap<Integer, String>(); 
		actions1.put(1, "Add Contact"); 
		actions1.put(2, "Search for Contact"); 
		actions1.put(3, "View a Single Contact"); 
		actions1.put(4, "Back to Welcome Page");
		
		//output a list of actions they can do at this point 
		for(Map.Entry<Integer,String> actPair1 : actions1.entrySet()) { 
			System.out.println(actPair1.getKey() + " "+ actPair1.getValue()); 
		}
		
		//prompt the user to choose an action
		System.out.println("Please type the position number of the action you wish to execute: ");
		
		//create a string to get/hold the user input 
		int chosenAction1 = s.nextInt();
		
		//create a bool to hold the condition
		boolean condition2 = false;
		
		//loop to check if the condition returned true
			//if true, the program will continues 
			//if false, the program will reprompt the user to input the list chosen again
		while(!condition2) {
				//read the user input of which action to perform; 
				switch (chosenAction1) { 
				case 1: 
				//add a new contact 
					//prompt the user to choose the type of contact they wish to create
					System.out.println("Types of Contacts:");
					System.out.println("1 Personal"); 
					System.out.println("2 Business"); 
					System.out.println("Please what type of contact to create: ");
					
					//create a string to get/hold the user input 
					int typeOfCon = s.nextInt();  

					//read the user input of which contact to create
					switch (typeOfCon) { 
						case 1:
							//prompt the user to input the new contact data when asked for 
							System.out.println("Please type in the new contact data when prompted... ");
	
								int id = contacts.size() + 1; 
								
								System.out.println("Name: ");
								//s.nextLine() kept mistaking the typeOfCon as the input
								String test = s.nextLine(); 
								String name = s.nextLine(); 
								
								System.out.println("Phone Number: ");
								int phoneNumber = s.nextInt(); 
								
								System.out.println("Email Address: ");
								String test2 = s.nextLine();//needed to ensure that the scanner reads the next line
								String emailAddress = s.nextLine(); 
								
								System.out.println("Date Of Birth: ");
								String dateOfBirth = s.nextLine(); 
								
								System.out.println("Relation to You: ");
								String relation = s.nextLine(); 
								
								System.out.println("NickName: ");
								String nickname = s.nextLine(); 
							
							System.out.println("Please type in location data when prompted... ");							
								int location_id = locations.size() + 1; 
								
								System.out.println("Address: ");
								String address = s.nextLine(); 
								
								System.out.println("City: ");
								String city = s.nextLine(); 
								
								System.out.println("State: ");
								String state = s.nextLine(); 
								
								System.out.println("Zip Code: ");
								String zip_code = s.nextLine();
								
								System.out.println("Country: ");
								String country = s.nextLine();
								
								location loc = new location(location_id, address, city, state, zip_code, country); 
								
								locations.put(locations.size() + 1, loc.getLocation_id()); 
							
							
							System.out.println("Please type in photo data when prompted... ");
								int photo_id = photos.size() + 1;  
								
								System.out.println("File Name: ");
								String file_name = s.nextLine(); 
								
								System.out.println("Date of Photo: ");
								String dateOfPhoto = s.nextLine(); 
								
								System.out.println("Description: ");
								String description = s.nextLine(); 

								photo pic = new photo(photo_id, file_name, dateOfPhoto, description); 
								
								photos.put(photos.size()+1, pic.getPhoto_id()); 
							
							//use the user input to create the person contact 
							personalContact perCon = new personalContact(id, name, phoneNumber,  emailAddress, location_id, photo_id, dateOfBirth, relation, nickname);
							
							//add new contact to address book
							abook.add(perCon);
													
							break; 
							
						case 2:
							//prompt the user to input the new contact data when asked for 
							System.out.println("Please type in the new contact data when prompted... ");
	
								int id2 = contacts.size() + 1; 
								
								System.out.println("Name: ");
								String test3 = s.nextLine(); //needed to ensure that the scanner reads the next line
								String name2 = s.nextLine(); 
								
								System.out.println("Phone Number: ");
								int phoneNumber2 = s.nextInt(); 
								
								System.out.println("Email Address: ");
								String test4 = s.nextLine(); //needed to ensure that the scanner reads the next line
								String emailAddress2 = s.nextLine(); 
								
								System.out.println("Hours of Business: ");
								String businessHours = s.nextLine(); 
								
								System.out.println("Website/URL: ");
								String website = s.nextLine(); 
								
								System.out.println("Description: ");
								String des = s.nextLine(); 
							
							System.out.println("Please type in location data when prompted... ");							
								int location_id2 = locations.size() + 1; 
								
								System.out.println("Address: ");
								String address2 = s.nextLine(); 
								
								System.out.println("City: ");
								String city2 = s.nextLine(); 
								
								System.out.println("State: ");
								String state2 = s.nextLine(); 
								
								System.out.println("Zip Code: ");
								String zip_code2 = s.nextLine();
								
								System.out.println("Country: ");
								String country2 = s.nextLine();
								
								location loc2 = new location(location_id2, address2, city2, state2, zip_code2, country2); 
								
								locations.put(locations.size() + 1, loc2.getLocation_id()); 
							
							
							System.out.println("Please type in photo data when prompted... ");
								int photo_id2 = photos.size() + 1;  
								
								System.out.println("File Name: ");
								String file_name2 = s.nextLine(); 
								
								System.out.println("Date of Photo: ");
								String dateOfPhoto2 = s.nextLine(); 
								
								System.out.println("Description: ");
								String description2 = s.nextLine(); 

								photo pic2 = new photo(photo_id2, file_name2, dateOfPhoto2, description2); 
								
								photos.put(photos.size()+1, pic2.getPhoto_id()); 
							
							//use the user input to create the bsuiness contact 
							businessContact busCon = new businessContact(id2, name2, phoneNumber2, emailAddress2, location_id2, photo_id2, businessHours, website, des); 
							//add new contact to address book
							abook.add(busCon);
							break; 
					}
					condition2 = true; 
					break; 
				case 2: 
				//search for a contact given a portion of its name
					
					condition2 = false; 
					break;
				case 3: 
				//view a single contact 
					//prompt the user to choose a contact they wish to see
					System.out.println("Please type the position number of the contact you would like to see: "); 
					
					//create a string to get/hold the user input 
					int chosenContact = s.nextInt(); 
					
					//read the user input of an int to show one contact with the matching position int 
					System.out.println(abook.displayOne(contacts.get(chosenContact)));
					
					//create a hashmap to create a position number for each action
					Map<Integer, String> actions2 = new HashMap<Integer, String>(); 
					actions2.put(1, "Call"); 
					actions2.put(2, "Text"); 
					actions2.put(3, "Email");  
					actions2.put(4, "Edit");
					actions2.put(5, "Delete");
					actions2.put(6, "Back to Contact List");
							
					//check if the object was a buiness contact
						//reference: https://stackoverflow.com/questions/541749/how-to-determine-an-objects-class
					if (abook.displayOne(contacts.get(chosenContact)).findById(contacts.get(chosenContact)) instanceof businessContact) { 
						actions2.put(7, "Open URL");
					}
					
					//output the action list 
					for(Map.Entry<Integer,String> actPair2 : actions2.entrySet()) { 
						System.out.println(actPair2.getKey() + " "+ actPair2.getValue()); 
					}
					
					//prompt the user to choose an action
					System.out.println("Please type the position number of the action you wish to execute: ");
					
					//create a string to get/hold the user input 
					int chosenAction2 = s.nextInt();

					//read the user input of which action to perform; 
					switch (chosenAction2) { 
						case 1: 
							//call 
							abook.displayOne(contacts.get(chosenContact)).findById(contacts.get(chosenContact)).callTo();
							condition2 = true; 
							break; 
						case 2: 
							//send a text
							System.out.println("Please type the message you wish to text them: ");
							String message1 = s.nextLine();  
							abook.displayOne(contacts.get(chosenContact)).findById(contacts.get(chosenContact)).textTo(message1);
							condition2 = true; 
							break; 
						case 3: 
							//send an email
							System.out.println("Please type the message you wish to email them: ");
							String message2 = s.nextLine();  
							abook.displayOne(contacts.get(chosenContact)).findById(contacts.get(chosenContact)).emailTo(message2);
							condition2 = true; 
							break;
						case 4: 
							//edit a contact
							condition2 = false; 
							break; 
						case 5: 
							//delete a contact
							condition2 = false; 
							break; 
						case 6: 
							//go back to contact list
							condition2 = false;
							break; 
						case 7: 
							//open URL for a contact
							condition2 = false;
							break; 
						default: 
							//output to tell the user that the input was invalid
							System.out.println("Please try again: ");
							condition2 = false; 
							break; 
					}
				case 4: 
					condition2 = false;
					break; 
				default: 
					//output to tell the user that the input was invalid
					System.out.println("Please try again: ");
					condition2 = false;
				}
		}	
		}	 
		
		//exit the program 
		
	}

