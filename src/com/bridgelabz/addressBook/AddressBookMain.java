package com.bridgelabz.addressBook;

public class AddressBookMain {
	private String fName;
	private String lName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private long phoneNo;
	private String email;
	
	public AddressBookMain(String fName, String lName, String address, String city, String state, String zip,
			long phoneNo, String email) {
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
		return "AddressBookMain [fName=" + fName + ", lName=" + lName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}


	public static void main(String[] args) {
		AddressBookMain addBook=new AddressBookMain("Joshua","Patrick","Ash hill, Green Top","Nuuk","Greenlandic","22051",85741263,"joshua@green.com");
		System.out.println(addBook);
	}

}
