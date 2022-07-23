import java.util.Scanner;
public class SumOfEve {
	public static void main(String[]args) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int num;
		int EvenNoSum=0;
		int OddNoSum=0;
		while(n>0) {
			num=(n%10);
			if(num%2==0) {
				EvenNoSum +=num;
			}else {
				OddNoSum +=num;
			}
			n=n/10;
		}
		
		
		System.out.println(EvenNoSum +" "+OddNoSum);
	}

}
