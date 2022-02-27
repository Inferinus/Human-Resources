/**
Description:   Hourly class thats a child class of the Employee class.
     
  Programmer:    Awwal Ahmed
        Date:    November 16, 2021    
    Modified:    November 16, 2021
*/

import java.text.NumberFormat;
import java.util.Locale;

public class Hourly
				extends Employee
{
	private String classification;		// the employee's classification (Full-Time or Part-Time)
	private int hours;					// the employee's hours worked for the week
	private double wage;				// the employee's hourly wage
	
	
	// CONSTRUCTORS
	
	/** Default Constructor */
		public Hourly()
		{
			super();
			setClassification("");
			setHours(0);
			setWage(0.0);
			
		} // default constructor end.

	/**
		@param basicRec - the employee's basic record.the employee's telephone number
			   mail - the employee's e-mail address.
			   phone - the employee's telephone number.
			   eID - the employee's identification number.
			   hClass - the employee's classification (Full-Time or Part-Time).
			   wHours - the employee's hours worked for the week
			   hPay - the employee's hourly wage.
	*/
		public Hourly(Person basicRec, String newSocSec, String mail, String phone, String eID, String hClass, int wHours, double hPay)
		{
			super(basicRec, newSocSec, mail, phone, eID);
			setClassification(hClass);
			setHours(wHours);
			setWage(hPay);
		}
	
	// METHODS
	
	/**
		Provides the employee's classification (Full-Time or Part-Time).
		@return  the employee's classification (Full-Time or Part-Time).
	*/
		public String getClassification()
		{
			return classification;
			
		} // getClassification End.
		
	/**
		Provides the employee's hours worked for the week.
		@return the employee's hours worked for the week.
	*/ 
		public int getHours()
		{
			return hours;
			
		} // getHours End.
		
	/**
		Provides the employee's hourly wage.
		@return the employee's hourly wage.
	*/
		public double getWage()
		{
			return wage;
			
		} // getWage End.
		
	/**
		Assigns the the employee's classification (Full-Time or Part-Time).
		@param hClass - the the employee's classification (Full-Time or Part-Time).
	*/
		public void setClassification(String hClass)
		{
			classification = hClass;
			
		} // setClassification End.
		
	/** 
		Assigns the employee's hours worked for the week.
		@param wHours - the employee's hours worked for the week.
	*/ 
		public void setHours(int wHours)
		throws java.lang.IllegalArgumentException
		{
			boolean valid = wHours >= 0 && wHours <= 80;						// Tests for valid if bPay is >= 0 and <= 80. 
			
			if (valid)
			{	
				hours = wHours;
			}
			else {
				throw new IllegalArgumentException("Hours must be greater than 0 and less than 80, inclusive.");
			}
		} // setHours End.
		
	/** 
		Assigns the employee's hourly wage.
		@param hPay - the employee's hourly wage.
	*/ 
		public void setWage(double hPay)
		throws java.lang.IllegalArgumentException
		{
			boolean valid = hPay >= 0;						// Tests for valid if hPay is >= 0.
			
			if (valid)
			{	
				wage = hPay;
			}
			else {
				throw new IllegalArgumentException("Wage must be greater than or equal to 0.");
			}
		} // setWage End.
		
	/**
		Provides sales employee record.
		@return sales employee record.
	*/
		public String toString()
		{
			NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);
			
			String record = super.toString() + 
							"Hourly Classification:  " + classification + "\n" +
							"Hours:          " + hours + "\n" +
							"Hourly Wage:    " + money.format(wage) + "\n";
			
			return record;
		} // toString End
		
	/**
		Computes the sales employee's pay check for the current pay period.
		@return the sales employee's pay check for the current pay period.
	*/
		public double payCheck()
		{
			double overtime = 0;
			double check = 0; 
			
			if (hours > 40)
			{
				overtime = (hours - 40) * (wage * 1.5);
				check = wage * 40 + overtime;
			}
			if (hours <= 40)
			{
				overtime = 0;
				check = wage * hours;
			}
			
			return check;
		} // payCheck End.
		
} // Hourly End.