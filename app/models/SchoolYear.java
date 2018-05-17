package models;

import java.time.LocalDateTime;

/**
* a helper class that contains methods that return the specified school year
* @author victor portia grace jaron farbod
* 
**/
public class SchoolYear {
  static LocalDateTime date;  
  
    /**
    * a method that returns the LocalDateTime of the start of the school year
    * @return schoolYear
    *            LocalDateTime of the start of schoolyear
    **/
    public static LocalDateTime currentSchoolYear() {
      LocalDateTime schoolYear = LocalDateTime.of(LocalDateTime.now().getYear(), 9, 1, 0, 0);
      
      if (LocalDateTime.now().getMonthValue() < 8) {
        schoolYear = schoolYear.minusYears(1);
      }
      
      return schoolYear;
    }
    
    /**
    * A method that returns the LocalDateTime of the year given a string of the first year
    * @param year
    *          the string of the first year
    * @return LocalDateTime of the start of school year
    **/
    public static LocalDateTime toSchoolYear(String year) {
      int firstYear = Integer.parseInt(year.substring(0,3));
      return LocalDateTime.of(firstYear, 9, 1, 0, 0);
    }
  
    public static LocalDateTime toSchoolYear(LocalDateTime date) {
      LocalDateTime schoolYear = date;
      if(schoolYear.getMonthValue() < 8) {
        schoolYear.minusYears(1);
      } 
      return LocalDateTime.of(schoolYear.getYear(), 9, 1, 0, 0);
    }
  
  
}
