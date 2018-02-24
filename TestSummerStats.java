/*
* Course: CS 1302
* Name: Parth Patel
*/

import java.text.NumberFormat;
import java.util.*;

public class TestSummerStats {
    
    public static void main(String[] args) {
        

        NumberFormat mon = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        
        
        //Asking the user for the number of people and years
        System.out.println("Please enter the number of people: ");
        int numPeople = input.nextInt();
        
        System.out.println("Please enter the number of years worked: ");
        int numYears = input.nextInt();
        
        
       //Creating the instance
        SummerStats jobs = new SummerStats(numPeople, numYears);
        
        
        //Testing all methods by printing out the outputs from the methods
        System.out.println("Index of person who made most money over the years: " + jobs.getMostMoneyIndex());
        System.out.println();
        System.out.println("Index of the year when the highest salary was earned: " + jobs.getHeighestSalaryIndex());
        System.out.println();
        System.out.println("Total amount of money made by a person: " + mon.format(jobs.getTotalPerson(2)));
        System.out.println();
        System.out.println("Total amount of money made by everyone over the years: " + mon.format(jobs.getTotalAllPeople()));
        System.out.println();
        System.out.println("Index of the person who made the highest salary in a given year: " + jobs.getIndPersonHeighestSalary(2)); 
        System.out.println();
        
       double avg[] = jobs.getAverageSalary();
       
       System.out.println("Here is the average salary for each year: ");
       
       //Loop that finds the average for each year and prints the data
       for ( int i = 0 ;i < avg.length; i++) {
          
           System.out.println(mon.format(avg[i]));
          
       }
        
        
        
      
        
        
        
    }
    
}
