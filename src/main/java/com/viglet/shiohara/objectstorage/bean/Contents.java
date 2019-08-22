package com.viglet.shiohara.objectstorage.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class Contents {
	
	@JacksonXmlProperty(localName = "Key")
	private String key;
	
	@JacksonXmlProperty(localName = "LastModified")
	private Date lastModified;
	
	@JacksonXmlProperty(localName = "ETag")
	private String eTag;
	
	@JacksonXmlProperty(localName = "Size")
	private int size;
	
	@JacksonXmlProperty(localName = "StorageClass")
	private String storageClass;
	
	@JacksonXmlProperty(localName = "Owner")
	private Owner owner;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String geteTag() {
		return eTag;
	}

	public void seteTag(String eTag) {
		this.eTag = eTag;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getStorageClass() {
		return storageClass;
	}

	public void setStorageClass(String storageClass) {
		this.storageClass = storageClass;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
}
