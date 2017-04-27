import java.util.Scanner;

//TestDemo is the class name as mentioned in the assignment containing the main function
public class TestDemo {
	public static void main(String args[]) {
		int number = 0;
		Scanner s = new Scanner(System.in);
		//Accept any number until 999999, above this not coded
		System.out.println("");
		System.out.println("\nEnter a number until 9,99,999 :");
		number = s.nextInt();
		System.out.println("");
		//Exit program if the number entered is greater than 999999
		if (number > 999999) {
			System.out.println("You have entered a number larger than 9,99,999");
			System.exit(0);
		}  //end of exit program check
		
		//Check for positive or negative number
		if (number < 0) 
			System.out.println("You have entered a negative number");
		else 
			System.out.println("You have entered a positive number");
		
		//Condition to begin writing in words
		if (number < 999999) {
			//Check if number is 0
			if (number == 0) {
				System.out.println("You have entered Zero");
				System.out.println("Zero is neither positive nor negative");
			}
			else {
				// Begin writing in words
				System.out.print("You have entered :");
				//Print a MINUS if the number is negative
				//Convert the number to positive for writing it in words
				if (number < 0) {
					System.out.print("MINUS");
					number = Math.abs(number);
				}
				numberToWord(((number / 100000) % 100), " LAKH ");
				numberToWord(((number / 1000) % 100), " THOUSAND");
				numberToWord(((number / 100) % 10), " HUNDRED");
				numberToWord((number % 100), " ");
			}
			}
		}

public static void numberToWord(int num, String val) {
	//Arrays to take the values
	String ones[] = {" ", " ONE ", " TWO ", " THREE ", " FOUR", " FIVE ", " SIX ", " SEVEN ", " EIGHT ", " NINE ", " TEN ", " ELEVEN ", " TWELVE ", " THIRTEEN ", " FOURTEEN ", " FIFTEEN ", " SIXTEEN ", " SEVENTEEN ", " EIGHTEEN ", " NINETEEN "
    };
    String tens[] = {" ", " ", " TWENTY ", " THIRTY ", " FOURTY ", " FIFTY ", " SIXTY ", " SEVENTY ", " EIGHTY ", " NINETY "};
    if (num > 19) {
        System.out.print(tens[num / 10] + " " + ones[num % 10]);
    } else {
        System.out.print(ones[num]);
    }
    if (num > 0) {
        System.out.print(val);
    }
}
}