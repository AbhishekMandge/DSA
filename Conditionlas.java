import java.util.Scanner;

public class Conditionlas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int a,b;
		a=s.nextInt();
		b=s.nextInt();
		
		if (a>b) {
			System.out.println("a is greater");
		}else {
			System.out.println("Second number is greater");
			
		}
		System.out.println("Outside else");
		
		
		
		/*
		if (true) {
			System.out.println("inside if");
		}
		else {
			System.out.println("inside else");
		}
*/
	}

}
 