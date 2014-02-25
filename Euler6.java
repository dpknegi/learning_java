public class Euler6{
	public static void main(String args[]){
		int limit=100;
		long sum_of_squares,square_of_sum,difference;
		sum_of_squares=(limit*((2*limit) + 1))* (limit + 1) / 6;
		square_of_sum=limit * limit* (limit+1)*(limit+1)/4;
		difference=square_of_sum - sum_of_squares;
		System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is : "+ difference);
	}




}