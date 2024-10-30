package com.java.multithreading;

//We multiple thread try to run and complete its work without bothering which thread to execute and 
//what is going to be executed
/*To solving this kind of raise condition we do make secondary thread as demon thread setting priority*/
class MSWORD extends Thread
{
	public void run() 
	{
		String name= Thread.currentThread().getName();
		if(name.equals("Type"))
		{
			Typing();
		}
		else if(name.equals("Spell"))
		{
			SpellChecking();
		}
		else
		{
			AutoSaving();
		}
	}
	public void Typing()
	{
		try 
		{
			for(int i=0; i<4;i++)
			{
				System.out.println("Typing....");
				Thread.sleep(3000);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void SpellChecking()
	{
		try 
		{
			for(;;)
			{
				System.out.println("SpellChecking....");//We setting it to infinite loops because demon thread control here it follow primary thread rule
				Thread.sleep(3000);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void AutoSaving()
	{
		try 
		{
			for(;;)//We setting it to infinite loops because demon thread control here it follow primary thread rule
			{
				System.out.println("AutoSaving....");
				Thread.sleep(3000);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}


public class LaunchDemonThread {

	public static void main(String[] args) 
	{
		MSWORD ms= new MSWORD();
		MSWORD ms1= new MSWORD();
		MSWORD ms2= new MSWORD();
		
		ms.setName("Type");
		ms1.setName("Spell");
		ms2.setName("Saving");
		
		//setting demon threading using priority
		ms1.setPriority(3);
		ms2.setPriority(4);
		//After setting priority set setDaemon to true
		ms1.setDaemon(true);
		ms2.setDaemon(true);
		
		ms.start();
		ms1.start();
		ms2.start();
	}

}
