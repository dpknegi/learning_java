public class Euler5{
	public static void main(String args[]){
		//   lcm = product of numbers / hcf of the numbers
		int hcf=1;		//accounting for 1 and 2
		int lcm_till_i= (1*2)/hcf;
		for(int i=3;i<=20;i++){
			
				hcf=modified_hcf(i,lcm_till_i);
				lcm_till_i=(lcm_till_i*i)/hcf;
				System.out.println(i+ " "+lcm_till_i+" "+hcf);
				
		//System.out.println("The smallest possible number that is evenly divisible by numbers 1 to 20 is " +lcm_till_i +"  "+hcf);

		}
		System.out.println("The smallest possible number that is evenly divisible by numbers 1 to 20 is " +lcm_till_i);


	}

	private static int modified_hcf(int number1 , int number2){
		if(number2>number1){
			number1 +=number2;
			number2 = number1-number2;
			//System.out.println(number1+ number2+ "1 and 2");
		}
		while(number1%number2 != 0){
			//System.out.println("smaller" + number2);
			int temp= number2;
			number2 = number1%number2;
			number1 = temp;

		}
		return number2;
	}


}