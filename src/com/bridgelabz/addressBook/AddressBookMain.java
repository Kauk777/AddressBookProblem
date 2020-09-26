package com.bridgelabz.addressBook;

import java.util.*;

public class AddressBookMain {
	private ArrayList<Person> contactList;
	
	public AddressBookMain() {
		contactList = new ArrayList<>();
	}
	
	public void addDetails(String fname,String lname, String address, String city, String state, String zip, long phno, String email) {
		Person p=new Person(fname,lname,address,city,state,zip,phno,email);
		contactList.add(p);
	}
	
	public void viewDetails() {
		for(Person addrs:contactList) {
			System.out.println(addrs);
		}
	}
	
	public void deleteDetails(String fname, String lname) {
		for(Person details:contactList) {
			if(details.fName.equals(fname) && details.lName.equals(lname)) {
				int id=contactList.indexOf(details);
				contactList.remove(id);
				return;
			}
				
		}
	}

	public static void main(String[] args) {
		AddressBookMain addBook=new AddressBookMain();
		addBook.addDetails("Joshua", "Patrick", "Mave Hill 025", "Las Vegas", "California", "C25042", 25478963, "joshua@green.com");
		addBook.addDetails("Staya", "Veda", "Kali Marg 254", "Kolkata", "West Bengal", "254156", 75848933, "veda@gmail.com");
		addBook.addDetails("Zao", "Vikigh", "Yellow River R10", "Xinju", "Bejing", "745156", 98848933, "zao@gmail.com");
		addBook.viewDetails();
		addBook.deleteDetails("Staya","Veda");
		System.out.println("After deleting details based on person name: ");
		addBook.viewDetails();
	}

}
