package Java;

public class JavaConcepts {
	
		 

public static void main(String[] args){
	int start = 1;
	int end = 6;
	String[] str = new String[end-start];
	  int i=0;
	  while(end>start){
	    if(start % 3 ==0 ){
	      str[i] = "Fizz";
	    }
	    if(start%5 == 0){
	      str[i] = "Buzz";
	    }
	    if(start%3 ==0 && start%5==0){
	      str[i] = "FizzBuzz";
	    }
	    else {
	      str[i] = String.valueOf(start);
	      
	    }
	    i++;
	    start++;
	  }

	  System.out.println(str);
	}
	
}

