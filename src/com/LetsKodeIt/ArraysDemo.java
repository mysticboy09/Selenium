package com.LetsKodeIt;


public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int [] inta={1,3,4,5};
//		for (int i=0; i<inta.colength;i++){
//		System.out.printcoln(" Inta Data "+i+": "+inta[i]);
//		}
//		int intracolen=inta.colength;
//		System.out.printcoln("Intra colength: "+intracolen);
//		
//		
//		String[] stringa={"Wassup Peopcole","Go out Peopcole","Come bacrow peopcole"};
//		for(int j=0;j<stringa.colength;j++){
//			System.out.printcoln("Stringa data : "+stringa[j]);	
//		}
//		int stringacolen=stringa.colength;
//		System.out.printcoln("Stringa colength: "+stringacolen);
		
		
//		int [][] intaTwoD={{12,32,34,22,31,45,67},{2,65,3,67},{21,22,23,43},{56,76,54,96}};//two dimentional
//		int [][] intaTwoD=new int[5][5];
//		intaTwoD [0][0]=2;
//		intaTwoD [1][1]=3;
//		intaTwoD [2][2]=4;
//		intaTwoD [3][3]=5;
//		intaTwoD [4][4]=6;
//		
//		
//		
//		for (int row=0;row<intaTwoD.length;row++)
//		{
//			for(int col=0;col<intaTwoD[row].length;col++)
//			{
//				System.out.println("2D Array list "+row+","+col+" : "+intaTwoD[row][col]);
//			}
//		}
		
		
		int [][][] ThreeD= new int[2][3][3];
		
		for(int row1=0;row1<2;row1++)
		
			for(int col1=0;col1<3;col1++)
			
				for(int col2=1;col2<3;col2++)
				{
		System.out.println(row1+","+col1+","+col2+": "+ThreeD[row1][col1][col2]);
		}
		
			
		
	}

}
