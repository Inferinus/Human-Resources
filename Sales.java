/**
Description:   Sales class thats a child class of the Employee class.
     
  Programmer:    Awwal Ahmed
        Date:    November 16, 2021    
    Modified:    November 16, 2021
*/

import java.text.NumberFormat;
import java.util.Locale;

public class Sales
				extends Employee
{
	private String division;			// the employee's sales division (Wholesale, Retail, or Consumer)
	private double sales;				// the employee's bi-weekly sales
	private double base;				// the employee's bi-weekly base pay
	
	
	// CONSTRUCTORS
	
	/** Default Constructor */
		public Sales()
		{
			super();
			setDivision("");
			setSales(0.0);
			setBasePay(0.0);
			
		} // default constructor end.
		
	/**
		@param basicRec - the employee's basic record.the employee's telephone number
			   mail - the employee's e-mail address.
			   phone - the employee's telephone number.
			   eID - the employee's identification number.
			   sDivision - the employee's sales division.
			   bwSales - the employee's bi-weekly sales
			   bPay - the employee's bi-weekly base pay.
	*/
		public Sales(Person basicRec, String newSocSec, String mail, String phone, String eID, String sDivision, double bwSales, double bPay)
		{
			super(basicRec, newSocSec, mail, phone, eID);
			setDivision(sDivision);
			setSales(bwSales);
			setBasePay(bPay);
			
		}

	
	// METHODS
	
	/**
		Provides the employee's sales division.
		@return the employee's sales division.
	*/
		public String getDivision()
		{
			return division;
			
		} // getDivision End.
		
	/**
		Provides the employee's bi-weekly sales.
		@return the employee's bi-weekly sales.
	*/
		public double getSales()
		{
			return sales;
			
		} // getSales End.
		
	/**
		Provides the employee's bi-weekly base pay.
		@return the employee's bi-weekly base pay.
	*/
		public double getBasePay()
		{
			return base;
			
		} // getBasePay End.
		
	/**
		Assigns the the employee's sales division (Wholesale, Retail, or Consumer).
		@param sDivision - the the employee's sales division (Wholesale, Retail, or Consumer).
	*/
		public void setDivision(String sDivision)
		{
			division = sDivision;
			
		} // setDivision End.
		
	/** 
		Assigns the employee's bi-weekly sales.
		@param bwSales - the employee's bi-weekly sales.
	*/ 
		public void setSales(double bwSales)
		throws java.lang.IllegalArgumentException
		{
			boolean valid = bwSales >= 0;						// Tests for valid if bsSales is >= 0. 
			
			if (valid)
			{	
				sales = bwSales;
			}
			else {
				throw new IllegalArgumentException("Sales must be greater than or equal to 0.");
			}
		} // setSalary End.
		
	/** 
		Assigns the employee's bi-weekly base.
		@param pay - the employee's bi-weekly base.
	*/ 
		public void setBasePay(double bPay)
		throws java.lang.IllegalArgumentException
		{
			boolean valid = bPay >= 0;						// Tests for valid if bPay is >= 0. 
			
			if (valid)
			{	
				base = bPay;
			}
			else {
				throw new IllegalArgumentException("Base pay must be greater than or equal to 0.");
			}
		} // setSalary End.
		
	/**
		Provides sales employee record.
		@return sales employee record.
	*/
		public String toString()
		{
			NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);
			
			String record = super.toString() + 
							"Sales Division: " + division + "\n" + 
							"Sales:          " + money.format(sales) + "\n" + 
							"Base Pay:       " + money.format(base) + "\n";
			
			return record;
		} // toString End
		
	/**
		Computes the sales employee's pay check for the current pay period.
		@return the sales employee's pay check for the current pay period.
	*/
		public double payCheck()
		{
			double commission = 0;
			
			if (sales < 30000) 
			{
				commission = sales * 0.01;
			}
			if (sales >= 30000 && sales <= 50000)
			{
				commission = sales * 0.015;
			}
			if (sales > 50000)
			{
				commission = sales * 0.04;
			}
			
			return base + commission;
				
		} // payCheck End.
		
} // Sales End.