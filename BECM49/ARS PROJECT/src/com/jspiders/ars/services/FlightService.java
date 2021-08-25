package com.jspiders.ars.services;


import java.util.Date;

import com.jspiders.ars.entites.Flight;


public class FlightService
{
	Flight f1;
	public void addFlight(String flightNo, String airline, String departCity, String arrivalCity, Date departDate,
			Date arrivalDate, String departTime, String arrivalTime, int firstClassSeatsAvilable,
			double firstClassSeatCost, int bussClassSeatsAvilable, double bussClassSeatCost)
	{
		f1=new Flight(flightNo,airline,departCity,arrivalCity,departDate,arrivalDate,departTime,arrivalTime,firstClassSeatsAvilable,firstClassSeatCost,bussClassSeatsAvilable,bussClassSeatCost);
		
	}
	
	public void showFlightDetails()
	{
		System.out.println(f1.getFlightNo());
		System.out.println(f1.getAirline());
		System.out.println(f1.getDepartCity());
		System.out.println(f1.getArrivalCity());
		System.out.println(f1.getDepartDate());
		System.out.println(f1.getArrivalDate());
		System.out.println(f1.getDepartTime());
		System.out.println(f1.getArrivalTime());
		System.out.println(f1.getFirstClassSeatsAvilable());
		System.out.println(f1.getFirstClassSeatCost());
		System.out.println(f1.getBussClassSeatsAvilable());
		System.out.println(f1.getBussClassSeatCost());
	}
	
}
