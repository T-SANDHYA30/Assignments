package com.basics.design_patterns;

public class App 
{
    public static void main( String[] args )
    {
       
		
		 //singleton design 
//		 DBConnection conn1=DBConnection.getInstance();
//		 System.out.println(conn1.hashCode()); DBConnection
//		 conn2=DBConnection.getInstance(); System.out.println(conn2.hashCode());
//		 DBConnection conn3=DBConnection.getInstance();
//		 System.out.println(conn3.hashCode());
		 
    	
    	//factory pattern
		
//		 Shape s= ShapesFactory.getShape("circle"); s.draw(); Shape s1=
//		 ShapesFactory.getShape("square"); s1.draw();
		 
    	
    	//Abstract factory
//    	GUIFactory gui =new WinFactory();
//    	Button button=gui.createButton();
//    	CheckBox checkbox=gui.createCheckBox();
//    	button.click();
//    	checkbox.check();
//    	
//    	
//    	GUIFactory gui1 =new MacFactory();
//    	Button button1=gui.createButton();
//    	CheckBox checkbox1=gui.createCheckBox();
//    	button1.click();
//    	checkbox1.check();
    	
    	//builderpattern
    	
//    	Pizza pizza=new Pizza.Builder("small")
//    			.cheese(true)
//    			.olive(false)
//    			.build();
//    	System.out.println(pizza);
    	
    	//Template method pattern--behavioral
    	
//    	DrinkMaker tea=new TeaMaker();
//    	tea.prepareDrink();
    	
    	//structural pattern
    	
    //bridge pattern
    	
//    	Video youtubeHd= new Youtube(new HDProcessimg());
//    	youtubeHd.playVideo();
//    	
//    	Video youtube4k= new Youtube(new fourkprocessing());
//    	youtube4k.playVideo();
    	
//    	proxy pattern
    	
    	Payment netBanking= new NetBanking();
    	netBanking.pay(5000);
    	System.out.println("*************");
    	Payment upi =new UpiPayment();
    	upi.pay(7000);
    	
    	
    }
}
