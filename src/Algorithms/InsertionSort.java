package Algorithms;

public class InsertionSort {
 public int[] sort(int[] arr){
	 
	 for(int i=1;i<arr.length;i++){
		 int val= arr[i];
			int hole= i;
			while(hole>0 && arr[hole-1]>val ){
				arr[hole]=arr[hole-1];
				
			hole=hole-1;
			}
			arr[hole]=val;	
			}
	 return arr;
	 }
 
 }
	

