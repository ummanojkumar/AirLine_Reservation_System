package com.jspiders.ars.test;


import com.jspiders.ars.entites.CreditCard;
import com.jspiders.ars.entites.User;
import com.jspiders.ars.services.AirportService;

import com.jspiders.ars.services.UserService;
import com.jspiders.ars.services.FlightService;

public class AppTesting
{
	public static void main(String[] args)
	{
		/*UserService us1 = new UserService();
		us1.signup("User1", "user@gmail.com","abc123",9876543210l);
		
		System.out.println("--------------");
		
		AirportService as1 = new AirportService();
	    as1.addAirport("BangloreAirport","BIAP","Bangalore");
		as1.showAirportDetails();
		
		as1.editAirportName("Banglore INTL. Airport");
		as1.showAirportDetails(); */
		
		
		//User u1= new User("us1234","user1","user1@gmail.com","password@123",9133296929l,"customer");
		
		UserService us1 = new UserService();
		us1.signup("User1", "user@gmail.com","abc123",9876543210l);
		System.out.println("--------------------USER DETAILS-------------------------");
		us1.showUserDetails();
		us1.addCreditCard(1212, "owner1", 123456789l, null, 691, "ICICI");
		System.out.println("--------------------CREDIT CARD DETAILS------------------");
		us1.showCrediCardDetails();
		
		
		
	}
}
