package com.viglet.shiohara.objectstorage.bean;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ListBucketResult")
public class ListBucketResult {
	@JacksonXmlProperty(isAttribute = true, localName = "xmlns")
	private String namespace = "http://s3.amazonaws.com/doc/2006-03-01/";
	
	@JacksonXmlProperty(localName = "Name", namespace = "")
	private String name;

	@JacksonXmlProperty(localName = "Prefix")
	private String prefix;

	@JacksonXmlProperty(localName = "Marker")
	private String marker;

	@JacksonXmlProperty(localName = "MaxKeys")
	private int maxKeys;

	@JacksonXmlProperty(localName = "IsTruncated")
	private boolean isTruncated;

	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "Contents")
	private List<Contents> contents2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getMarker() {
		return marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
	}

	public int getMaxKeys() {
		return maxKeys;
	}

	public void setMaxKeys(int maxKeys) {
		this.maxKeys = maxKeys;
	}

	public boolean getIsTruncated() {
		return isTruncated;
	}

	public void setTruncated(boolean isTruncated) {
		this.isTruncated = isTruncated;
	}

	public List<Contents> getContents2() {
		return contents2;
	}

	public void setContents2(List<Contents> contents2) {
		this.contents2 = contents2;
	}
}
