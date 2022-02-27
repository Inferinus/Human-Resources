/**
Description:   Person class that holds data for a person called Person.
     
  Programmer:    Awwal Ahmed
        Date:    October 29, 2021    
    Modified:    November 1, 2021
*/

public class Person
{
	private String firstName;					// The person's first name.
	private String lastName;					// The person's last name.
	private Dat birthDate;						// The person's birthday.
	private Address address;					// The person's address.
	

	// 	CONSTRUCTORS
		
		public Person()
		{
			setFirstName("John");
			setLastName("Doe");
			setBirthDate(new Dat());
			setAddress(new Address());
		
		}
		
	/**
		@param fName the person's first name
			   lName the person's last name
			   bDate the person's birthday
			   location the person's address
	*/
		public Person (String fName, String lName, Dat bDate, Address location)
		{
			setFirstName(fName);
			setLastName(lName);
			birthDate = new Dat(bDate);
			address = new Address(location);
			
		}
		
	/**
		copy constructor
		@param
	*/
		public Person(Person profile)
		{
			setFirstName(profile.getFirstName());
			setLastName(profile.getLastName());
			setBirthDate(profile.getBirthDate());
			setAddress(profile.getAddress());
			
		} // Copy Constructor End.
		
		
	// METHODS
	
	/**
		Assigns the person's first name.
		@param lName the person's first name.
	*/
		public void setFirstName(String fName)
		{
			firstName = fName;
			
		} // setFirstName End.
		
	/**
		Assigns the person's last name.
		@param lName the person's last name.
	*/
		public void setLastName(String lName)
		{
			lastName = lName;
			
		} // setLastName End.
		
	/**
		Assigns the person's birth date.
		@param bDate the person's birthdate.
	*/
		public void setBirthDate(Dat bDate)
		{
			birthDate = new Dat(bDate);
			
		} // setBirthDate End.
		
	/**
		Assigns the person's street address.
		@param the person's street address.
	*/
		public void setStreet(String sAddress)
		{
			address.setStreet(sAddress);
			
		} // setStreet End.
		
	/**
		Assigns the person's city.
		@param the person's city.
	*/
		public void setCity(String newCity)
		{
			address.setCity(newCity);
			
		} // setCity End.

	/**
		Assigns the person's state.
		@param the person's state.
	*/
		public void setState(String newState)
		{
			address.setState(newState);
			
		} // setState End.
	
	/**
		Assigns the person's zip code.
		@param the person's zip code.
	*/
		public void setZipCode(String newCode)
		{
			address.setZipCode(newCode);
			
		} // setZipCode End.
		
	/**
		Assigns the person's address.
		@param the person's address.
	*/
		public void setAddress(Address location)
		{
			address = new Address(location);
			
		} // setAddress End.
		
	/**
		Provides the person's first name.
		@return the person's first name.
	*/
		public String getFirstName()
		{
			return firstName;
			
		} //getFirstName End.
		
	/**
		Provides the person's last name.
		@return the person's last name.
	*/
		public String getLastName()
		{
			return lastName;
			
		} //getLastName End.
		
	/**
		Provides the person's birth date.
		@return the person's birth date.
	*/
		public Dat getBirthDate()
		{
			return birthDate;
			
		} // getBirthDate End.
		
	/**
		Provides the person's street address.
		@return the person's street address.
	*/
		public String getStreet()
		{
			return address.getStreet();
			
		} // getStreet End.
		
	/**
		Provides the person's city.
		@return the person's city.
	*/
		public String getCity()
		{
			return address.getCity();
			
		} // getCity End.
		
	/**
		Provides the person's state.
		@return the person's state.
	*/
		public String getState()
		{
			return address.getState();
			
		} // getState End.
	
	/**
		Provides the person's zip code.
		@return the person's zip code.
	*/
		public String getZipCode()
		{
			return address.getZipCode();
			
		} // getZipCode End.
		
	/**
		Provides the person's address.
		@return the person's address.
	*/
		public Address getAddress()
		{
			return address;

		} // getAddress End.
		
	/**
		Produces the person's profile.
		@returns the person's profile.
	*/
		public String toString()
		{
			String profile = "First Name:     " + firstName + "\n" +
							 "Last Name:      " + lastName + "\n" +
							 "Birth Date:     " + birthDate + "\n" +
							 address.toString();
			return profile;
			
		} // toString End.


} // Program End