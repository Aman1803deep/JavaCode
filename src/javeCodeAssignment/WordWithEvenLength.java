package javeCodeAssignment;

public class WordWithEvenLength {

	public static void main(String[] args) {
		
		String inputString = " This is an example string with words of different lengths";
		
		if (!inputString.isBlank()) {
	        // Example input string
	        
	        
	        // Split the string into words
	        String[] words = inputString.split(" ");
	        
	        System.out.println("Words with even number of letters:");
	        
	        // Loop through each word and print it if the length is even
	        for (String word : words) {
	            if (word.length() % 2 == 0) {
	                System.out.println(word);
	            }
	            
	          
	            }
	        }
		  else {
          	System.out.println("Nothing is found");
          }
	    }

	
	
	}


