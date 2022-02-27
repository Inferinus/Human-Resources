import java.text.NumberFormat;
import java.util.Locale;

/**
Description:   This is a client application of the Hourly class.
               This class tests the functionality of the Hourly class methods.
     
     Author: William Crum
      
       Date: November 4, 2020
*/

public class HourlyTester {

   public static void main(String args[])
   {
      
      NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US); 
     
      Hourly hourlyperson1 ;    // the first hourly worker
      Hourly hourlyperson2;     // the second hourly worker
      
      Dat hourlyperson1BirthDate;  // the birthday of the first hourly worker
      Dat hourlyperson2BirthDate;  // the birthday of the second hourly worker
                         
      Address address1;       // temporary holding variable for an Address record for the first hourly worker 
      Person person1;         // temporary holding variable for the Person record for the first hourly worker 


      /******************************************************************
     
           Test 1: 
	   
	   	  Test creating a new Hourly object and toString().
          
      ******************************************************************/
      
      hourlyperson1BirthDate = new Dat(12,11,1998);
      
      address1 = new Address("100 Old Lane", "Old Town", "Virginia", "34810");
      
      person1 = new Person("Susie", "Queue", hourlyperson1BirthDate, address1);
      
      hourlyperson1 = new Hourly(person1, "203-15-7250",  "squeue@abcorp.net", "305-294-7002", "hw2505", "Full-Time", 40, 11.25);
      
      System.out.println("\n\nTest 1: Test creating a new Hourly object and toString().\n"); 
      System.out.println("Hourly 1\n\n" + hourlyperson1.toString());
      
     
      /******************************************************************
     
           Test 2: 
	   
	           Test set methods.
          
      ******************************************************************/
      
      hourlyperson2 = new Hourly();
      
      hourlyperson2BirthDate = new Dat(23,5,1983);
      
      //In the Person Class
      hourlyperson2.setFirstName("Jon");     
      hourlyperson2.setLastName("Williams");
      hourlyperson2.setBirthDate(hourlyperson2BirthDate);     
      hourlyperson2.setStreet("1756 Maple Avenue");    
      hourlyperson2.setCity("Tree City");    
      hourlyperson2.setState("Maine");    
      hourlyperson2.setZipCode("08012");
        
      //In the Employee Class     
      hourlyperson2.setSocialSecurity("201-93-8101");     
      hourlyperson2.setEmail("jwilliams@abcorp.net");    
      hourlyperson2.setTelephone("270-724-1978");    
      hourlyperson2.setEmployeeID("hw6001");
      
      //In Hourly Class
      hourlyperson2.setClassification("Part-Time");; 
      hourlyperson2.setHours(15);   
      hourlyperson2.setWage(11.25);
     
      System.out.println("\n\nTest 2: Test set methods.\n"); 
      System.out.println("Hourly 2\n\n" + hourlyperson2.toString());
      
     
      /******************************************************************
     
           Test 3: 
	   
	           Test the payCheck method.
          
      ******************************************************************/

      System.out.println("\n\nTest 3: Test the payCheck method.\n"); 
      System.out.println("Hourly 2 Pay Check " + money.format(hourlyperson2.payCheck()));
     
                      
      /******************************************************************
     
           Test 4: 
	   
	           Test get methods
          
      ******************************************************************/
                    
      System.out.println("\n\nTest 4: Test get methods\n"); 
      System.out.println("\n\n" +
                         "The first name is " + hourlyperson2.getFirstName() + ".\n" +
                         "The last name is " + hourlyperson2.getLastName() + "\n" +
                         "The birth date is " + hourlyperson2.getBirthDate().toString() + ".\n" +
                         "The street is " + hourlyperson2.getStreet() + ".\n" +
                         "The city is " + hourlyperson2.getCity() + ".\n" +
                         "The state is " + hourlyperson2.getState() + ".\n" +
                         "The postal code is " + hourlyperson2.getZipCode() + ".\n" +
                         "The social security number is " + hourlyperson2.getSocialSecurity() + ".\n" +
                         "The e-mail address is " + hourlyperson2.getEmail() + ".\n" +    
                         "The telephone number is " + hourlyperson2.getTelephone() + ".\n" +
                         "The title is " + hourlyperson2.getEmployeeID() + ".\n" +
                         "The division is " + hourlyperson2.getClassification() + "\n" + 
                         "The hourly are " +  hourlyperson2.getHours() + "\n" +   
                         "The base pay is " +  money.format(hourlyperson2.getWage()) + "\n" +  
                         "The pay check is " +  money.format(hourlyperson2.payCheck())+ ".\n\n");
                    
  
    /******************************************************************
     
           Test 5: 
	   
	   	  Test payCheck: hours over 40
          
      ******************************************************************/
      
       
      System.out.println("\n\nTest 5: Test payCheck: hours over 40"); 
      hourlyperson2.setHours(52);
      System.out.println("\n\n" + money.format(hourlyperson2.payCheck()) + "\n\n");  
      
    /******************************************************************
     
         As Test 6 and Test 7 are fatal errors, they cannot be tested together. 
	   
         Execute the tester to run Test 6. Then comment out lines 158 and 159.
         
         Recompile the program.
         
         Execute the tester to run Test 7. 
          
      ******************************************************************/   
          
      /******************************************************************
     
           Test 6: 
	   
	   	  Test error checking setHours: hours below zero
          
      ******************************************************************/
      
      System.out.println("\n\nTest 6: Test error checking setHours: hours below zero\n");                       
      hourlyperson1.setHours(-3);  
      
      /******************************************************************
     
           Test 7: 	   
	   
	      Test error checking setWage: wage below zero
          
      ******************************************************************/
      
      System.out.println("\n\nTest 7: Test error checking setWage: wage below zero\n");
      hourlyperson1.setWage(-1.30);    
      
   } // main
  
}// HourlyTester