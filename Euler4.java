public class Euler4{
	public static void main(String args[]){
		int product,number1,number2,max_product;
		max_product=1;
		//the product has to be a 6 digit number
		for(number1=999;number1>=100;number1--){
			for(number2=999; number2>=100;number2--){
				product=number1*number2;
				if (check_palindrome(product)==1){
					if (product>max_product){
						max_product=product;
					}
				}
			}
		}
		System.out.println("The largest palindrome which is a product of two 3-digit numbers is "+ max_product);

	}


	private static int check_palindrome(int number){
		int array[]= new int[5]; 
		int length=0;
		int original=number;
		while(number/10 != 0){
		 	length++;
		 	number/=10;
		}
		number=original;
		//getting the digits in the number
		for(int i=0;i<length;i++){
			array[i]=number%10;
			number /=10;
		}
		System.out.println("The largest palindrome which is a product of two 3-digit numbers is "+ array[0]);

		// checking palindrome
		for(int i=0;i<length/2;i++){
			if (array[i]!= array[length-i]){
				return 0;
			}		
		}
		return 1;
	}

}