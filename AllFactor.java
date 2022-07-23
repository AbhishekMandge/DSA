import java.util.Scanner;
public class AllFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		int num=S.nextInt();
		int div=2;
		while(div<=num/2) {
			if(num%div==0) {
				System.out.println(div);
				
			}
			div=div+1;
		}

	}

}
