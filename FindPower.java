import java.util.Scanner;
public class FindPower {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int x=S.nextInt();
		int n=S.nextInt();
		int ans=1;
		while(n>0) {
			ans=ans*x;
			n--;
		}
		System.out.println(ans);
		
	}
	

}
