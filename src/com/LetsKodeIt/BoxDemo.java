package com.LetsKodeIt;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox1=new Box(); // creating new object mYbox1
		mybox1.depth=100;
		mybox1.height=129;
		mybox1.width=111;
		mybox1.vol=mybox1.depth*mybox1.height*mybox1.width;
		System.out.println("Volume of Mybox1: "+mybox1.vol);
		
		// creating mybox2
		Box mybox2=new Box();
		mybox2.depth=3;
		mybox2.height=6;
		mybox2.width=9;
		mybox2.vol=mybox2.depth * mybox2.height * mybox2.width;
		System.out.println("Volume of Mybox2: "+mybox2.vol);
		
		// reference variable
		Box mybox3;// declare reference to object
		mybox3=new Box();// allocate a box object
		
		
		//Assigning object Reference Variables
		
		Box b1= new Box();
		
		
		b1.depth=2;
		b1.height=3;
		b1.width=3;
		b1.vol=b1.depth*b1.height*b1.width;
		
		System.out.println("Volume of b1 is : "+b1.vol);
		Box b2=b1;
		System.out.println("Volume of b2 : "+b2);
		
		
	}

}
