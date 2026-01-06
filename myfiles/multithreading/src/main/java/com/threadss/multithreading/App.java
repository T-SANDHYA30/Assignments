package com.threadss.multithreading;

/**
 * Hello world!
 *
 */
public class App 
{
	public void run() {
		System.out.println("thread is running");
	}
    public static void main( String[] args )
    {
        System.out.println(Thread.currentThread());
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getId());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        System.out.println(thread.isAlive());
        System.out.println(thread.isDaemon());
        System.out.println(thread.isInterrupted());
        
        Thread t=new Thread("thread1");
        System.out.println(t.getName());
        System.out.println(t.getId());
        
        
        
        
        
    }
}
