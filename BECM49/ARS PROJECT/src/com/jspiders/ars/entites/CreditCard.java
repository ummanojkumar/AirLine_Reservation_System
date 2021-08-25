package com.jspiders.ars.entites;
import java.util.Date;
public class CreditCard 
{
	private int ccid;
	private String ownerName;
	private long cardNo;
	private Date validTill;
	private int cvv;
	private String bankName;
	public CreditCard(int ccid, String ownerName, long cardNo, Date validTill, int cvv, String bankName) {
		
		this.ccid = ccid;
		this.ownerName = ownerName;
		this.cardNo = cardNo;
		this.validTill = validTill;
		this.cvv = cvv;
		this.bankName = bankName;
	}

	public String getownerName()
	{
		return ownerName;
	}
	public long getCardNo()
	{
		return cardNo;
	}
	public String getBankName()
	{
		return bankName;
	}
	
	
}
