package com.tns.core;

class Counter
{
	int Count=9;
	public void inc()
	{
		Count++;
	}
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		Counter c=new Counter();
		c.inc();
		System.out.println(c.Count);// TODO Auto-generated method stub

	}

}
