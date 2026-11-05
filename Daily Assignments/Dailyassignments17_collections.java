package dailyassignments;

import java.util.*;

class product
{
	int productId;
	String productName;
	double price;
	int quantity;
	
	product ( int productId, String productName,double price,int quantity)
	{
		this.productId= productId;
		this.productName = productName;
		this.price =price;
		this.quantity =quantity;
	}
	
	void display()
	{
		System.out.println("productId: " +productId +"\nproductName: " + productName + 
	    		"\nprice: " +price + "\nquantity: " +quantity );
	}
}

public class Dailyassignments17_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<product> list = new ArrayList<product>();
	    product pt1 = new product(101, "Laptop", 55000, 5);
	    product pt2 = new product(102, "Mouse", 800, 10);
	    product pt3 = new product(103, "Keyboard", 1500, 0);
	    list.add(pt1);
	    list.add(pt2);
	    list.add(pt3);
	    
	    System.out.println("All the Products");
	    for(product p:list)
	    {
	    	p.display();
	    	System.out.println();
	 
	    	if(p.quantity<5)
	    	{
	    System.out.println("Product quantity is less than 5:");	
	    p.display();
	        }
	    }
	    
	  
	   System.out.println("\nmost expensive product:");	
	   
	   product expensiveProduct = list.get(0);

       for (product p : list) 
       {
           if (p.price > expensiveProduct.price) 
           {
               expensiveProduct = p;    
           }
           
       }
       expensiveProduct.display();
	   
	   
	   System.out.println("\ntotal inventory value:");
	   double totalvalue = 0;
	   for(product p:list)
	   {
       totalvalue = totalvalue + (p.price * p.quantity);
	   }
	    System.out.println(totalvalue);
   	
	
	   for (product p : list) 
	   {
		   
           if (p.productName.equals("Mouse")) 
           {
               p.price = 1000;
               System.out.println("\nMouse price updated to Rs. " + p.price);
           }
       }
	   
	  System.out.println("\nRemove products whose quantity is zero.");
	  Iterator<product> iterator = list.iterator();

      while (iterator.hasNext()) 
      {
          product p = iterator.next();

          if (p.quantity == 0) 
          {
              iterator.remove();
              System.out.println(p.productName + " removed successfully.");
          }
          }
	  
	  
	   
	  System.out.println("\nFinal Products");
      for (product p : list) 
          p.display();
	   
	   
	   
	    	
	    	
	    	
	    }

	}
