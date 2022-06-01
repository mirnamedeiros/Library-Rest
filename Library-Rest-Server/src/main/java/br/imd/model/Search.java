package br.imd.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Search {

	private String message;
	
	public Search() {}
	
	public Search(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
