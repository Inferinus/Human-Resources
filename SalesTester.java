import java.text.NumberFormat;
import java.util.Locale;

/**
Description:   This is a client application of the Sales class.
               This class tests the functionality of the Sales class methods.
     
     Author: William Crum
      
       Date: November 4, 2020
*/

public class SalesTester {

   public static void main(String args[])
   {
      
      NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US); 
     
      Sales salesperson1 ;    // the first salesperson
      Sales salesperson2;     // the second salesperson
      
      Dat salesperson1BirthDate;  // the birthday of the first salesperson
      Dat salesperson2BirthDate;  // the birthday of the second salesperson
                         
      Address address1;       // temporary holding variable for an Address record for the first salesperson 
      Person person1;         // temporary holding variable for the Person record for the first salesperson 

      /******************************************************************
     
           Test 1: 
	   
	   	  Test creating a new Sales object and toString().
          
      ******************************************************************/
      
      salesperson1BirthDate = new Dat(12,11,1998);
      
      address1 = new Address("9026 Stonde Street", "Stoneville", "Maryland", "21810");
      
      person1 = new Person("High", "Pressure", salesperson1BirthDate, address1);
      
      salesperson1 = new Sales(person1, "903-49-7001",  "hpressure@abcorp.net", "885-714-6622", "s2015", "Retail", 3600, 900);
      
      System.out.println("\n\nTest 1: Test creating a new Sales object and toString().\n"); 
      System.out.println("Sales 1\n\n" + salesperson1.toString());
      
     
      /******************************************************************
     
           Test 2: 
	   
	           Test set methods.
          
      ******************************************************************/
      
      salesperson2 = new Sales();
      
      salesperson2BirthDate = new Dat(23,5,1983);
      
      //In the Person Class
      salesperson2.setFirstName("Johnny");     
      salesperson2.setLastName("Appleseed");
      salesperson2.setBirthDate(salesperson2BirthDate);     
      salesperson2.setStreet("1456 Macintosh Road");    
      salesperson2.setCity("Fruit Towne");    
      salesperson2.setState("Maine");    
      salesperson2.setZipCode("78312");
        
      //In the Employee Class     
      salesperson2.setSocialSecurity("101-99-9101");     
      salesperson2.setEmail("jappleseed@abcorp.net");    
      salesperson2.setTelephone("800-234-0000");    
      salesperson2.setEmployeeID("s7001");

      //In Sales Class
     salesperson2.setDivision("Wholesale"); 
     salesperson2.setSales(103000);    
     salesperson2.setBasePay(500);
     
      System.out.println("\n\nTest 2: Test set methods.\n"); 
      System.out.println("Sales 2\n\n" + salesperson2.toString());
      
     
      /******************************************************************
     
           Test 3: 
	   
	           Test the payCheck method.
          
      ******************************************************************/

      System.out.println("\n\nTest 3: Test the payCheck method.\n"); 
      System.out.println("Sales 2 Pay Check " + money.format(salesperson2.payCheck()));
     
                      
      /******************************************************************
     
           Test 4: 
	   
	           Test get methods
          
      ******************************************************************/
                    
      System.out.println("\n\nTest 4: Test get methods\n"); 
      System.out.println("\n\n" +
                         "The first name is " + salesperson2.getFirstName() + ".\n" +
                         "The last name is " + salesperson2.getLastName() + "\n" +
                         "The birth date is " + salesperson2.getBirthDate().toString() + ".\n" +
                         "The street is " + salesperson2.getStreet() + ".\n" +
                         "The city is " + salesperson2.getCity() + ".\n" +
                         "The state is " + salesperson2.getState() + ".\n" +
                         "The postal code is " + salesperson2.getZipCode() + ".\n" +
                         "The social security number is " + salesperson2.getSocialSecurity() + ".\n" +
                         "The e-mail address is " + salesperson2.getEmail() + ".\n" +    
                         "The telephone number is " + salesperson2.getTelephone() + ".\n" +
                         "The title is " + salesperson2.getEmployeeID() + ".\n" +
                         "The division is " + salesperson2.getDivision() + "\n" + 
                         "The sales are " +  money.format(salesperson2.getSales()) + "\n" +   
                         "The base pay is " +  money.format(salesperson2.getBasePay()) + "\n" +
                         "The pay check is " +  money.format(salesperson2.payCheck())+ ".\n\n");
                    
      /******************************************************************
     
           Test 5: 
	   
	   	  Test payCheck: sales between $30,000 and $50,0000
          
      ******************************************************************/
      
       
      System.out.println("\n\nTest 5: Test payCheck: sales between $30,000 and $50,0000"); 
      salesperson1.setSales(40000);    
      System.out.println("\n\n" + money.format(salesperson1.payCheck()) + "\n\n");  

  
      
      /******************************************************************
     
           Test 6: 
	   
	   	  Test payCheck: sales above $50,0000
          
      ******************************************************************/
      
      System.out.println("\n\nTest 6: Test payCheck: sales above $50,0000");  
      salesperson1.setSales(60000);                          
      System.out.println("\n\n" + money.format(salesperson1.payCheck()) + "\n\n");
      
    /******************************************************************
     
         As Test 7 and Test 8 are fatal errors, they cannot be tested together. 
	   
         Execute the tester to run Test 7. Then comment out lines 194 and 195.
         
         Recompile the program.
         
         Execute the tester to run Test 8. 
          
      ******************************************************************/  
      
      /******************************************************************
     
           Test 7: 
	   
	   	  Test error checking setSales: sales below zero
          
      ******************************************************************/
      
      System.out.println("\n\nTest 7: Test error checking setSales: sales below zero\n");                       
      salesperson1.setSales(-10.50);  
      
      /******************************************************************
     
           Test 8: 	   
	   
	      Test error checking setBase: base pay below zero
          
      ******************************************************************/
      
      System.out.println("\n\nTest 8: Test error checking setBase: base pay below zero\n");
      salesperson1.setBasePay(-10.25);    
   } // main
  
}// SalesTester	