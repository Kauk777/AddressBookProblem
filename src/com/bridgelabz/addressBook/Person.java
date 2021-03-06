package com.bridgelabz.addressBook;

public class Person {
	public String fName;
	public String lName;
	private String address;
	public String city;
	public String state;
	private String zip;
	private long phoneNo;
	private String email;
	
	public Person(String fName, String lName, String address, String city, String state, String zip, long phoneNo,
			String email) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person Address [FirstName=" + fName + ", LastName=" + lName + ", address=" + address + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", email=" + email + "]"+"\n";
	}
	
}
