/**
Description:   Employee class thats a child class of the Person class.
     
  Programmer:    Awwal Ahmed
        Date:    November 16, 2021    
    Modified:    November 16, 2021
*/

abstract public class Employee
				extends Person
				implements Comparable
{
	private String socialSecurity;				// the employee's social security number
	private String email;						// the employee's e-mail address.
	private String telephone;					// the employee's telephone number.
	private String employeeID;							// the employee's identification number.
	

	// 	CONSTRUCTORS	
	
	/** Default Constructor */
		public Employee()
		{
			setSocialSecurity("000-00-0000");
			setEmail("");
			setTelephone("");
			setEmployeeID("");
			
		} // default constructor end.
		
	/**
		@param basicRec - the employee's basic record.
			   newSocSec - the person's social security number.
			   mail - the employee's e-mail address.
			   phone - the employee's telephone number.
			   eID - the employee's identification number.
	*/
		public Employee(Person basicRec, String newSocSec, String mail, String phone, String eID)
		{
			super(basicRec);
			setSocialSecurity(newSocSec);
			setEmail(mail);
			setTelephone(phone);
			setEmployeeID(eID);
		
		}
		
		
	// METHODS

	/**
		Provides the employee's e-mail address.
		@return the employee's e-mail address.
	*/
		public String getEmail()
		{
			return email;
			
		} // getEmail End.
		
	/**
		Provides the employee's social security number.
		@return the employee's social security number.
	*/
		public String getSocialSecurity()
		{
			return socialSecurity;
			
		} // getSocialSecurity End.
		
	/**
		Provides the employee's telephone number.
		@return the employee's telephone number.
	*/
		public String getTelephone()
		{
			return telephone;
			
		} // getTelephone End.
		
	/**
		Provides the employee's identification number.
		@return the employee's identification number.
	*/
		public String getEmployeeID()
		{
			return employeeID;
			
		} // getEmployeeID End.
		
	/**
		Assigns the employee's e-mail address.
		@param mail - the employee's e-mail address.
	*/
		public void setEmail(String mail)
		{
			email = mail;
			
		} // setEmail End.
		
	/**
		Assigns the employee's social security number.
		@param newSocSec - the employee's social security number.
	*/
		public void setSocialSecurity(String newSocSec)
		throws java.lang.IllegalArgumentException
		{
			if (isValid(newSocSec))
			{
				socialSecurity = newSocSec;
			}
			else
			{
				throw new IllegalArgumentException("Invalid Social Security Number");
			}
			
		} // setSocialSecurity End.
		
		private boolean isValid(String sNumber)
		{
			boolean valid = true;
			int position = 0;
			
			if (sNumber.length() != 11)
			{
				valid = false;
			}
			else 
			{
				while(valid && position < sNumber.length())
				{
					if(position == 3 || position == 6)
					{
						valid = sNumber.charAt(position) == '-';
					}
					else
					{
						valid = Character.isDigit(sNumber.charAt(position));
					}
					position++;
				}
			}
			return valid;
		} // isValid End.
		
	/**
		Assigns the employee's telephone number.
		@param phone - the employee's telephone number.
	*/
		public void setTelephone(String phone)
		{
			telephone = phone;
			
		} // setTelephone End.
		
	/**
		Assigns the employee's identification number.
		@param eID - the employee's identification number.
	*/
		public void setEmployeeID(String eID)
		{
			employeeID = eID;
			
		} // setEmployeeID End.
		
	/**
		Provides basic employee record.
		@return basic employee record.
	*/
		public String toString()
		{
			String record = super.toString() + 
							"Social Security:        " + socialSecurity + "\n" +
							"E-Mail Address:         " + email + "\n" +
							"Telephone Number:       " + telephone + "\n" +
							"Employee Identification Number: " + employeeID + "\n";
			
			return record;
			
		} // toString End.
		
	/**
		Determines if two employees are the same based on employee's identification number.
		@param employee2 - the second employee in the comparison.
		@return true, when this employee is same as employee2.
				false, otherwise.
	*/
		public boolean equals(Object employee2)
		{
			Employee employee = (Employee) employee2;
			
			return employeeID.equals(employee.getEmployeeID());
			
		} // Equals End.
		
	/**
		Determins order of the employees based on employee's identification number.
		@param employee2 the second employee in the comparison.
		@return value < 0 when this employee comes before employee.
				0 when this employee is same as employee.
				value > 0 when the employee comes after employee.
	*/
		public int compareTo(Object employee2)
		{
			
			Employee employee = (Employee) employee2;
			
			return employeeID.compareTo(employee.getEmployeeID());
			
		} // compareTo End.
		
	/**
		Computes the employee's pay check for the current pay period.
		@return the employee's pay check for the current pay period.
	*/
		public abstract double payCheck();
		
} // Program End