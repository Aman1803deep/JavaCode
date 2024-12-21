package javeCodeAssignment;

public class PrintThirdString {

	public static void main(String[] args) {
		String A = " Aman deep kaur";
		
		//Split the sentence into words based on space
		String[] words = A.split(" ");
		
		if(words.length>=3)
		 System.out.println("The third word is: " + words[3]);
		else
	     System.out.println("There is no third word ");
		
	}
}
