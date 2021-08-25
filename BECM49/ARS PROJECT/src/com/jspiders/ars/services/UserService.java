package com.jspiders.ars.services;

import java.util.Date;

import com.jspiders.ars.entites.CreditCard;
import com.jspiders.ars.entites.User;

public class UserService {

	User u1;
	
	public void signup(String name,String userName,String password,long mob)
	{
		u1 = new User("user1234",name,userName,password,mob,"Customer");
	}
	public void showUserDetails()
	{
		System.out.println("name      : "+u1.getName());
		System.out.println("username  : "+u1.getEmail());
		System.out.println("user Mob  : "+u1.getMobileNum());
		
	}
	public void addCreditCard(int ccid, String ownerName, long cardNo, Date validTill, int cvv, String bankName)
	{
		CreditCard c1=new CreditCard(ccid,ownerName,cardNo,validTill,cvv,bankName);
		//link credit card to user
		u1.setCcard(c1);
			
	}
	
	public void showCrediCardDetails()
	{
		System.out.println("owner name : "+u1.getCcard().getownerName());
		System.out.println("card number: "+u1.getCcard().getCardNo());
		System.out.println("Bank Name  : "+u1.getCcard().getBankName());
	}
	
	
	
	
	
	
	
	public void updateUserPassword(String updatePassword)
	{
		if (u1!=null)
		{
			u1.setPassword(updatePassword);
		}
		else {
			System.out.println("Error Password is not created unitll now");
		}
		
	}
	
	//Assignment : implement showUserDetails() and  all other update Methods
}
