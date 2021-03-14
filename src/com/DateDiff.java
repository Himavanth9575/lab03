package com;

import java.time.*;

public class DateDiff {  
   public static void main(String[] args) {
	   LocalDate pdate = LocalDate.of(2012, 12, 06);
	   LocalDate now = LocalDate.now();
	   Period diff = Period.between(pdate, now);
	   System.out.printf("\nDifference is %d years, %d months and %d days\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
  }
}

