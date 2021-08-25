package com.jspiders.ars.entites;

import java.util.Date;

public class Flight {

	private String flightNo;
	private String airline;
	private String departCity;
	private String arrivalCity;
	private Date departDate;
	private Date arrivalDate;
	private String departTime;
	private String arrivalTime;
	private int firstClassSeatsAvilable;
	private double firstClassSeatCost;
	private int bussClassSeatsAvilable;
	private double bussClassSeatCost;
	public Flight(String flightNo, String airline, String departCity, String arrivalCity, Date departDate,
			Date arrivalDate, String departTime, String arrivalTime, int firstClassSeatsAvilable,
			double firstClassSeatCost, int bussClassSeatsAvilable, double bussClassSeatCost) {
		super();
		this.flightNo = flightNo;
		this.airline = airline;
		this.departCity = departCity;
		this.arrivalCity = arrivalCity;
		this.departDate = departDate;
		this.arrivalDate = arrivalDate;
		this.departTime = departTime;
		this.arrivalTime = arrivalTime;
		this.firstClassSeatsAvilable = firstClassSeatsAvilable;
		this.firstClassSeatCost = firstClassSeatCost;
		this.bussClassSeatsAvilable = bussClassSeatsAvilable;
		this.bussClassSeatCost = bussClassSeatCost;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDepartCity() {
		return departCity;
	}
	public void setDepartCity(String departCity) {
		this.departCity = departCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDepartDate() {
		return departDate;
	}
	public void setDepartDate(Date departDate) {
		this.departDate = departDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepartTime() {
		return departTime;
	}
	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getFirstClassSeatsAvilable() {
		return firstClassSeatsAvilable;
	}
	public void setFirstClassSeatsAvilable(int firstClassSeatsAvilable) {
		this.firstClassSeatsAvilable = firstClassSeatsAvilable;
	}
	public double getFirstClassSeatCost() {
		return firstClassSeatCost;
	}
	public void setFirstClassSeatCost(double firstClassSeatCost) {
		this.firstClassSeatCost = firstClassSeatCost;
	}
	public int getBussClassSeatsAvilable() {
		return bussClassSeatsAvilable;
	}
	public void setBussClassSeatsAvilable(int bussClassSeatsAvilable) {
		this.bussClassSeatsAvilable = bussClassSeatsAvilable;
	}
	public double getBussClassSeatCost() {
		return bussClassSeatCost;
	}
	public void setBussClassSeatCost(double bussClassSeatCost) {
		this.bussClassSeatCost = bussClassSeatCost;
	}
	
}
	
	
	
	