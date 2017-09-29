package Java;


import java.util.*;
public class Bubble {
	public static void main(String[] args){
		
		
		        Scanner s = new Scanner(System.in);
		        int N = s.nextInt();
		        int[] arr = new int[N];
		        for (int i = 0; i < N; i++) {
		            arr[i] = s.nextInt();
		        }
		        int count = 0;
		        int i = 0;
		        while(i<N-1){
		            if(arr[i] > arr[i+1]){
		                count++;
		                i++;
		            }
		            else{
		                while(arr[i] < arr[i+1] && i<N-1){
		                    i++;
		                }
		                count++;
		            }
		        }
		        
		        System.out.println(count);
		    }
		
}