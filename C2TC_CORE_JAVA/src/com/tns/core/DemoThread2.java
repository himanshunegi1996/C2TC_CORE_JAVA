package com.tns.core;


class ThreadChild extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am ChildThread");
			Thread.yield();
		}
	}
}
public class DemoThread2 {

	public static void main(String[] args) {
		ThreadChild t=new ThreadChild();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("I am Main Thread");// TODO Auto-generated method stub
		}

	}

}
