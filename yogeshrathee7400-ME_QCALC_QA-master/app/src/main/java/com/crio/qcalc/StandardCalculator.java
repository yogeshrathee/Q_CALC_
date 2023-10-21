package com.crio.qcalc;

public class StandardCalculator {
 
protected double result;

public final  void add(double d, double e){
   double result =d + e;

    if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }
    this.result = result;
}


public final void subtract(double num1, double num2){

    double result = num1 - num2;

    if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }

    this.result = result;

}

public final void add(int d, int e){
     result =d + e;
 
 }
 
 
 public final void subtract(int num1, int num2){
  result = num1 - num2;
 

 
 }







 public final void multiply(double d, double e){
    double result =d * e;
 
     if((result == Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)||(result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY) || ( result == Double.MAX_VALUE ||result == Double.MAX_VALUE)){
 
         throw new ArithmeticException("Double overflow");
 
     }
     this.result = result;
 }
 

 
public final void divide(double num1, double num2){
    result = num1 / num2;
}
 public void multiply(int d, int e){
      result =d * e;
  
  }
  
  
  public final void divide(int num1, int num2){
   result = num1 / num2;
  

      }

      



public double getResult(){
    return result;
}


    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }


    public void printResult() {
        System.out.println("Result: " + result);
    }
    
    
}
