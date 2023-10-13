package week1.day2;

public class ConvertToPositive {

	public static void main(String[] args) {
	
		int n=-30;
		
		if(n<0) {
			int con=n*-1;
			System.out.println("The number " + n + " is converted to " +con);
		}
		
		else {
			System.out.println("The number is already Positive");
		}

	}

}
