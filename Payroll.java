/**
Description:   Payroll class that holds data for a collection of Employee objects.
     
  Programmer:    Awwal Ahmed
        Date:    December 1, 2021    
    Modified:    December 1, 2021
*/

import java.util.ArrayList;
import java.text.NumberFormat;

public class Payroll
{
	private ArrayList<Employee> employees;
	
	
	// CONSTRUCTORS
	
	/** Default Constructor */
		public Payroll()
		{
			employees = new ArrayList<Employee>();				// the employees in the database.
			
		}
		

	// METHODS
	
	/**
		Adds a employee to the database.
		@param newEmployee - the new employee.
		@return true, if new employee added;
				false, if already in the database.
	*/
		public boolean addEmployee(Employee newEmployee)
		{
			boolean added = true;
			
			if (employees.contains(newEmployee))
			{
				added = false;
			}
			else {
				employees.add(newEmployee);
			}
			
			return added;
		
		} // addEmployee End.
		
	/**
		Removes the employee matching the target social security number.
		@param target - the the target social security number.
		@return true, if employee removed;
				false, if not in the database.
	*/
		public boolean removeEmployee(String target)
		{
			boolean removed = true; 		// true, if employee removed
											// false, if not in the list.
			Employee employee;    			// the target employee
    
			employee = searchBySocialSecurity(target);
    
			if (employee == null)
			{
				removed = false;
			}
			else {
				
				employees.remove(employees.indexOf(employee));
			}
			
			return removed;
			
		} // removeEmployee End.
		
	/**
		Removes all employees from the database
	*/
		public void clearEmployees()
		{
			employees.clear();
			
		} // clearEmployees End.
		
	/**
		Determines if the employee is in the database.
		@param target - the employee targeted in the search.
		@return true, if found;
				false, otherwise.
	*/
		public boolean containsEmployee(Employee target)
		{
			return employees.contains(target);
			
		} // containsEmployee End.
		
	/**
		Retruns a employee from the database.
		@param location - the location of the employee in the database.
		@return a employee record from the database.
	*/
		public Employee getEmployee(int location)
		{
			Employee employee; 
			
			if (employees.isEmpty() || location < 0 || location >= employees.size())
			{
				employee = null;
			}
			else 
			{
				employee = employees.get(location);
			}
			
			return employee;
			
		} // getEmployee End.
		
	/**
		Provides the location of the employee in the database.
		@param target - the employee targeted in the search.
		@return the location of the employee or -1 if not found.
	*/
		public int indexOfEmployee(Employee target)
		{
			return employees.indexOf(target);
			
		} // indexOfEmployee End.
		
	/**
		Tests for an empty database.
		@return true, if the database is empty;
				false, otherwise.
	*/
		public boolean noEmployees()
		{
			return employees.isEmpty();
			
		} // noEmployees End.
		
	/**
		Provides the number of employees.
		@return the number of employees.
	*/
		public int numberOfEmployees()
		{
			return employees.size();
			
		} // numberOfEmployees End.
		
	/**
		Provides a report containing all employees.
		@returns a report containing all employees.
	*/
		public String toString()
		{
			String record = "";
			
			for (Employee employee : employees)
			{
				record += employee.toString() + "\n\n";
			}
			return record;
			
		} // toString End.
		
	/**
		Provides the total payroll for all employees.
		@returns the total payroll for all employees.
	*/
		public double totalPayroll()
		{
			int totalProfit = 0;
			
			for (Employee employee : employees)
			{
				totalProfit += employee.payCheck();
			}
			return totalProfit;
			
		} // totalPayroll End.
		
	/**
		Provides the record matching the target social security number.
		@returns the record matching the target social security number.
	*/
		public Employee searchBySocialSecurity(String target)
		{
			Employee search = null;
			
				for (Employee employee : employees)
				{
					if (target.equals(employee.getSocialSecurity()))
					{
						search = employee;
					}
				}
				
				return search;
			
		} // searchBySocialSecurity End.
		
	/**
		Produces a database ordered by employee ID number.
	*/
		public void sortEmployees()
		{
			Employee compared;              // used to hold the record to be compared.
			Employee shifted;               // used to hold the record to be shifted.
			int  location;                  // the current location in the ArrayList
			int  total = employees.size();  // the total number of elements in the ArrayList
      
			for (int  element = 1; element < total; element++)
				{
				compared = (Employee) employees.get(element);
            
				location = element;
            
				while( location > 0 && compared.compareTo((Employee) employees.get(location - 1)) < 0)
				{
					shifted = (Employee) employees.remove(location - 1);
					employees.add(location,shifted);
					location--;
				}

				employees.remove(location);
				employees.add(location, compared);            
				}
			
		} // sortEmployees End.
		

} // Program End