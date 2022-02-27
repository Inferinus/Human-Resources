/*
Description:   This is a client application of the Payroll class.
               This class tests the functionality of the Payroll class methods.

       Lesson: PayrollTester
   Programmer: William Crum

         Date: November 5, 2020
     Modified: November 6, 2020

*/

import java.util.Locale;
import java.text.NumberFormat;

public class PayrollTester
{
 public static void main (String[] args)
 {

  NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US); 

  Payroll payroll = new Payroll();          //the employee database
  
  Employee testEmployee;                    //a temporary variable used to test getEmployee and removeEmployee 
  
  int location;                             //a location in the database
  
  Management janejones = new Management();  //manager #1
  Dat janejonesBirthDate;
  
  Management franksmith = new Management(); //manager #2
  Dat franksmithBirthDate;  
  
  Management formerboss = new Management(); //manager #3
  Dat formerbossBirthDate;
  
  Sales alwayssmiling = new Sales();        //salesperson #1
  Dat alwayssmilingBirthDate;
  
  Sales topperformer = new Sales();         //salesperson #2
  Dat topperformerBirthDate; 
  
  Sales vpsson = new Sales();               //salesperson #3
  Dat vpssonBirthDate;
  
  Hourly hardworker = new Hourly();         //hourly worker #1
  Dat hardworkerBirthDate;  
  
  Hourly ontime = new Hourly();              //hourly worker #2
  Dat ontimeBirthDate;  
  
  Hourly niceperson = new Hourly();         //hourly worker #3
  Dat nicepersonBirthDate;
  
  
     /******************************************************************
     
           Setting up sample employee records
          
      ******************************************************************/
      
  //Management Employee 1
  
     janejonesBirthDate = new Dat(23,5,1983);
     
     //In the Person Class
     janejones.setFirstName("Jane");     
     janejones.setLastName("Jones");  
     janejones.setBirthDate(janejonesBirthDate);     
     janejones.setStreet("1756 Pine Avenue");    
     janejones.setCity("Pineville");    
     janejones.setState("Maine");    
     janejones.setZipCode("08012");
        
      //In the Employee Class     
     janejones.setSocialSecurity("111-23-0101");         
     janejones.setEmail("jjones@abcorp.net");    
     janejones.setTelephone("800-234-0000");    
     janejones.setEmployeeID("m7001");

      //In Management Class
     janejones.setTitle("CEO"); 
     janejones.setSalary(90000);    
     janejones.setBonus(65000);

  //Management Employee 2
  
     franksmithBirthDate = new Dat(7,8,1970);
     
     //In the Person Class
     franksmith.setFirstName("Frank");     
     franksmith.setLastName("Smith");      
     franksmith.setBirthDate(franksmithBirthDate);     
     franksmith.setStreet("1729 Maple Street");    
     franksmith.setCity("Bangor");    
     franksmith.setState("Maine");    
     franksmith.setZipCode("08010");
        
      //In the Employee Class     
     franksmith.setSocialSecurity("101-23-2334");     
     franksmith.setEmail("fsmith@abcorp.net");    
     franksmith.setTelephone("800-234-0010");    
     franksmith.setEmployeeID("m6801");

      //In Management Class
     franksmith.setTitle("Vice President"); 
     franksmith.setSalary(60000);    
     franksmith.setBonus(2345);
     
 //Management Employee 3
 
     formerbossBirthDate = new Dat(2,3,1960); 
     
     //In the Person Class
     formerboss.setFirstName("Former");     
     formerboss.setLastName("Boss");   
     formerboss.setBirthDate(formerbossBirthDate);     
     formerboss.setStreet("5629 Grand Avenue");    
     formerboss.setCity("Bangor");    
     formerboss.setState("Maine");    
     formerboss.setZipCode("08010"); 
        
      //In the Employee Class     
     formerboss.setSocialSecurity("100-39-9101");       
     formerboss.setEmail("fboss@abcorp.net");    
     formerboss.setTelephone("800-234-9090");    
     formerboss.setEmployeeID("m8304");

      //In Management Class
     formerboss.setTitle("President"); 
     formerboss.setSalary(100000);    
     formerboss.setBonus(65);
     
      //Sales Employee 1
      
     alwayssmilingBirthDate = new Dat(12,10,1994);
     
     //In the Person Class
     alwayssmiling.setFirstName("Always");     
     alwayssmiling.setLastName("Smiling");   
     alwayssmiling.setBirthDate(alwayssmilingBirthDate);     
     alwayssmiling.setStreet("6278 Plum Avenue");    
     alwayssmiling.setCity("Pineville");    
     alwayssmiling.setState("Maine");    
     alwayssmiling.setZipCode("08012");
        
      //In the Employee Class      
     alwayssmiling.setSocialSecurity("091-73-2174");      
     alwayssmiling.setEmail("asmiling@abcorp.net");    
     alwayssmiling.setTelephone("800-234-0007");    
     alwayssmiling.setEmployeeID("s7001");

      //In Sales Class
     alwayssmiling.setDivision("wholesale"); 
     alwayssmiling.setSales(150000);    
     alwayssmiling.setBasePay(450);
     
      //Sales Employee 2
      
     topperformerBirthDate = new Dat(11,1,1987);
     
     //In the Person Class
     topperformer.setFirstName("Top");     
     topperformer.setLastName("Performer");     
     topperformer.setBirthDate(topperformerBirthDate);     
     topperformer.setStreet("2389 Stars Street");    
     topperformer.setCity("Bugsville");    
     topperformer.setState("Maine");    
     topperformer.setZipCode("08027"); 
        
      //In the Employee Class      
     topperformer.setSocialSecurity("219-73-9734");    
     topperformer.setEmail("tperformer@abcorp.net");    
     topperformer.setTelephone("800-234-0035");    
     topperformer.setEmployeeID("s7871");

      //In Sales Class
     topperformer.setDivision("retail"); 
     topperformer.setSales(45000);    
     topperformer.setBasePay(500);

     
      //Sales Employee 3
      
     vpssonBirthDate = new Dat(4,9,1995);
     
     //In the Person Class
     vpsson.setFirstName("VPs");     
     vpsson.setLastName("Son");   
     vpsson.setBirthDate(vpssonBirthDate);     
     vpsson.setStreet("1729 Maple Street");    
     vpsson.setCity("Bangor");    
     vpsson.setState("Maine");    
     vpsson.setZipCode("08010");
        
      //In the Employee Class     
     vpsson.setSocialSecurity("783-93-0783");       
     vpsson.setEmail("vson@abcorp.net");    
     vpsson.setTelephone("800-234-0100");    
     vpsson.setEmployeeID("s0629");

      //In Sales Class
     vpsson.setDivision("consumer"); 
     vpsson.setSales(100);    
     vpsson.setBasePay(400);

      //Hourly Employee 1
      
     hardworkerBirthDate = new Dat(7,8,1990);
     
     //In the Person Class
     hardworker.setFirstName("Hard");     
     hardworker.setLastName("Worker");  
     hardworker.setBirthDate(hardworkerBirthDate);     
     hardworker.setStreet("3456 Spruce Avenue");    
     hardworker.setCity("Spruceville");    
     hardworker.setState("Maine");    
     hardworker.setZipCode("08013");
        
      //In the Employee Class      
     hardworker.setSocialSecurity("150-34-5678");       
     hardworker.setEmail("hworkers@abcorp.net");    
     hardworker.setTelephone("800-234-1000");    
     hardworker.setEmployeeID("hw0972");
      
      //In Hourly Class
     hardworker.setClassification("part time");; 
     hardworker.setHours(15);   
     hardworker.setWage(11.25);  
     
     //Hourly Employee 2
     
     ontimeBirthDate = new Dat(10,5,1980);  
     
     //In the Person Class
     ontime.setFirstName("On");     
     ontime.setLastName("Time");    
     ontime.setBirthDate(ontimeBirthDate);     
     ontime.setStreet("8562 Pine Avenue");    
     ontime.setCity("Pineville");    
     ontime.setState("Maine");    
     ontime.setZipCode("08012"); 
        
      //In the Employee Class    
     ontime.setSocialSecurity("911-83-0809");       
     ontime.setEmail("otime@abcorp.net");    
     ontime.setTelephone("800-234-1005");    
     ontime.setEmployeeID("hw0981");
      
      //In Hourly Class
     ontime.setClassification("full time");; 
     ontime.setHours(40);   
     ontime.setWage(12.25);     
     
     
     //Hourly Employee 3
     
     nicepersonBirthDate = new Dat(1,12,1980); 
     
     //In the Person Class
     niceperson.setFirstName("Nice");     
     niceperson.setLastName("Person");    
     niceperson.setBirthDate(nicepersonBirthDate);     
     niceperson.setStreet("5691 Good Place");    
     niceperson.setCity("Spruceville");    
     niceperson.setState("Maine");    
     niceperson.setZipCode("08013");
        
      //In the Employee Class       
     niceperson.setSocialSecurity("234-87-4561");    
     niceperson.setEmail("nperson@abcorp.net");    
     niceperson.setTelephone("800-234-1023");    
     niceperson.setEmployeeID("hw6001");
      
      //In Hourly Class
     niceperson.setClassification("full time");; 
     niceperson.setHours(45);   
     niceperson.setWage(12.2);    
     
     /******************************************************************
     
           Test 1: 
	   
	           test getEmployee with an empty database.
          
      ******************************************************************/
     
     
     System.out.println("\nTest 1: getEmployee with an empty database.\n");
     
     
     location = 1;
     
     testEmployee = payroll.getEmployee(location);
     
     if(testEmployee != null)
       System.out.println("Record returned" + testEmployee.toString() + "\n");
     else
       System.out.println("No employee records found.\n");
     

     /******************************************************************
     
           Test 2: 
	   
	           test removeEmployee with an empty database.
          
      ******************************************************************/
      
     System.out.println("\nTest 2: removeEmployee with an empty database.\n");
         
     if(payroll.removeEmployee("234-56-1243"))
       System.out.println("Record removed\n");
     else
       System.out.println("No employemwnt records found.\n");    
    
     /******************************************************************
     
           Test 3: 
	   
	           test adding employees to the database.
          
      ******************************************************************/
    
     System.out.println("\nTest 3: adding employees to the database.\n");
     
     if(payroll.addEmployee(janejones))
        System.out.println("Employee added to the database.\n");
     else
        System.out.println("Employee already in the database.\n");
        
     if(payroll.addEmployee(franksmith))
        System.out.println("Employee added to the database.\n");
     else
        System.out.println("Employee already in the database.\n");  
        
     if(payroll.addEmployee(formerboss))
        System.out.println("Employee added to the database.\n");
     else
        System.out.println("Employee already in the database.\n");  
        
     if(payroll.addEmployee(alwayssmiling))
        System.out.println("Employee added to the database.\n");
     else
        System.out.println("Employee already in the database.\n");                
             
     if(payroll.addEmployee(topperformer))
        System.out.println("Employee added to the database.\n");
     else
        System.out.println("Employee already in the database.\n");      
        
     if(payroll.addEmployee(vpsson))
        System.out.println("Employee added to the database.\n");
     else
        System.out.println("Employee already in the database.\n");      
        
     if(payroll.addEmployee(hardworker))
        System.out.println("Employee added to the database.\n");
     else
        System.out.println("Employee already in the database.\n");     
        
     if(payroll.addEmployee(ontime))
        System.out.println("Employee added to the database.\n");
     else
        System.out.println("Employee already in the database.\n");   
        
        
     if(payroll.addEmployee(niceperson))
        System.out.println("Employee added to the database.\n");
     else
        System.out.println("Employee already in the database.\n");  
        
             
     /******************************************************************
     
           Test 4: 
	   
	           test getEmployee with an empty database.
          
      ******************************************************************/
     
     
     System.out.println("\nTest 4: getEmployee with location out of range.\n");
     
     
     location = 10;
     
     testEmployee = payroll.getEmployee(location);
     
     if(testEmployee != null)
       System.out.println("Record returned" + testEmployee.toString() + "\n");
     else
       System.out.println("Location out of range.\n");
     
    /******************************************************************
     
           Test 5: 
	   
	           test adding an existing employee to the database.
          
      ******************************************************************/
    
     System.out.println("\nTest 5: adding an existing employee to the database.\n");
     
     if(payroll.addEmployee(janejones))
        System.out.println("Employee added to the database.\n");
     else
        System.out.println("Employee already in the database.\n");  
     
     /******************************************************************
     
           Test 6: 
	   
	           test toString().
          
      ******************************************************************/
    
     System.out.println("\nTest 6: toString().\n");
     
     System.out.println(payroll.toString());
     
     /******************************************************************
     
           Test 7: 
	   
	           test getEmployee from a populated database.
          
      ******************************************************************/
    
     System.out.println("\nTest 7: getEmployee from a populated database.\n");     
     
     location = 2;
     
     testEmployee = payroll.getEmployee(location);
     
     if(testEmployee != null)
       System.out.println("Record returned\n\n" + testEmployee.toString() + "\n");
     else
       System.out.println("\nNo employemwnt records found.\n");
       

     /******************************************************************
     
           Test 8: 
	   
	           test removeEmployee from a populated database.
          
      ******************************************************************/
    
     System.out.println("\nTest 8: removeEmployee from a populated database.\n");         
     
     if(payroll.removeEmployee("100-39-9101"))
       System.out.println("Former Boss removed\n");
     else
       System.out.println("\nNo employemwnt records found.\n");  
       
     /******************************************************************
     
           Test 9: 
	   
	           test display database after record removed.
          
      ******************************************************************/
    
     System.out.println("\nTest 9: display database after record removed.\n");  
       
     System.out.println(payroll.toString());
    
     /******************************************************************
     
           Test 10: 
	   
	           test totalPayroll.
          
      ******************************************************************/
    
     System.out.println("\nTest 10: test totalPayroll.\n");  
    
     System.out.println("The total payroll is " + money.format(payroll.totalPayroll()) + "\n");
     
     
     /******************************************************************
     
           Test 11: 
	   
	           test sortEmployee.
          
      ******************************************************************/
     
     payroll.sortEmployees();
     
     System.out.println("\nTest 11: display sorted database.\n");  
       
     System.out.println(payroll.toString());
     
     
     
  } //end main   
     
     
} // Payroll