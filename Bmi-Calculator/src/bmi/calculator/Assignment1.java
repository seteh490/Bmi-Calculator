
package bmi.calculator;

import java.util.Scanner;

/**
 *
 * @author Heta SUTO
 */
    public class Assignment1{
        //no attributes required
        
        public static void main(String[] args){
            
            //local variable declaration go here
             BmiCalculator calculator = new BmiCalculator();
            final int F = 10;
            double lowestBMI = 0.0D;
            double highestBMI = 0.0D;
            double totalBMI = 0.0D;
            int numLowBMI = 0;
            int numNormalBMI = 0;
            int numHighBMI = 0;

     //Display Welcome Message
     System.out.println("********************************************************************************************");
     System.out.println("||                            Welcome to the BMI Calculator                               ||");
     System.out.println("********************************************************************************************");
     Scanner input = new Scanner(System.in);
        
      /*Loop to input an individual's height and weight and 
      calculate and display BMI, calculate summary values*/     
         for (int i = 1; i <= 10; i++) {
      System.out.print("Enter Height for person " + i + "(m): ");
      double height = input.nextDouble();
      
      System.out.print("Enter Weight for person " + i + "(kgs): ");
      double weight = input.nextDouble();
      
      double bmi = calculator.value(weight, height);
      String classification8 = calculator.classification8(bmi);
      String classification3 = calculator.classification3(bmi);
      
      System.out.println("BMI for person " + i + ": " + String.format("%.1f", new Object[] { Double.valueOf(bmi) }) + " which is " + classification8);
      totalBMI += bmi;
      if (i == 1 || bmi < lowestBMI)
        lowestBMI = bmi; 
      if (i == 1 || bmi > highestBMI)
        highestBMI = bmi; 
      if (classification3.equals("High")) {
        numHighBMI++;
      } else if (classification3.equals("Low")) {
        numLowBMI++;
      } else {
        numNormalBMI++;
      } 
    } 
            //Generate and display summary
                System.out.println();
            System.out.println("Summary Of BMI");
            System.out.println("***************");
            System.out.println("Lowest BMI: " + String.format("%.1f", new Object[] { Double.valueOf(lowestBMI) }));
            System.out.println("Highest BMI: " + String.format("%.1f", new Object[] { Double.valueOf(highestBMI) }));
            System.out.println("Average BMI: " + String.format("%.1f", new Object[] { Double.valueOf(totalBMI / 10.0D) }));
            System.out.println("Number with low BMI: " + numLowBMI);
            System.out.println("Number with normal BMI: " + numNormalBMI);
            System.out.println("Number with high BMI: " + numHighBMI);
            System.out.println();
            
            //display exit message
            System.out.println("Thank you for using the BMI Calculator, Get regular check to stay FIT!");
            System.out.println("All Rights Reserve @heta_SUTO");
        }
    }