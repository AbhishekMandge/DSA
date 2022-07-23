import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();

		int div = 2;
		//boolean isPrime = true;
		while (div <= n / 2) {
			if (n % div == 0) {
				 System.out.println("Compostie");
				//isPrime = false;
				return;
			}
			div = div + 1;
		}
		System.out.println("Prime number");

		/*if (isPrime) {
			System.out.println("It is prime number");
		} else {
			System.out.println("Compiste number");

		}*/

	}

}
