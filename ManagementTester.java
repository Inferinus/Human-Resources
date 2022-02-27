import java.text.NumberFormat;
import java.util.Locale;

/**
Description:   This is a client application of the Management class.
               This class tests the functionality of the Management class methods.
     
     Author: William Crum
      
       Date: November 3, 2020
*/

public class ManagementTester {

   public static void main(String args[])
   {
      
      NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US); 
     
      Management manager1 ;    // the first manager
      Management manager2;     // the second manager
      
      Dat manager1BirthDate;  // the birthday of the first manager
      Dat manager2BirthDate;  // the birthday of the second manager
                         
      Address address1;       // temporary holding variable for an Address record for the first manager 
      Person person1;         // temporary holding variable for the Person record for the first manager 
      
      int orderNumber;        // the result from compareTo      


      /******************************************************************
     
           Test 1: 
	   
	   	  Test creating a new Management object and toString().
          
      ******************************************************************/
      
      manager1BirthDate = new Dat(12,11,1998);
      
      address1 = new Address("126 Wonder Lane", "Always Happy", "Virginia", "34810");
      
      person1 = new Person("Sally", "Summers", manager1BirthDate, address1);
      
      manager1 = new Management(person1, "213-45-7251",  "ceo@abcorp.net", "305-234-6272", "m0011", "CEO", 12000, 4500);
      
      System.out.println("\n\nTest 1: Test creating a new Management object and toString().\n"); 
      System.out.println("Management 1\n\n" + manager1.toString());
      
     
      /******************************************************************
     
           Test 2: 
	   
	           Test set methods.
          
      ******************************************************************/
      
      manager2 = new Management();
      
      manager2BirthDate = new Dat(23,5,1983);
      
      //In the Person Class
      manager2.setFirstName("Jane");     
      manager2.setLastName("Jones");
      manager2.setBirthDate(manager2BirthDate);     
      manager2.setStreet("1756 Pine Avenue");    
      manager2.setCity("Pineville");    
      manager2.setState("Maine");    
      manager2.setZipCode("08012");
        
      //In the Employee Class     
      manager2.setSocialSecurity("111-23-0101");     
      manager2.setEmail("jjones@abcorp.net");    
      manager2.setTelephone("800-234-0000");    
      manager2.setEmployeeID("m7001");

      //In Management Class
      manager2.setTitle("Vice President"); 
      manager2.setSalary(90000);    
      manager2.setBonus(65000);
     
      System.out.println("\n\nTest 2: Test set methods.\n"); 
      System.out.println("Management 2\n\n" + manager2.toString());
      
     
      /******************************************************************
     
           Test 3: 
	   
	           Test the payCheck method.
          
      ******************************************************************/

      System.out.println("\n\nTest 3: Test the payCheck method.\n"); 
      System.out.println("Management 2 Pay Check " + money.format(manager2.payCheck()));
     
                      
      /******************************************************************
     
           Test 4: 
	   
	           Test get methods
          
      ******************************************************************/
                    
      System.out.println("\n\nTest 4: Test get methods\n"); 
      System.out.println("\n\n" +
                         "The first name is " + manager2.getFirstName() + ".\n" +
                         "The last name is " + manager2.getLastName() + "\n" +
                         "The birth date is " + manager2.getBirthDate().toString() + ".\n" +
                         "The street is " + manager2.getStreet() + ".\n" +
                         "The city is " + manager2.getCity() + ".\n" +
                         "The state is " + manager2.getState() + ".\n" +
                         "The postal code is " + manager2.getZipCode() + ".\n" +
                         "The social security number is " + manager2.getSocialSecurity() + ".\n" +
                         "The e-mail address is " + manager2.getEmail() + ".\n" +    
                         "The telephone number is " + manager2.getTelephone() + ".\n" +
                         "The title is " + manager2.getEmployeeID() + ".\n" + 
                         "The title is " + manager2.getTitle() + ".\n" + 
                         "The salary is " +  money.format(manager2.getSalary()) + ".\n" +   
                         "The bomus is " +  money.format(manager2.getBonus()) + ".\n" +  
                         "The pay check is " +  money.format(manager2.payCheck())+ ".\n\n");
                    
    /******************************************************************
     
           Test 5: 
	   
	   	  Test equals method.
          
      ******************************************************************/
      
      System.out.println("\n\nTest 5: Test equals method.\n"); 
      System.out.print("\n\nManager 1 is "); 
      
      if(manager1.equals(manager2))
      {
        System.out.println("the same as manager 2.\n\n");
      }
      else
      {
        System.out.println("not the same as manager 2.\n\n");
      }   
  
  /******************************************************************
     
           Test 6: 
	   
	   	  Test compareTo
          
      ******************************************************************/
      
      System.out.println("\n\nTest 6: Test compareTo method.\n");
      
      System.out.print("\n\nManager 1 is "); 
      
      orderNumber = manager1.compareTo(manager2);
      
      if(orderNumber == 0)
      
        System.out.println("the same as manager 2.\n\n");
        
      else
      
        if(orderNumber > 0)
      
           System.out.println("comes after management 2.\n\n");
    	
         else
         
	        System.out.println("comes before manager 2.\n\n"); 
      
    /******************************************************************
     
         As Test 7 and Test 8 are fatal errors, they cannot be tested together. 
	   
         Execute the tester to run Test 7. Then comment out lines 194 and 195.
         
         Recompile the program.
         
         Execute the tester to run Test 8. 
          
      ******************************************************************/       
      
      /******************************************************************
     
           Test 7: 
	   
	   	  Test error checking setSalary: salary below zero
          
      ******************************************************************/
      
      System.out.println("\n\nTest 7: Test error checking setSalary: salary below zero\n");                       
      manager1.setSalary(-10.50);  
      
      /******************************************************************
     
           Test 8: 	   
	   
	      Test error checking setBonus: bonus below zero
          
      ******************************************************************/
      
      System.out.println("\n\nTest 8: Test error checking setBonus: bonus below zero\n");
      manager1.setBonus(-10.25);    
  
   } // main
  
}// ManagementTester	