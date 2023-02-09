
/*
structure of class is like class of java... the main difference is that in java there is method.
Java is case sensitive language

java is a stirctly typed while python is loosely typed language... i.e. in python we don't need to define the data type of variables.



*/


/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    String name;
   int rollNo;
    int DAA_marks;
    int coa;
    
	public static void main(String[] args) {
	
	Main st1=new Main(); //new because it will allocate memory 
	st1.name="Sneha";
	st1.rollNo=162;
	Main st2=new Main(); //new because it will allocate memory 
	st2.name="Jaiswal";
	st2.rollNo=27;
	
	System.out.println("Sudent 1 name is "+ st1.name);
	
		
	}
}

