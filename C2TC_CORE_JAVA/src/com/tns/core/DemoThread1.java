package com.tns.core;

class ChildThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am ChildThread");
		}
	}
}
public class DemoThread1 {

	public static void main(String[] args) {
		ChildThread t=new ChildThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("I am Main Thread");// TODO Auto-generated method stub
		}

	}

}
