package javeCodeAssignment;
import java.util.List;
import java.util.ArrayList;

public class FindMissingNumbersArray {

	public static void main(String[] args) {
		
		//declare Array
		int[] numbers = new int[6]; 
		
		//initiate array
		numbers[0]=1;
		numbers[1]=3;
		numbers[2]=5;
		numbers[3]=7;
		numbers[4]=8;
		numbers[5]=9;
		
		
		  int N = 8; 
		  //Passing the method values to list array
		  List<Integer> missingNumbers = findMissingNumbers(numbers, N);
	
		System.out.println("Missing Numbers: " + missingNumbers);
	}

	private static List<Integer>  findMissingNumbers(int[] numbers, int N) {
		
		 //declare the list array
		
		   List<Integer> missingNumbers = new ArrayList<>();
	        
	        int expected = 1;  // Start with the first number in the range
	        for (int i = 0; i < numbers.length; i++) {
	            while (expected < numbers[i]) {  // Missing numbers between 'expected' and arr[i]
	                missingNumbers.add(expected);
	                expected++;
	            }
	            expected++;  // Move past the current element
	        }
	        
	        // If the last element in the array is not N, add the missing numbers after it
	        while (expected <= N) {
	            missingNumbers.add(expected);
	            expected++;
	        }

	        return missingNumbers;
	    }
	
	}
    
