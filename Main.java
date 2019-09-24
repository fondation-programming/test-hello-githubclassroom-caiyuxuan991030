import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int answer = gcd(m, n);
		System.out.println(answer);
	}
	
	public static int gcd(int m, int n)
	{
		int r = m % n;
		if(r == 0)
		{
			return n;
		}
		else
		{
			m = n;
			n = r;
			return gcd(m, n);
		}
	}
}
