package com.thejavageek.jaxrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pessoa")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pessoa {
	private String name;
	
	public Pessoa() {
		
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
}
