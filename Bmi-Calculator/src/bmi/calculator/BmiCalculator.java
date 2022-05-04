
package bmi.calculator;

public class BmiCalculator {

    public BmiCalculator(){
        //no code required
    }
    public double value(double weight, double height){
                    return (weight / (height * height));
    }
    public String classification8(double bmi)
    {
        //return 8 category(Wikipedia) classification for this bmi
        if (bmi >= 40.0D)
      return "Very severely obese"; 
    if (bmi >= 35.0D)
      return "Severley obese"; 
    if (bmi >= 30.0D)
      return "Moderately obese"; 
    if (bmi >= 25.0D)
      return "Overweight"; 
    if (bmi >= 18.5D)
      return "Normal (healthy weight)"; 
    if (bmi >= 16.0D)
      return "Underweight"; 
    if (bmi >= 15.0D)
      return "Severely underweight"; 
    return "Very severely underweight";
    }
    
    public String classification3(double bmi){
        //return 3 category(high, normal, low) classification for this bmi
        if (bmi >= 25.0D)
      return "High"; 
    if (bmi >= 18.5D)
      return "Normal (healthy weight)"; 
    return "Low";
        
    }
    
}
