package Java;

public class Insertion {
	public static void main(String[] args){
		int[] arr={12,1,2,4,9,13};
		for(int i=1;i<=arr.length-1;i++){
			int val= arr[i];
			int hole= i;
			while(hole>0 && arr[hole-1]>val ){
				arr[hole]=arr[hole-1];
				
			hole=hole-1;
			}
			arr[hole]=val;	
			}
	for(int i=0;i<=arr.length-1;i++){
		System.out.println(arr[i]);
	}
	}

}
