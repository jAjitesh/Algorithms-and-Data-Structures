package Java;

import java.util.Scanner;

public class InsertElement {
	public static void main(String[] args){
		int[] a={2,4,5,7,9,0,0};
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=0;i<=a.length-1;i++){	
		if(n<a[i]){
			System.out.println(i);
			break;
			}}}}
			
			/*for(int j=a.length-1;j>=i;--j){
				a[j+1]=a[j];
					
			}
			a[i]=n;
		}
	
	
for(int k=0;k<=a.length-1;k++){
	System.out.println(a[k]);
	break;	
}
	}} */
