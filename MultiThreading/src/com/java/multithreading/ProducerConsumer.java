package com.java.multithreading;
//Thread 1 produce and Thread2 consume data without checking or no communication 
//If one value produce by producer consumer must contain that values checking
/*There is no communication so If producer produce data consumer must consume iE. once consume data
then only consumer produce another data for consumer*/

//Method wait() and notify() use to do inter thread communication in synchrozed environment
class Producer extends Thread
{
	Queue q;
	
	int i=1;
	public Producer(Queue q)
	{
		this.q=q;
	}
	public void run()
	{
	while(true)
	{
		q.producer(i++);
	}
}}
class Consumer extends Thread
{
	Queue q;
	public Consumer(Queue q)
	{
		this.q=q;
	}
	public void run()
	{
	while(true)
	{
		q.consume();
	}
}}
class Queue
{
	int data;
	Boolean flag= false;
	synchronized public void producer(int i)
	{
		try
		{
			if(flag==true)
			{
				//Wait () and Notify() always must written in synchronized environment
				System.out.println("Producer in waiting state");
				wait();
			}
			else
			{
		data=i;
		System.out.println("I have produce the Data"+ data);
		flag=true;
		notify();
		}}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	synchronized public void consume()
	{
		try
		{
			if(flag==false)
			{
				//Wait () and Notify() always must written in synchronized environment
				System.out.println("Consumer in waiting state");
				wait();
			}
			else
			{
			System.out.println("I have consume the Data"+ data);
			flag=false;
			notify();
			}
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}	
	}
}
public class ProducerConsumer
{
	public static void main(String[] args)
	{
		Queue q= new Queue();
		
		Producer p= new Producer(q);
		Consumer c= new Consumer(q);
		//new Producer(q).start();
		//new Consumer(q).start();
		p.start();
		c.start();
	}
	
}
