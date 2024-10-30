package com.java.multithreading;

public class ThreadClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Thread execution is started");
		
		Thread.sleep(2200, 5000);
		Thread thread=Thread.currentThread();
		System.out.println(thread);
		System.out.println(thread.getPriority());
		thread.setName("Testing threas");
		System.out.println(thread.getName());
		thread.setPriority(1);
		System.out.println(thread.getPriority());
		System.out.println("Thread execution is end");
	}
}
