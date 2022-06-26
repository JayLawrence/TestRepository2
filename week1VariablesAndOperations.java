package week1VariablesAndOperations;

public class week1VariablesAndOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int seatsAvailable = 12;
		double groceriesCost = 14.42;
		char midInitial = 'R';
		boolean isHotOutside = true;
		String streetAddress = "1234 Peace Street";
		
	System.out.println(seatsAvailable);
		System.out.println("The number of available seats is " + seatsAvailable);
		System.out.println("The prices of groceris is " + groceriesCost);
		System.out.println("The middle initial is " + midInitial);
		System.out.println("The temperature outside is hot is a " + isHotOutside + " statement.");
		System.out.println("The street address is " + streetAddress);
		
		
		 // seatsAvailable = seatsAvailable -2;
		seatsAvailable -=2; 
		groceriesCost +=2.15;
		midInitial = 'S';
		isHotOutside = !isHotOutside;
		
		
		System.out.println("The number of available seats is " + seatsAvailable);
		System.out.println("The prices of groceris is " + groceriesCost);
		System.out.println("The middle initial is " + midInitial);
		System.out.println("The temperature outside is hot is a " + isHotOutside + " statement.");
		System.out.println("The street address is " + streetAddress);
		System.out.println("The customer lives at " + streetAddress);
		
		
		
	}

}
