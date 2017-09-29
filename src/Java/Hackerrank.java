package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Hackerrank {
	
	//Complete this code or write your own from scratch
	
	

	
	Scanner sn= new Scanner(System.in);
	   public int factorial(int k, int n){
	      k=1;
	       if(k<n){
	          return n * fatorial(k,n-k);
	          k++;
	       }
	   }
	    
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	   
	    }
	}