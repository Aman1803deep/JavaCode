package javeCodeAssignment;

public class Swapnumbers {

	public static void main(String[] args) {
		int v1 = 100, v2 = 200, v3;
		v3 = v1 + v2; 
		v1 = v3 - v1; 
		v2 = v3 - v1; 
		System.out.println("value of a is " + v1);
		System.out.println("Value of b is " + v2);
	}

}
