public class Euler7{
	public static void main (String args[]){
		long count=0,number=1;
		while (count<=10000){
			number++;
			if (check_prime(number)==1){
				count++;
			}
			
		}
		System.out.println("The 10,001st prime number is "+ number);
	}

	private static int check_prime(long number){
		for(int i=2;i*i<=number;i++){
			if (number%i ==0)
				return 0;
		}
		return 1;

	}
}