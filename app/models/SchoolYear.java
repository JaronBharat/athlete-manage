package models;

import java.time.LocalDateTime;


public class SchoolYear {
  static LocalDateTime date;  
  
      
    public static LocalDateTime currentSchoolYear() {
      LocalDateTime schoolYear = LocalDateTime.of(LocalDateTime.now().getYear(), 9, 1, 0, 0);
      
      if (LocalDateTime.now().getMonthValue() < 8) {
        schoolYear = schoolYear.minusYears(1);
      }
      
      return schoolYear;
    }
    
  
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
