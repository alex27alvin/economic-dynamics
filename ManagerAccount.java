package com.economy;

import java.util.*;
import com.trade.Commodity;

public class ManagerAccount extends BasicAccount
{
	public ManagerAccount(String holder)
	{
		super(holder);
		
		accounts = new ArrayList<BasicAccount>();
	}
	
	public boolean add(BasicAccount account)
	{
		boolean bool = accounts.add(account);
		amount();
		return bool;
	}
	
	public boolean remove (BasicAccount account)
	{
		boolean bool = accounts.remove(account);
		amount();
		return bool;
	}
	
	protected void amount()
	{
		this.amount = new Amount(0.0f);
		for(BasicAccount account : accounts) 
		{
			this.amount.value += account.amount.value;
		}
	}
	
	public ArrayList<BasicAccount> accounts()
	{
		return accounts;
	}
	
	@Override
	public void transfer(Money money) {}
	@Override
	public void trade(Money money, Commodity commodity) {}
	@Override
	public void trade(Money money, Commodity[] commodities) {}
	@Override
	public void deposit(Money money) {}
	@Override
	public void withdraw(Money money) {}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Name: ").append(holder).append("\n	Accounts held: ");
		
		for(BasicAccount account : accounts) 
		{
			builder.append(account.holder).append(", ");
		}
		
		builder.append("\nAmount: ").append(Float.toString(amount.value));
		return builder.toString();
	}
	
	ArrayList<BasicAccount> accounts;
}