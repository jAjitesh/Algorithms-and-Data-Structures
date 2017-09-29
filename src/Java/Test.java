package Java;



public class Test {
public static void main(String[] args){
	int temp=0;
	int[] arr= {12,8,7,5,2,3,10,15};
	for (int i=0;i<=arr.length-1;i++){
		int minIndex=i;
		for(int j=i+1;j<arr.length-1;j++){
			if(arr[minIndex]>arr[j]){
	minIndex=j;
			}}
				
		
		temp= arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
			
		
		
	}
	for(int k=0;k<=arr.length-1;k++){
		System.out.println(arr[k]);
	}
}
}
