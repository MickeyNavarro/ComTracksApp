//Almicke "Mickey" Navarro 
//CST135
//January 28, 2019 
//This is my own work. 

//This interface will use the IOException
package dataAccess;

import java.io.IOException;

import businessServices.businessService;

public interface dataAccessService {
	public businessService readAllData(); 
	boolean writeAllData(businessService addressBookBusinessService);
}
