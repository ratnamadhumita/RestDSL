package com.aimco.esb.file.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FileOperationsBean {
	
	String directoryName;

	public String getDirectoryName() {
		return directoryName;
	}

	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
	}


	

}
