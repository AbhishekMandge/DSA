
package Pattern2;
import java.util.Scanner;
public class ReverseNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int i = 1;
		while(i<=n) {
			int j=1;
			int p=i;
			
			while(j<=i) {
				System.out.print(p);
				p=p-1;
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}

	}

}
