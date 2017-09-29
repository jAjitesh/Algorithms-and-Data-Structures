package DataStructres;

public class Rotate {
	public static int[] rotateLeft3(int[] nums) {
		  
		  reverse(nums,0,nums.length-1);
		  reverse(nums,0,nums.length-2);
		  return nums;
		    
		  }
		public static void reverse(int[] nums, int start, int end){
		    while(end>start){
		      int temp = start;
		      start = end;
		      end = start;
		      start++;
		      end--;
		    }
		  }
	    public static void main(String[] args) {
	    	int[] nums = {1,2,3,4,5,6,7};
	    	rotateLeft3(nums);
	    }
	}
