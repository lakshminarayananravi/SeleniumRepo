package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=34343;
		
		int a,rev=0;
		a=num;
		
		

		for (;num!=0;num=num/10)
		{
			int rem=num%10;
			rev=rev*10+rem;
			
		}

		if (a==rev)
		{
			System.out.println("The given number "+ a + "palindrome" );
		}
		else {
			System.out.println("The given number "+ a + "is not a palindrome");
		}
	}
	}
