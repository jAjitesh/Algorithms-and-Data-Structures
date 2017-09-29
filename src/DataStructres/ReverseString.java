package DataStructres;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	String str = s.next();
	int n = str.length();
	char[] tempCharArray = new char[n];
	
	for (int i = 0; i < n; i++) {
        tempCharArray[i] = 
            str.charAt(i);
    } 
 for(int j=0; j<n/2; j++){
	 
	 char temp = tempCharArray[j];
	 tempCharArray[j]  = tempCharArray[n-j-1];
	 tempCharArray[n-j-1] = temp;
 }
System.out.println(tempCharArray);
}
}
