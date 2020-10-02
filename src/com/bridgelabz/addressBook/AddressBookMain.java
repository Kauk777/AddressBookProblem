package com.bridgelabz.addressBook;

import java.util.*;

public class AddressBookMain {
	private Map<String,Person> contactMap;
	
	public AddressBookMain() {
		contactMap = new HashMap<>();
	}
	
	public void addDetails(String fname,String lname, String address, String city, String state, String zip, long phno, String email) {
		Person p=new Person(fname,lname,address,city,state,zip,phno,email);
		String name=fname+" "+lname;
		contactMap.put(name, p);
	}
	
	public void viewDetails() {
		System.out.println(contactMap.size()+" entries");
		for(Map.Entry<String,Person> m:contactMap.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}
	
	public void editDetails(String fname, String lname) {
		for(Map.Entry<String,Person> m:contactMap.entrySet()) {
			if(m.getValue().fName.equals(fname) && m.getValue().lName.equals(lname)) {
				Person editedDetails=new Person(fname,lname,"Dew Point","Melbourne","Queens","P2548",785412,"joshua@hotmail.com");
				contactMap.replace(m.getKey(),editedDetails);
				System.out.println("Edited Details of "+fname+" "+lname+": "+editedDetails);
			}		
		}
	}
	
	public void deleteDetails(String fname, String lname) {
		for(Map.Entry<String,Person> m:contactMap.entrySet()) {
			if(m.getValue().fName.equals(fname) && m.getValue().lName.equals(lname)) {
				System.out.println("Deleted "+fname+" "+lname+" address");
				contactMap.remove(m.getKey());
				return;
			}	
		}
	}
	
	public void viewPersonByState(String statename) {
		ArrayList<Person> stateList=new ArrayList<>();
		for(Map.Entry<String,Person> m:contactMap.entrySet()) {
			if(m.getValue().state.equals(statename))
				stateList.add(m.getValue());
		}
		HashMap<String,ArrayList> statePersonMap=new HashMap<>();
		statePersonMap.put(statename, stateList);
		for(Map.Entry<String,ArrayList> p:statePersonMap.entrySet()) {
			System.out.println(p.getKey());
			System.out.println(p.getValue());
		}
				
	}
	
	public void viewPersonByCity(String cityname) {
		ArrayList<Person> cityList=new ArrayList<>();
		for(Map.Entry<String,Person> m:contactMap.entrySet()) {
			if(m.getValue().city.equals(cityname))
				cityList.add(m.getValue());
		}
		HashMap<String,ArrayList> cityPersonMap=new HashMap<>();
		cityPersonMap.put(cityname, cityList);
		for(Map.Entry<String,ArrayList> p:cityPersonMap.entrySet()) {
			System.out.println(p.getKey());
			System.out.println(p.getValue());
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AddressBookMain addBook=new AddressBookMain();
		addBook.addDetails("Joshua", "Patrick", "Mave Hill 025", "Las Vegas", "California", "C25042", 25478963, "joshua@green.com");
		addBook.addDetails("Staya", "Veda", "Kali Marg 254", "Kolkata", "West Bengal", "254156", 75848933, "veda@gmail.com");
		addBook.addDetails("Zao", "Vikigh", "Yellow River R10", "Xinju", "Bejing", "745156", 98848933, "zao@gmail.com");
		addBook.addDetails("Zao", "Vikigh", "Yellow Plain R10", "Xinju", "Bejing", "745156", 98848933, "zao@gmail.com");
		addBook.addDetails("Momba", "High", "Venus street", "Panji", "Goa", "831005", 84512355, "high@hotmail.com");
		addBook.addDetails("Sidharth", "Kahali", "Neptune street", "Panji", "Goa", "831005", 88514355, "kahali@hotmail.com");
		addBook.addDetails("Veda", "Veenet", "Mars street", "Panji", "Goa", "831045", 68514355, "veenet@hotmail.com");
		addBook.addDetails("Mave", "Carla", "Durga Street24", "Durgapur", "West Bengal", "254186", 96848933, "carla@gmail.com");
		addBook.addDetails("Shyansh", "Kumar", "Kali Marg 257", "Kolkata", "West Bengal", "254156", 84848933, "shyansh1998@gmail.com");
		addBook.viewDetails();
		boolean flag=true;
		System.out.println("1. Edit address detail based on person name");
		System.out.println("2. Delete address detail based on person name");
		System.out.println("3. View person names by state");
		System.out.println("4. View person names by city");
		System.out.println("5. Exit");
		while(flag) {
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1: 
				System.out.println("Enter name to edit its address");
				String fname=sc.next();
				String lname=sc.next();
				addBook.editDetails(fname,lname);
				break;
			case 2:
				System.out.println("Enter name to delete its address");
				String fdname=sc.next();
				String ldname=sc.next();
				addBook.deleteDetails(fdname,ldname);
				break;
			case 3:
				System.out.println("Enter the state name");
				String spname=sc.next();
				addBook.viewPersonByState(spname);
				break;
			case 4:
				System.out.println("Enter the city name");
				String cpname=sc.next();
				addBook.viewPersonByCity(cpname);
				break;
			case 5:
				flag=false;
				break;
			default:
				System.out.println("Enter valid option");
			}
		}
		System.out.println("New address details");
		addBook.viewDetails();
	}
}
