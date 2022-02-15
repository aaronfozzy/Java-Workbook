package intermediate;

public class UniqueSum {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		int num3 = 4;
		int ans1 = num1+num2+num3;
		
		if(num1 == num3 && num2==num3 && num3==num1)
		{
			System.out.println(0);
		}
		else if(num2 == num3)
		{
			System.out.println(num1);
		}
		else if(num1 == num3)
		{
			System.out.println(num2);
		}
		else if(num1 == num2)
		{
			System.out.println(num3);
		}
		else
		{
			System.out.println(ans1);
		}
	}
}
