
public class Application {
	public static void main(String[] args) {
		// 5 != 2 means "5 is not equal to two" and "==" is to test to see if two things are equal ex. 4 == 3
		int myInt = 15;
		
		if(myInt < 10) {
			System.out.println("Yes, it's true!");
		}
		else if(myInt > 20) {
			System.out.println("No, it's false!");
		}
		else {
			System.out.println("None of the above.");
		}
		
		int loop = 0;
		
		while(true) {
			System.out.println("Looping " + loop);
			
			if(loop  == 5) {
				break;
			}
			
			loop++;
			
			System.out.println("Running");
		}
	}
}
