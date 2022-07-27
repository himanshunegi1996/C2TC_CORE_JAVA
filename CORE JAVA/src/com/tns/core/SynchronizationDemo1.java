package com.tns.core;

class Countr
{
	int Count;
	public synchronized void inc()
	{
		Count++;
	}
}

public class SynchronizationDemo1 {

	public static void main(String[] args) throws InterruptedException  {
		Countr c=new Countr();// TODO Auto-generated method stub
		//First Thread
		Thread t1=new Thread(new Runnable()
				{
			@Override
			public void run()
			{
				for(int i=1;i<=10000;i++)
				{
					c.inc();
				}
			}
				});
		//Second Thread
	
				Thread t2=new Thread(new Runnable()
						{
					@Override
					public void run()
					{
						for(int i=1;i<=10000;i++)
						{
							c.inc();
						}
					}
						});
				t1.start();
				t2.start();
				t1.join();
				t2.join();
				
				System.out.println(c.Count);
	}

}
