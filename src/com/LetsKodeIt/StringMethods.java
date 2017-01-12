package com.LetsKodeIt;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is the test String";
		System.out.println("Length: "+str.length());
		System.out.println("CharAt: "+str.charAt(5));
		System.out.println("String Concat: " +str.concat(" This is the appended String"));
		// Contains
		System.out.println("Contains (is): " +str.contains("is"));
		System.out.println("Contains (ee): " +str.contains("ee"));
		//Starts With
		System.out.println("Starts with (ie):" +str.startsWith("ie"));
		System.out.println("Starts with (Th):" +str.startsWith("Th"));
		//Ends With
		System.out.println("Ends with (k):" +str.endsWith("k"));
		System.out.println("Ends with (ng):" +str.endsWith("ng"));
		// String Equals
		String str1=" String Equals ";
		String str2="This is the test String";
		
		System.out.println("Equals str1 : "+str.equals(str1));
		System.out.println("Equals str2 : "+str.equals(str2));
		
		//Index of
		System.out.println("INdex Of (small t) : " +str.indexOf('t'));
		System.out.println("INdex Of (q): " +str.indexOf('q'));   // returns -1 when the character is not there
		
		//is Empty
		String str4="";
		System.out.println("Str4 cotains: "+str4);
		System.out.println("String is Empty(str4): " +str4.isEmpty());
		System.out.println("Str1 contains: "+str1);
		System.out.println("String is Empty(str): " +str.isEmpty());
		
		//Trim
		System.out.println("+++++Trim Function Starts++++");
		String str5="       Spaces all Around      ";
		System.out.println("Str5 with spaces:"+str5);
		System.out.println("After Trim: "+str5.trim());
		System.out.println("+++++Trim Function Ends++++");
		
		//Replacing
		System.out.println("Replacing i with o: "+str.replace('i', 'o'));
		
		//substring
		System.out.println("-------SubString-----");
		System.out.println("String is: "+str);
		System.out.println("Substring from 5th : "+str.substring(5));
		System.out.println("Example 2 (here it will not include the character at 10th position)");
		System.out.println("Substing with both inclusve and exclusive (starts at 5 ends at 10): "+str.substring(5, 10));
		// here it will not include the character at 10th position
		
		//Char Array
		
		System.out.println("----Char Array-----");
		char[] charArray=str.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			System.out.println("(Index "+i+" is: "+charArray[i]+") ");
		}
		
		//lower case
		
		System.out.println("Lowercase : "+str.toLowerCase());
		System.out.println("Uppercase : "+str.toUpperCase());
		
		
		
		char[] google1=str1.toCharArray();
		for(int i=0;i<google1.length;i++)
		{
			System.out.println("index "+i+ " value is : "+google1[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
