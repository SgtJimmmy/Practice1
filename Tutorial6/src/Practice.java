
public class Practice {
	public static void main(String[] args) {
		int myNumber = 498;
		while(true) {
			
			if(myNumber == 2001) {
				System.out.println("System shutting down.");
				break;	
			}
			if(myNumber < 1000) {
				System.out.println("Welcome to banking Central! ");
				System.out.println("Running");
				System.out.println("Please add more to your account: $" + myNumber);
			}
			else if(myNumber == 1000) {
				System.out.println("Welcome to banking Central! ");
				System.out.println("Running");
				System.out.println("You have reached the minimum balance requirement: $" + myNumber);
			}
			else {
				System.out.println("Welcome to banking Central! ");
				System.out.println("Running");
				System.out.println("Your balance: $" + myNumber);
			}
				myNumber++;

				
		}
			
			
	}

}
