package com.comcast.xfinityhome.mstemplate.model;

import java.io.Serializable;

/**
 * Persistent Template entity with any Persistent end point
 * 
 * @author adubey203
 */

public class Template implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String id;

	protected String name;

	protected Template() { }

	public Template(String id) {
		this.id = id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
