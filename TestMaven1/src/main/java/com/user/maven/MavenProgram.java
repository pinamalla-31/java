package com.user.maven;

public class MavenProgram {
	int id;
	String name;
	String address;
	int zip;
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getZip() {
		return zip;
	}

	public MavenProgram(int id, String name, String address, int zip) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.zip = zip;
	}
	

}
