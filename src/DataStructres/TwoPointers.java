package DataStructres;

public class TwoPointers {
	public static void main(String[] args){
	int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
	int current = 0;
	boolean found = false;

	for (int i = 1; i < input.length; i++) {
	    if (input[current] == input[i] && !found) {
	        found = true;
	    } else if (input[current] != input[i]) {
	        System.out.print(" " + input[current]);
	        input[current] = input[i];
	        found = false;
	    }
	}
	System.out.print(" " + input[current]);
}
}