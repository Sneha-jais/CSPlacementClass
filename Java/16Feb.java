/*

Javac----> filename.java to filename.class
Static will be called only at statis variable and methods... because static allocate the memory at only class level
CONSTRUCTOR: 
In every class of java there exist empty constructor.
and if we manipulate it, it will be called Overloading

we can define more than one method with same name/// called polymorphism
we can run a while loop in code maximum----jitni ram ki memory h
*/

import java.util.*;
public class Main
{
    String name;
    int id = 101;
    double sal;
	
	IT(){
	}
	IT(String org_name,int org_pid,long org_sal){
	this.name=name	
		
	}
	
    static double IncomeTax(double sal)
    {
        double tax;
        
        if(sal<300000)
        {
            tax = sal*(0);
            return tax;
        }
            
        
        else if(sal>300000 && sal<=500000)
        {
            tax = sal*(0.05);
            return tax;
            
        }
            
        else
           return sal*(0.1);
    }
    
	public static void main(String[] args) {
	    Main o[] = new Main[3];  //
	    Scanner input = new Scanner(System.in);
	    for(int i=0; i<3;i++)
	    {
	        o[i] = new Main(); //making the constructor for each value
	        System.out.println("enter the name of emp:");
	        o[i].name = input.next();
	        System.out.println("enter the ID of emp:");
	        o[i].id = input.nextInt();
	        System.out.println("enter the sal of emp:");
	        o[i].sal = input.nextDouble();
	    }
	    System.out.println("enter the ID of emp for which u wnt the tax:");
	    int value = input.nextInt();
	    for(int i = 0;i<3;i++)
	    {
	        if(value == o[i].id)
	        {
	            double temp = IncomeTax(o[i].sal);
	            System.out.println("The tax: "+temp);
	        }
	    }
	
	}
}

