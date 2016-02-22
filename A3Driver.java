package Assignment3;

import java.util.*;
import java.io.*;

public class A3Driver 
{
	  public static void main(String[] args) 
	  {
		  ArrayList<Item> shoppingCart = new ArrayList<Item>(); 
		  if (args.length != 1) 
		  {
			  System.err.println ("Error: Incorrect number of command line arguments");
			  System.exit(-1);
		  } 
		  try 
			{
				FileReader freader = new FileReader(args[0]);
				BufferedReader reader = new BufferedReader(freader);
				for (String s = reader.readLine(); s != null; s = reader.readLine()) 
				{
					try{
						String[] input = s.split(" ");
						switch(input[0])
						{
						case "insert" : break;
						case "search" : break;
						case "delete" : break;
						case "update" : break;
						case "print" : System.out.println("Hello");break;
						default: throw new InvalidCategoryException("Invalid Category");
						}
					} catch(InvalidCategoryException a){
						
						System.err.println("INVALID CATEGORY, COMMAND ABORTED");
					}
				}
			} 
			catch (FileNotFoundException e) 
			{
				System.err.println ("Error: File not found. Exiting...");
				e.printStackTrace();
				System.exit(-1);
			} catch (IOException e) 
			{
				System.err.println ("Error: IO exception. Exiting...");
				e.printStackTrace();
				System.exit(-1);
			}
		
		// General code example for how to iterate an array list. You will have to modify this heavily, to suit your needs.
		  Iterator<Item> i = shoppingCart.iterator();
		  while (i.hasNext()) 
		  {
			  Item temp = i.next();
			  temp.calculatePrice(); 
			  temp.printItemAttributes();
			  //This (above) works because of polymorphism: a determination is made at runtime, 
			  //based on the inherited class type, as to which method is to be invoked. Eg: If it is an instance
			  // of Grocery, it will invoke the calculatePrice () method defined in Grocery.
		  }		
	  }
	  
}
