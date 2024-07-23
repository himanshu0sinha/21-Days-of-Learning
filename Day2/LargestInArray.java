import java.util.*;
    public class LargestInArray
    {
        public static int getLargest(int num[]){
            int largest = Integer.MIN_VALUE; // -infinity
            for(int i=0; i<num.length;i++){
                if(largest<num[i]){
                    largest = num[i];
                }
            }
            return largest;
        }
        
        
        
	    public static void main(String[] args) {
	        int num[] = {1, 2, 6,9 ,5, 8};
		    System.out.println("largest value is :" + getLargest(num));
	    }
    }
