package com.Bridgelabz.day10;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	public static final ArrayList<ArrayList<String>> addressBook = new ArrayList<>();

	
	public void createContacts(ArrayList<String> contact) {
	    AddressBook.addressBook.add(contact);
	    for (ArrayList<String> i : AddressBook.addressBook) {
	        for (String j : i) {
	            System.out.println(j);
	        }
	    }
	}
	public void addContact() {
	    ArrayList<String> contact = enterContactDetails();
	    createContacts(contact);
	}

	public ArrayList enterContactDetails() {
	    ArrayList<String> contact = new ArrayList<String>();

	    System.out.println("\nEnter the first name: ");
	    Scanner sc1 = new Scanner(System.in);
	    String first_name = sc1.next();
	  //contact.add(first_name);

	    System.out.println("Enter the last name: ");
	    Scanner sc2 = new Scanner(System.in);
	    String last_name = sc2.next();
	    contact.add("Name: " +first_name +" "+ last_name);

	    System.out.println("Enter the address: ");
	    Scanner sc3 = new Scanner(System.in);
	    String address = sc3.next();
	    contact.add("Address: "+address);

	    System.out.println("Enter the city name: ");
	    Scanner sc4 = new Scanner(System.in);
	    String city = sc4.next();
	    contact.add("City: " +city);

	    System.out.println("Enter the state's name: ");
	    Scanner sc5 = new Scanner(System.in);
	    String state = sc5.next();
	    contact.add("State: " + state);

	    System.out.println("Enter the zip: ");
	    Scanner sc6 = new Scanner(System.in);
	    String zip = sc6.next();
	    contact.add("zip: "+zip);

	    System.out.println("Enter the phone number: ");
	    Scanner sc7 = new Scanner(System.in);
	    String phone_num = sc7.next();
	    contact.add("Contact no: "+phone_num);

	    System.out.println("Enter the email ID: ");
	    Scanner sc8 = new Scanner(System.in);
	    String email = sc8.next();
	    contact.add("Email: "+email);

	    return contact;
	}
	
	public void addMultiplePerson() {
	    System.out.println("\nEnter the number of persons whose details you want " + "to add to the address book\n");
	    Scanner sc = new Scanner(System.in);
	    int no_of_person = sc.nextInt();
	    for (int i = 1; i <= no_of_person; i++) {

	        addContact();
	    }
	}
	public int searchExistingContact() {
	    int index = 1;
	    int tempIndex = 1;
	    for (ArrayList<String> i : AddressBook.addressBook) {
	        tempIndex++;
	        for (String j : i) {
	            String searchPerson = new String();
	            if (j.equals(searchPerson)) {
	                index = tempIndex;
	                break;
	            }
	        }
	    }
	    return index;
	}
	public void editExistingContact() {
	    System.out.println("\n Enter the name of the person whose details you " + "want to change");
	    Scanner sc = new Scanner(System.in);
	    String searchPerson = sc.next();
	    int index = searchExistingContact(); 
	    System.out.println("\n Found the name, Kindly enter new details ");
	    ArrayList<String> contact = enterContactDetails();
	      AddressBook.addressBook.set(index, contact);
	      addContact();
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to address Book Program");
		 AddressBook details = new AddressBook();
		 details.addContact();
		 details.addMultiplePerson();
		 details.searchExistingContact();
		 details.editExistingContact();
	}
}

