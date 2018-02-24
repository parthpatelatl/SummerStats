/*
* Course: CS 1302
* Name: Parth Patel
*/

import java.text.NumberFormat;
import java.util.Random;

public class SummerStats {
    
    //Creating the 2D array
    private double [][] salaries;
    
    private int numPeople;
    private int numYears;
    
    
    //Constructor
    public SummerStats(int numPeople, int numYears) {
     
      this.numPeople = numPeople;
      this.numYears = numYears;
        
      salaries = new double[numPeople][numYears];

      //Filling the array with random values
      Random random = new java.util.Random();
      
      for (int i = 0; i < numPeople; i++) 
      {
          for (int j = 0; j < numYears; j++)
          {
            salaries[i][j] = random.nextInt(50000);
          } 
      }
   }
    
    //A method of the index of the person having made the most money over the years
    public int getMostMoneyIndex() {
        
       int ind = -1;
       
       double max = salaries[0][0];
       
       for(int i = 0; i < numPeople; i++) {
           for(int j = 0; j < numYears; j++)
           {
               if( max < salaries[i][j])
               {
                   max = salaries[i][j];
                   ind = i;
               }
           }
       }
      
       return ind;
        
    }
    
    
    //A method of the index of the year when the highest salary was earned
    public int getHeighestSalaryIndex(){
        
       int ind = -1;
       
       double max = salaries[0][0];
       
       for(int i = 0; i < numPeople; i++) {
           
           for(int j = 0; j < numYears; j++)
               
           {
               if( max < salaries[i][j])
               {
                   max = salaries[i][j];
                   ind = j;
               }
           }
       }
      
       return ind;
        
    }
    
    //A method to return the total amount of money made by a person using the specified row index
    public double getTotalPerson(int rowInd){
       
       double total = 0;
      
       for(int j = 0; j < numYears; j++)
       {  
           total = total + salaries[rowInd][j];
       }
      
       return total;
        
    }
    
    //A method to return the total amount of money made by all the people over the years
    public double getTotalAllPeople() {
        
       double total = 0.0;
      
       for(int i = 0; i < numPeople; i++) {
           
           for(int j = 0; j < numYears; j++)
               
           {
               total = total + salaries[i][j];
           }
       }
       
       return total; 
        
    }
    
    //A method to return the index of the person who made the highest salary in a given year using the specified column index
    public int getIndPersonHeighestSalary(int colIndex){
        
       int ind = -1;
       
       double heighest = salaries[0][0];
       
       for(int i = 0; i < numPeople; i++) {
           if ( heighest < salaries[i][colIndex])
           {
               heighest = salaries[i][colIndex];
               ind = i;
           }
       }
      
       return ind;
        
    }
    
    //Method that returns the average salary of each year
    public double [] getAverageSalary() {
        
       double avg []=new double[numYears];
       
       double total = 0.0;
      
       for(int j = 0; j < numYears; j++)
       {
           total = 0.0;
           for(int i = 0; i < numPeople; i++) {
               
               total = total + salaries[i][j];
               
           }
           avg[j] = total / numPeople;
       }
      
       return avg;
        
    }
    
    //A method that returns another 2-Dimensional array sorted by the total earning per person over the years
    public double [][] getSortSalaries() {
        
       double sDim [] = new double[numPeople * numYears];
       
       int ind = 0;
      
       for(int i = 0 ; i <numPeople; i++) {
           
           for(int j = 0; j < numYears; j++)
               
           {
               sDim[ind ++] = salaries[i][j];
           }
       }
      
       for(int i = 0; i < sDim.length - 1; i++)
           
       {
           for(int j = i + 1; j < sDim.length; j++)
               
           {
               if(sDim [i] > sDim[j])
               
               {
                   double temp = sDim[i];
                   sDim [i] = sDim [j];
                   sDim [j] = temp;
               }
           }
       }
      
       ind = 0;
       for(int i = 0; i < numPeople; i++) {
           
           for(int j=0; j < numYears; j++)
               
           {
               salaries[i][j] = sDim[ind ++];
           }
       }
      
       return salaries;
        
                
    }
    
    
   
    
}
