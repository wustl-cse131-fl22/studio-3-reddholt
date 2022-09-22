package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number n: ");
		int highestNumber = in.nextInt();
		int[] primeNumbers = new int [highestNumber];
		for (int i = 1; i <= highestNumber; i++) {
			primeNumbers[i-1] = i;
			System.out.println(primeNumbers[i-1]);
			/*for (int j = 2; j < i + 2; j++) {
				if (primeNumbers[i-1] % j != 0) {
					System.out.println(primeNumbers[i-1]);
				}
			}*/
		}

	}

}
