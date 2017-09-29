package Java;

import java.util.Scanner;

public class Power {
public static void main(String[] args){

	Scanner s=new Scanner(System.in);
	int n =s.nextInt();
	 
	 while(n%3==0){
		 n=n/3;
	 }
	
	 if(n==1){
		 System.out.println("power of 3");
	 }
	 else{
		 System.out.println("not a power of 3");
	 }
	 
	 }
}
