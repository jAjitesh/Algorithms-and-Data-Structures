package DataStructres;

public class TwoPointers1 {
	public static void main(String[] args){
	    
		
		    public int[] twoSum(int[] numbers, int target) {
		        int[] res = new int[2];
		       int start = 0;
		       int end = numbers.length - 1;
		       while(end > start){
		       
		           if(numbers[start]+numbers[end] == target ){
		               res[0] = start+1;
		               res[1] = end+1;
		               break;
		           }
		       else if(numbers[start]+numbers[end] != target){
		           start++;
		       }
		           end--;
		       }
		       return res;
		    }
		
	}
}
