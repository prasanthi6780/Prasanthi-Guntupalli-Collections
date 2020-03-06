package com.epam.Prasanthi_Guntupalli_Collections;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
		Scanner sc=new Scanner(System.in);
        Newlist<Integer> newlist=new Newlist<Integer>();
        newlist.append_element(12);
   	 	newlist.append_element(23);
   	 	newlist.append_element(34);
   	 	newlist.append_element(45);
   	 	newlist.append_element(56);
   	 	newlist.append_element(67);
   	 	newlist.append_element(78);
   	 	newlist.append_element(89);
   	 	newlist.append_element(90);
   	 	newlist.append_element(01);
  	    System.out.println("Initially list is:");
  	    System.out.print(newlist+"\n");
  	    boolean flag=true;
  	    while(flag) 
        {
  	    	System.out.println("Choose one of the Operation on list:");
  	        System.out.println("1.Add element\n2.Get element\n3.Remove element\n4.PrintList");
  	      	int operation_choice= sc.nextInt();
  		    if(operation_choice==1)
  		    {
  		        System.out.println("Enter a number to append into list:");
  		        int n=sc.nextInt();
  		        newlist.append_element(n);
  		        System.out.println("the list after appending element"+newlist);
  		    }
  		    else if(operation_choice==2)
  		    {
		       	System.out.println("Enter a index position to get an element:");
		       	int list_index=sc.nextInt();
		       	System.out.println("The element at position "+list_index+" is:"+newlist.get_element(list_index));
	        }
  		    else if(operation_choice==3)
  		    {
  		        System.out.println("Enter a index position to remove an element:");
  		        int list_index=sc.nextInt();
  		        System.out.println("The removed element is "+newlist.remove_element(list_index));
  		        System.out.println("the list after removing element"+newlist);
  		    }
  		    else if(operation_choice==4) 
  	        {
  		    	System.out.println(newlist);
  	        }
  		    else
  		    {
  		        System.out.println("Invalid choice\n");
  		    }
  		    System.out.println("\nDo you want to continue:(1/0)");
  		    int a=sc.nextInt();
  		    if(a==1) 
  		    {
  		        flag=true;
  		    }
  		    else
  		    {
  		        flag=false;
  		    }
  	    }
  	    System.out.println("Program Terminated");
    }
}
