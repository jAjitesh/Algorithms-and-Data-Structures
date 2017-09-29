package Java;

import java.util.Scanner;

public class Search {
	public static void main(String[] args){
		int[] a={3,7,20,32,45,55,60,65};
		Scanner s=new Scanner(System.in);
	int n= s.nextInt();
	
	int p=0;
	int q=a.length-1;
	
	while(p<=q){
		int mid=(p+q)/2;
		if(n==a[mid]){
		System.out.println("found in index ="+mid);
		break;
	}
	else if(n>a[mid]){
		p=mid+1;
	}
	else{
		q=mid-1;
	}
		
		
			
	}	
	
	}}

 

	