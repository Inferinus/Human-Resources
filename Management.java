/**
Description:   Management class thats a child class of the Employee class.
     
  Programmer:    Awwal Ahmed
        Date:    November 16, 2021    
    Modified:    November 16, 2021
*/

import java.text.NumberFormat;
import java.util.Locale;

public class Management
				extends Employee
{
	private String title;			// the employee's job title
	private double salary;			// the employee's bi-weekly salary
	private double bonus;			// the employee's bi-weekly bonus
	
	
	// CONSTRUCTORS
	
	/** Default Constructor */
		public Management()
		{
			super();
			setTitle("");
			setSalary(0.0);
			setBonus(0.0);
			
		} // default constructor end.
		
	/**
		param basicRec - the employee's basic record.
			  mail - the employee's e-mail address.
		 	  phone - the employee's telephone number.
			  eID - the employee's identification number.
			  job - the employee's job title.
			  pay - the employee's bi-weekly salary
			  extra - the employee's bi-weekly bonus.
	*/
		public Management(Person basicRec, String newSocSec, String mail, String phone, String eID, String job, double pay, double extra)
		{
			super(basicRec, newSocSec, mail, phone, eID);
			setTitle(job);
			setSalary(pay);
			setBonus(extra);
		
		}
	
	
	// METHODS
	
	/**
		Provides the employee's job title.
		@return the employee's job title.
	*/
		public String getTitle()
		{
			return title;
			
		} // getTitle End.
		
	/**
		Provides the employee's bi-weekly salary.
		@return the employee's bi-weekly salary.
	*/
		public double getSalary()
		{
			return salary;
			
		} // getSalary End.
		
	/**
		Provides the employee's bi-weekly bonus.
		@return the employee's bi-weekly bonus.
	*/ 
		public double getBonus()
		{
			return bonus;
			
		} // getBonus End.
		
	/**
		Assigns the the employee's job title.
		@param job - the the employee's job title.
	*/
		public void setTitle(String job)
		{
			title = job;
			
		} // setTitle End.
		
	/** 
		Assigns the employee's bi-weekly salary.
		@param pay - the employee's bi-weekly salary.
	*/ 
		public void setSalary(double pay)
		throws java.lang.IllegalArgumentException
		{
			boolean valid = pay >= 0;						// Tests for valid if pay is >= 0. 
			
			if (valid)
			{	
				salary = pay;
			}
			else {
				throw new IllegalArgumentException("Salary must be greater than or equal to 0.");
			}
		} // setSalary End.
		
	/** 
		Assigns the employee's bi-weekly bonus.
		@param extra - the employee's bi-weekly bonus.
	*/ 
		public void setBonus(double extra)
		throws java.lang.IllegalArgumentException
		{
			boolean valid = extra >= 0;						// Tests for valid if extra is >= 0. 
			
			if (valid)
			{	
				bonus = extra;
			}
			else {
				throw new IllegalArgumentException("Bonus must be greater than or equal to 0.");
			}
		} // setBonus End.
		
	/**
		Provides management employee record.
		@return management employee record.
	*/
		public String toString()
		{
			NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);
			
			String record = super.toString() + 
							"Title:  " + title + "\n" +
							"Salary: " + money.format(salary) + "\n" +
							"Bonus:  " + money.format(bonus) + "\n";
							
			return record;
			
		} // toString End.
		
	/**
		Computes the management employee's pay check for the current pay period.
		@return the management employee's pay check for the current pay period.
	*/
		public double payCheck()
		{
			return salary + bonus;
			
		} // payCheck End.
		
} // Management End.