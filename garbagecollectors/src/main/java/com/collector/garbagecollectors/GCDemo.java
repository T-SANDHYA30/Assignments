package com.collector.garbagecollectors;

public class GCDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Test test=new Test();
		test=null;
		System.out.println("GC requested manually");
		System.gc();
		
		Thread.sleep(1000);
		System.out.println("completed");

	}

}
class Test{
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("garbage collected");
		
	}
	
}