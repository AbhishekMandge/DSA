import java.util.Scanner;
public class SalaryAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S=new Scanner(System.in);
		int basic=S.nextInt();
		char grade=S.next().charAt(0);
		int allowance;
		double hra=(0.2 * basic);
		double da=(0.5*basic);
		double totalSalary=0;
		
		if (grade=='A') {
			allowance=1700;
		}else if(grade=='B') {
			allowance=1500;
		}else {
			allowance=1300;
		}
		double pf=0.11*basic;
		
		totalSalary=basic+hra+da+allowance-pf;
		
		int ans=(int) Math.round(totalSalary);
		
		System.out.println(ans);

	}
	}

