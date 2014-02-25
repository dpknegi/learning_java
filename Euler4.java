public class Euler4{
	public static void main(String[] args){
		int solution = createPalindrome();
		System.out.println("The desired palindrome is " + solution);

	}

	private static int createPalindrome(){
		int product = 0;
		int max=1;
		for (int i = 999; i >= 900; i--)
		{
			for (int j =i; j >= 900; j--)
			{
				product = i * j;
				String s1 = Integer.toString(product);
				String s2 = new StringBuffer(s1).reverse().toString();
				if (s1.equals(s2))
					if (product>max)
						max=product;
			}
		}
		return max;
	}
}