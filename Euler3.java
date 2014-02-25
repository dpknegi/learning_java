public class Euler3{
	public static void main(String args[]){
		long largest_factor;
		long input_data=600851475143L;
		largest_factor=1;

		for(int i=2;i<=input_data;i++){
			if(input_data%i==0){		//finding a factor
				input_data=remove_factor(input_data,i);		//completely removing the factor
			largest_factor=i;
			}

		}
		System.out.println("The largest prime factor is " + largest_factor);

	}

	private static long remove_factor(long input_data,int i){
		while(input_data%i ==0)
			input_data/=i;

		return input_data;
	}

}