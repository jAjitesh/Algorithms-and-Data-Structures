package Algorithms;


public class BubbleSort {
	
		public int[] sort(int[] a){
						
			for(int i=0; i<=a.length-1; i++){
				for(int j=0; j<a.length-1-i; j++){
					if(a[j+1]<a[j]){
				int	temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					}
				}
			}
			return a;
	}
}

