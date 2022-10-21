import java.util.Scanner;
class Balance
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int year;
		double interest_rate;
		double initial_balance, old_balance, new_balance, SI;
		System.out.print("Enter the initial value: ");
		initial_balance=sc.nextDouble();
		System.out.print("Enter the interest rate: ");
		interest_rate=sc.nextDouble();
		System.out.print("Enter the year: ");
		year=sc.nextInt();
		old_balance=initial_balance;
		System.out.println("Year\tInitial Balance\tInterest\tNew Balance");
		for(int i=1; i<=year; i++)
		{
			SI=(old_balance*interest_rate)/100;
			new_balance=(old_balance+SI);
			System.out.printf("%d\t\t%.2f\t\t\t%.2f\t\t%.2f\n", i, old_balance, SI, new_balance);
			old_balance=new_balance;
		}
	}
}