import java.util.Scanner;
import java.util.*;

public class WhatToEat {

	public static void main(String[] args) 
		
		   {
		final int MAX=12;
		final int MIN=7;
		
		final int MIN_Uppercase =1;
		final int MIN_Lowercase = 1;
		final int NUM_Digits =1;
		int uppercaseCounter= 0;
		int lowercaseCounter =0;
		int digitCounter =0;
		
		      Scanner input = new Scanner(System.in);
		      System.out.println("Enter your password");

		      String password = input.nextLine();
		      
		      	for (int i=0; i < password.length(); i++) {
		      		char c= password.charAt(i);
		      		if(Character.isUpperCase(c))
		      			uppercaseCounter++;
		      		else if(Character.isLowerCase(c))
		      			lowercaseCounter++;
		      		else if(Character.isDigit(c))
		      			digitCounter++;
		      	}
		      
		        if (password.length() <= MAX && password.length() >= MIN &&uppercaseCounter >= MIN_Uppercase 
		        		&& lowercaseCounter >= MIN_Lowercase && digitCounter >= NUM_Digits) { 
		        		                    System.out.println("Valid Password and accepted");
		        		             }
		        		             else {
		        		   System.out.println("Error");
		        		                    if(password.length() < MIN)
		        		                         System.out.println(" atleast 7 characters");
		        		                    if(password.length() > MAX)
		        		                    	System.out.println("no more than 12 characters");
		        		                    if (lowercaseCounter < MIN_Lowercase) 
		        		                          System.out.println("Minimum lowercase letters");
		        		                    if (uppercaseCounter < MIN_Uppercase) 
		        		                          System.out.println("Minimum uppercase letters");
		        		                    if(digitCounter < NUM_Digits) 
		        		                          System.out.println("Minimum number of numeric digits");
		        		                
		        		                    
		        		             }
		   }}
		   
		


