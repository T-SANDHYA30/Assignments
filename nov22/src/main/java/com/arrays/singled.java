package com.arrays;

public class singled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruits fruitsArr[]= new Fruits[5];
		Fruits f1=new Fruits("apple","red",56.23);
		Fruits f2=new Fruits("grapes","purple",40);
		Fruits f3=new Fruits("mango","yellow",120.5);
		Fruits f4=new Fruits("orange","orange",45.67);
		Fruits f5=new Fruits("water melon","green",80);
		fruitsArr[0]=f1;
		fruitsArr[1]=f2;
		fruitsArr[2]=f3;
		fruitsArr[3]=f4;
		fruitsArr[4]=f5;
		
		for(int i=0;i<fruitsArr.length;i++)
			System.out.println("cost per dozen is"+ fruitsArr[i].getFruitname()+" is "+fruitsArr[i].costperDozen(f1));
	}

}
