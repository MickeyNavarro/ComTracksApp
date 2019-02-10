//Almicke "Mickey" Navarro 
//CST135
//January 28, 2019 
//This is my own work. 

//This class will hold the business logic for the address book class
package businessServices;

import dataAccess.dataAccessService;
import model.addressBook;

public class businessService {
	public addressBook list; 
	
	public businessService(addressBook list) { 
		super(); 
		this.setList(list); 
	}
	
	public businessService() { 
		super(); 
		this.setList(new addressBook()); 
	}
	
	public addressBook getList() {
		return list;
	}

	public void setList(addressBook list) {
		this.list = list;
	}

	public void saveAllLists() { 
		//write data to file or database 
		dataAccessService das = new FileIOService(); 
		das.writeAllData(this); 
	}
	
	public businessService loadAllLists() { 
		//read data from file or database 
		dataAccessService das = new FileIOService(); 
		return das.readAllData();
	}
}
