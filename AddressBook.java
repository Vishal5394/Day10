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

	    System.out.println("Enter the first name: ");
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
	public static void main(String[] args) {
		System.out.println("Welcome to address Book Program");
		 AddressBook details = new AddressBook();
		 details.addContact();
	}
}

