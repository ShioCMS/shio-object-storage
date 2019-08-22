package com.viglet.shiohara.objectstorage.bean;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class Owner {
	
	@JacksonXmlProperty(localName = "ID")
	private String id;
	
	@JacksonXmlProperty(localName = "DisplayName")
	private String displayName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}
