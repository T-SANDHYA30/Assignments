package com.assesments;

public class ConfigurationManager {
	
	public static ConfigurationManager instance;
	private static String Accountdetails;
	private static int Appid;
	
	private ConfigurationManager() {
		System.out.println("get Instance");
	}
	
	public static ConfigurationManager getInstance() {
		if(instance!=null)
			return instance;
		else
			return instance=new ConfigurationManager();
	}
	public static void loadapp() {
		System.out.println(Accountdetails);
		System.out.println(Appid);
		
	}

}
