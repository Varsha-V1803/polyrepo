package exception_handling;

import java.util.Scanner;

public class Throwseg {

		public static void main(String[] args) throws VotingException {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your age: ");
			int age=sc.nextInt();
			if(age>=18)
			{
				System.out.println("you are eligible for voting");
			}
			else
			{
			throw new VotingException("you are not eligible for voting");//in the else without using normal statements we can use throw to point an error to the user.
			}

		}



	}
