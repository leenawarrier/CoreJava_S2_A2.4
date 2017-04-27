import java.util.Scanner;
//Class containing the main function
public class GradeandAge {
	public static void main(String arg[]) {
		int age;
		float marks;
		System.out.println("A student has A grade if marks are more than 70 (marks > 60 if age is less than 15), B grade, if marks are between 61 and 70 (marks between 45 and 60 for age < 15) and C grade, if marks are less than 61 (marks less than 45 for age < 15)");
		System.out.println();
		//Accept the age and marks of student as integer and decimal numbers
		Scanner s = new Scanner(System.in);
		System.out.print("Enter age of student :");
		age = s.nextInt();
		System.out.println("");
		System.out.print("Enter marks of student :");
		marks = s.nextFloat();
		
		//Function StudentGrade taking parameters of age and marks to return grade
		char grade;
		grade = StudentGrade(age,marks);
		System.out.println("");
		System.out.println("****************************");
		System.out.println("Student grade has secured "+grade);
	}
	
	//Function to return grade
	public static char StudentGrade(int a, float m) {
		if (m>70) {                              //Grade is A if marks is greater than 70 irrespective of age
			return 'A'; 
		}
			else if (m > 60 && a <15) {          //Grade is A if marks is > 60 and  age is < 15
				return 'A'; 
				}
			else if (m>60) {
				return 'B'; 					//Grade is B if marks in greater than 60 and age > 15
				}
			else if (m > 45 && a < 15) {        //Grade is B if marks > 45 and age < 15
				return 'B'; 
				}
			else
				return 'C';						//Grade is C if none of the above condition met
		}
	}
