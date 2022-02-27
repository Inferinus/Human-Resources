/**
     Description: The definition of the Dat class.
     
     Author: William Crum
       
     Date: October 2, 2020
*/

public class Dat
{   
  private int day;     // the day part of the date
  private int month;   // the month part of the date
  private int year;    // the year part of the date
  
  /**
      default constructor
  */
  public Dat ()
  {
    setDate(1, 1, 1900);
  }
	
  /**
    Constructor

   @param  dy  the new day
   @param  mon the new month
   @param  yr  the new year
  */

  public Dat (int dy, int mon, int yr)
  {
    setDate(dy,mon, yr);
  }  
  
  /**
    Copy Constructor

   @param  date the new date 
  */

  public Dat (Dat date)
  {
    setDate(date.getDay(),date.getMonth(), date.getYear());
  }  
   
  /**
   Provides the day.
   
   @return  the day in the date.
  */
  public int getDay()
  {
    return day;
  }
     
  /**
   Provides the month.
   
   @return  the month in the date.
  */
  public int getMonth()
  {
    return month;
  }

   /**
   Provides the year.
   
   @return  the year in the date.
  */
  public int getYear()
  {
    return year;
  }

  /**
   Provides the date as a string.

   @return  the date
  */
 
  public String toString()
  {
    String monthName = "";

    switch(month)
    {
      case 1:
             monthName = "January";
	     break;

      case 2:
             monthName = "February";
	     break;

      case 3:
             monthName = "March";
	     break;

      case 4:
             monthName = "April";
	     break;

      case 5:
             monthName = "May";
	     break;

      case 6:
             monthName = "June";
	     break;

      case 7:
             monthName = "July";
	     break;

      case 8:
             monthName = "August";
	     break;

      case 9:
             monthName = "September";
	     break;

      case 10:
             monthName = "October";
	     break;

      case 11:
             monthName = "November";
	     break;

      case 12:
             monthName = "December";
	     break;

    }

    return monthName + " " + day + ", " + year;
  }



  /**
   Assigns values to day, month, and year.
   
   @param  dy  the new day
   @param  mon the new month
   @param  yr  the new year
  */
  public void setDate(int dy, int mon, int yr)
  {
    setMonth(mon);
    setYear(yr);
    setDay(dy);
  }

  /**
   Assigns the day to the date.
   
   For months 4, 6, 9, and 11, day must be between 1 and 30, inclusive.
   
   For month 2 on a non-leap year, day must be between 1 and 28, inclusive.
   
   For month 2 on a leap year, day must be between 1 and 29, inclusive.
   
   For all other months, day must be between 1 and 31, inclusive.
   
   @param  dy  the new day
  */

  public void setDay(int dy)  
  		       throws IllegalArgumentException
  {
    boolean valid; //true for valid day number
                   //false otherwise
    
    switch (month)
    {
     case 4: case 6: case 9: case 11:

       valid = dy >= 1 && dy <= 30;
       
       if (valid)      

          day = dy;
        
       else
    
         throw new IllegalArgumentException("Day must be between 1 and 30, inclusive.");
       
       break;

     case 2:

       if (leapYear())
          {
            valid = dy >= 1 && dy <= 29;
            
            if (valid)      

               day = dy;
        
            else
    
              throw new IllegalArgumentException("Day must be between 1 and 29, inclusive.");
	      }
       else
          {
            valid = dy >= 1 && dy <= 28;
            
            if (valid)      

               day = dy;
        
            else
    
              throw new IllegalArgumentException("Day must be between 1 and 28, inclusive.");
	      }
       break;

     default:
     
       valid = dy >= 1 && dy <= 31;
       
       if (valid)      

          day = dy;
        
       else
    
         throw new IllegalArgumentException("Day must be between 1 and 31, inclusive.");
         
       break;
     }
  }

   /**
    Assigns the month to the date.
    
    Months must be between 1 and 12, inclusive.
    
    @param  mon  the new month
  */

  public void setMonth(int mon)  
  		       throws IllegalArgumentException
  {
    boolean valid; //true for valid month number
                   //false otherwise

       valid = mon >= 1 && mon <= 12;
       
       if (valid)      

           month = mon;
        
       else
    
         throw new IllegalArgumentException("Months must be between 1 and 12, inclusive.");
  }

  /**
   Assigns the year to the date.
   
   Years must be greater than or equal to 1.
   
   @param  yr  the new year
  */

  public void setYear(int yr)  
  		       throws IllegalArgumentException
  {
    boolean valid; //true for non-negative year number
                   //false otherwise

       valid = yr > 1;
       
       if (valid)      

           year = yr;
        
       else
    
         throw new IllegalArgumentException("Years must be greater than or equal to 1.");
  }


  /**
   Adds one day to the date.
  */
             
  public void nextDay()
  {       
    day++;

    switch (month)
    {
     case 4: case 6: case 9: case 11:

       if (day > 30)
        {
	  day = 1;
          month++;
	}
	break;

     case 2:

       if (leapYear())
           {
	   if (day > 29)
           {
	    day = 1;
            month++;
	   }
	   }
        else
	   {
	   if (day > 28)
           {
	     day = 1;
             month++;
	   }
	   }
	break;

     default:

         if (day > 31)
             {
	      day = 1;
              month++;
	     }
	 break;

     }

     if (month > 12)
         {
	  month = 1;
	  year++;
	 }
  }
  /**
   Determines if the year is a leap year.

   @return  true,  for a leap year; false, otherwise
  */

  private boolean leapYear()
  {
  return ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0));
  }

} // Dat