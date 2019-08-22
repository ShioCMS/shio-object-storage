package com.viglet.shiohara.objectstorage.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(namespace = "http://s3.amazonaws.com/doc/2006-03-01/", localName = "ListBucketResult")
public class ListBucketResult {
	@JacksonXmlProperty(localName = "Name")
	private String name;

	@JacksonXmlProperty(localName = "Prefix")
	private String prefix;

	@JacksonXmlProperty(localName = "Marker")
	private String marker;

	@JacksonXmlProperty(localName = "MaxKeys")
	private int maxKeys;

	@JacksonXmlProperty(localName = "IsTruncated")
	private boolean isTruncated;

	@JacksonXmlProperty(localName = "Contents")
	private Contents contents;

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

	public boolean isTruncated() {
		return isTruncated;
	}

	public void setTruncated(boolean isTruncated) {
		this.isTruncated = isTruncated;
	}

	public Contents getContents() {
		return contents;
	}

	public void setContents(Contents contents) {
		this.contents = contents;
	}

}
