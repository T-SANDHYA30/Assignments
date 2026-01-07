package com.threadss.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChefEs extends Thread{
	
	private String order;
	public ChefEs(String order) {
		this.order=order;
	}
	
	@Override
	public void run() {
		System.out.println(this.getName()+" is preparing "+order);
		try {
			sleep(500);
		}catch(InterruptedException e) {
			System.out.println(getName()+" is interrupted");
		}
		System.out.println(getName()+" served "+order);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService manager=Executors.newFixedThreadPool(4);
		
		String[] menu= {"biryani","dosa","fish","idli","rasam","sugar","upma","pulav","kushka"};
		for(String item:menu)
		{
			ChefEs chefThread=new ChefEs(item);
			manager.submit(chefThread);
		}
		manager.shutdown();

	}

}
