package com.economy;

import com.trade.Commodity;

public class Money extends Commodity
{
	public Money() { super(); }
	
	public Money(float value)
	{
		super();
		
		this.value = value;
	}
	
	protected float value = 0.0f;
	
	public float value()
	{
		return value;
	}
	
	public void gain(float value)
	{
		this.value += value;
	}
	
	public void lose(float value)
	{
		this.value -= value;
	}
	
	@Override
	public String toString()
	{
		return Float.toString(value());
	}
}