import java.util.Scanner;
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int a=50,b=20;
		if(a>b) {
			if(a>100) 
				System.out.println("Ace");
			if(b<100)
				b=50;
		}
		else if(a==b)
		{
			System.out.println("King");
		}
		else {
			System.out.println("Queen");
		}

		*/
		Scanner s=new Scanner(System.in);
		int a;

		a=s.nextInt();

		if (a%2==0) {
			System.out.println("It is an even number");	
			}else {
				System.out.println("It is an odd number");
			}
		 

	}

}
