package com.economy;

import com.trade.Commodity;
import com.trade.Transfer;
import com.trade.Transaction;

public class BasicAccount implements Transfer, Transaction
{
	public BasicAccount(String holder)
	{
		this.holder = holder;
		amount = new Amount();
	}
	
	@Override
	public String toString()
	{
		return "Name: " + holder + "\n" +
					"Amount: " + amount;
	}
	
	@Override
	public void transfer(Money money)
	{
		// TODO: Implement this method
	}
	
	@Override
	public void trade(Money money, Commodity commodity)
	{
		// TODO: Implement this method
	}

	@Override
	public void trade(Money money, Commodity[] commodities)
	{
		// TODO: Implement this method
	}
	
	public void deposit(Money money)
	{
		this.amount.gain(money.value());
	}
	
	public void withdraw(Money money)
	{
		this.amount.lose(money.value());
	}
	
	public String holder;
	public Amount amount;
	
	public static class Amount extends Money
	{
		public Amount() { super(); }
		
		public Amount(float value)
		{
			super(value);
		}
	}
}