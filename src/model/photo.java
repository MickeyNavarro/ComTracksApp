//Almicke "Mickey" Navarro 
//CST135
//January 28, 2019 
//This is my own work. 

//This class represents a photo that each contact will use
package model;

public class photo {
	private int photo_id; 
	private String file_name; 
	private String dateOfPhoto; 
	private String description;
	
	public photo(int photo_id, String file_name, String dateOfPhoto, String description) {
		super();
		this.photo_id = photo_id;
		this.file_name = file_name;
		this.dateOfPhoto = dateOfPhoto;
		this.description = description;
	}

	public int getPhoto_id() {
		return photo_id;
	}

	public void setPhoto_id(int photo_id) {
		this.photo_id = photo_id;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getDateOfPhoto() {
		return dateOfPhoto;
	}

	public void setDateOfPhoto(String dateOfPhoto) {
		this.dateOfPhoto = dateOfPhoto;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
