package com.jspiders.ars.entites;

//write --> create,update
//read  --> print,use
public class User {

	private String uid;// write --> create Once
	private String name;// write read --> Full access
	private String email;// write read --> Full access
	private String password;// write ONLY --> create , update
	private long mobileNum;// write read --> Full access
	private String role;// write ONLY --> create
	private CreditCard ccard;


	public User(String uid, String name, String email, String password, long mobileNum, String role) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobileNum = mobileNum;
		this.role = role;
	}

	//write
	public void setUid(String uid) {
		
		if(this.uid == null)
		{
		  this.uid = uid;	
		}
		else
		{
		  System.out.println("ERROR : "+uid+" UID cannot be changed");
		}
	}

	// write
	public void setName(String name) {
		this.name = name;
	}

	// read
	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	
	public long getMobileNum() {
		return this.mobileNum;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

	public CreditCard getCcard() {
		return ccard;
	}

	public void setCcard(CreditCard ccard) {
		this.ccard = ccard;
	}
	

}
