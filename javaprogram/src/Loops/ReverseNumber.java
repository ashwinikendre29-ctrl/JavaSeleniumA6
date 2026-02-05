package Loops;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		 int number = 12345;
	        int reversedNumber = reverseNumber(number);
	        System.out.println("Original Number: " + number);
	        System.out.println("Reversed Number: " + reversedNumber);
	}
	  public static int reverseNumber(int num) {
	        int reversedNum = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }
	        return reversedNum;
	    }
}
