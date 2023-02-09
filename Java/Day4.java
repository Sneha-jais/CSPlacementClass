

/*
Find the address of a student who got second highest marks 

*/

import java.util.*;

public class Main
{
    String name;
    String address;
   int rollNo;
    int DAA_marks;
    int coa;
    Main objArray[]=new Main[5];
  
    
	public static void main(String[] args) {
	
	for(int i=0;i<5;i++){
	    objArray[i]=new Main();   //now we have 100 contagious memory location
    
	}
	objArray[0].name="A";
	objArray[0].DAA_marks=75;
	objArray[0].address="Muradnagar";
	
	objArray[1].name="B";
	objArray[1].DAA_marks=87;
	objArray[1].address="Delhi";
	
	
	objArray[2].name="C";
	objArray[2].DAA_marks=99;
	objArray[2].address="Ghaziabad";
	
	
	objArray[3].name="D";
	objArray[3].DAA_marks=65;
	objArray[3].address="Meerut";
	
	
	objArray[4].name="E";
	objArray[4].DAA_marks=78;
	objArray[4].address="Mathura";
	
	 Arrays.sort(objArray[n].DAA_marks);
	 	System.out.println("Second highest student's address is:  "+ objArray[3].address);
	
	Main st1=new Main(); //new because it will allocate memory 
	st1.name="Sneha";
	st1.rollNo=162;
	Main st2=new Main(); //new because it will allocate memory 
	st2.name="Jaiswal";
	st2.rollNo=27;
	
	System.out.println("Sudent 1 name is "+ st1.name);
	System.out.println("Sudent 1 name is "+ st1.name);
		
	}
}
