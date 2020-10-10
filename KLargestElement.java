import java.util.Arrays;
import java.util.Collections;


public class KLargestElement {

	public static int getKLargestElement(Integer[] input, int k) {
		int result=0;
		if(input.length==1) {
			return input[0];
		}
		
		Arrays.sort(input, Collections.reverseOrder());
		
		return input[k-1];	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] test1= {1};
		System.out.println("The k largest value in {1} is "+ getKLargestElement(test1, 1));
		
		Integer[] test2= {2,3,1,4,5,1,3,9};
		System.out.println("The 1st largest value in test 2 is "+ getKLargestElement(test2, 1));
		System.out.println("The 3rd largest value in test 2 is "+ getKLargestElement(test2, 3));
		
		Integer[] test3= {5,5,5,5,5,5,5,5,5,5,5,5};
		System.out.println("The 1st largest value in test 3 is "+ getKLargestElement(test3, 1));
		System.out.println("The 12nd largest value in test 3 is "+ getKLargestElement(test3, 12));
		
	}

}
