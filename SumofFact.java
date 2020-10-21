import java.util.Scanner;

public class SumofFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,num;
		long sum=0;
		long fact = 1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Factorial on this ");
		num = sc.nextInt();
		
		for (i=1; i<=num; i++)
		{
			fact = fact*i;
			sum = sum + fact;
		
		}
	
	System.out.println("Factorial "+num+" "+sum);
	
	
	}

}
