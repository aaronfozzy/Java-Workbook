package intermediate;

public class BlackJack {

	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 19;
		
		if (num1 > num2 && num1 < 21)
		{
			System.out.println(num1);
		}
		else if(num2 > num1 && num2 < 21)
		{
			System.out.println(num2);
	}
		else if(num1> 21 && num2 > 21){
			System.out.println(0);
		}
		

}
}
