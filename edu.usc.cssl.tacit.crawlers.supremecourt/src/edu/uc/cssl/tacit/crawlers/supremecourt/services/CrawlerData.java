package edu.uc.cssl.tacit.crawlers.supremecourt.services;

public class CrawlerData {
	private String fileLocation;
	private String location;
	
	public CrawlerData(){
		this.fileLocation = "";
		this.	location = "";
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}
}
