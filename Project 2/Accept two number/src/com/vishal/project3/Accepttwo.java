package com.vishal.project3;
import java.util.Scanner; 


public class Accepttwo { 
  public static void main(String[] args) {  
     
    Scanner scn = new Scanner(System.in);  
    // Promoting for first user input.  
    System.out.println("Please Enter First Number = ");  
   
    int firstNumber = scn.nextInt();  
    // Promotting for second user input   
    System.out.println("Please Enter Second Number = ");  
    
    int secondNumber = scn.nextInt();  
    // Initilizing sum=0 to store temporary value.  
    int sum = 0;  
     
    System.out.print(firstNumber + " " + secondNumber + " ");  
    
    for (int counter = 0; counter < 13; counter++) {  
  
      sum = firstNumber + secondNumber;  
       
      System.out.print(sum + " ");  
    
      firstNumber = secondNumber;  
      secondNumber = sum;  
    }  
  }  
}  