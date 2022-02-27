/**
Description:   Address class that holds data for a address called Address.
     
  Programmer:    Awwal Ahmed
        Date:    October 28, 2021    
    Modified:    November 1, 2021
*/

public class Address
{
	private String street;				// The location's street address
	private String city;				// The location's city
	private String state;				// The location's state
	private String zipCode;				// The location's zip code
	

	// 	CONSTRUCTORS
		
		public Address()
		{
			setStreet("Somewhere Street");
			setCity("Somewhere City");
			setState("Somewhere State");
			setZipCode("00000");
			
		} 
	/**
		@param sAddress the location's street address
			   newCity the location's city
			   newState the location's state
			   newCode the location's zipcode
	*/
		public Address(String sAddress, String newCity, String newState, String newCode)
		{
			setStreet(sAddress);
			setCity(newCity);
			setState(newState);
			setZipCode(newCode);
	
		}
		
	/**
		copy constructor.
		@param location the new location.
	*/
		public Address(Address location)
		{
			setStreet(location.getStreet());
			setCity(location.getCity());
			setState(location.getState());
			setZipCode(location.getZipCode());
			
		}
		
	
	// METHODS
	
	/**
		Assigns the location's street address.
		@param sAddress the location's street address.
	*/
		public void setStreet(String sAddress)
		{
			street = sAddress;
			
		} // setStreet End
		
	/**
		Assigns the location's city.
		@param newCity the location's city.
	*/
		public void setCity(String newCity)
		{
			city = newCity;
			
		} // setCity End
		
	/**
		Assigns the location's state.
		@param newState the location's state.
	*/
		public void setState(String newState)
		{
			state = newState;
			
		} // setState End
		
	/**
		Assigns the location's zip code.
		@param newZipCode the location's zip code.
	*/
		public void setZipCode(String newZipCode)
		throws IllegalArgumentException
		{
			if (isValid(newZipCode))
			{
				zipCode = newZipCode;
			}
			else
			{
				throw new IllegalArgumentException("Invalid Zip Code");
			}
			
		} // setZipCode End
		
		private boolean isValid(String pCode)  		// Checks for a valid zip code format.
		{
			boolean valid = true;
			int position = 0;
    
			if (pCode.length() != 5) 
			{
				valid = false;
			}
			else  
			{
				while(valid && position < pCode.length())
				{
					valid = Character.isDigit(pCode.charAt(position));
					position++;
				}
			}
			return valid;
			
		} // isValid End
		
	/**
		Provides the location's street address.
		@return the location's street address.
	*/
		public String getStreet()
		{
			return street;
			
		} // getStreet End
		
	/**
		Provides the location's city.
		@return the location's city.
	*/
		public String getCity()
		{
			return city;
			
		} // getCity End
		
	/**
		Provides the location's state.
		@return the location's state.
	*/
		public String getState()
		{
			return state;
			
		} // getState End
		
	/**
		Provides the location's zipcode.
		@return the location's zipcode.
	*/
		public String getZipCode()
		{
			return zipCode;
			
		} // getZipCode End
		
	/**
		Produces the Address.
		@return the address.
	*/
		public String toString()
		{
			String record = "Street:         " + street + "\n" +
							"City:           " + city + "\n" +
							"State:          " + state + "\n" +
							"Zip Code:       " + zipCode + "\n";
			return record;
		
		} // toString End
		
} // Program End