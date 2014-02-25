public class Euler2{
	public static void main (String []args){
// even numbers are formed when we have odd+odd or even +even
// odd+even=odd
/*In the present case we only have odd +odd cases which correspond 
 to 3n-2 index in the series
 */
//fib series ---> 0,1,1,2,3,5,
		int fib_current,fib_next,sum,index;
		sum=0;
		fib_current=1;
		fib_next=2;
		index=1;

		while ( fib_current<=4000000){
			
			if (index%3==2 ){
				sum+=fib_current;
				System.out.println("added" + fib_current);				
			}
			//going for the next terms in the fibonacci series
			fib_next=fib_next+fib_current;
			fib_current=fib_next-fib_current;
			index++;
		}
		System.out.println("The sum of even-valued terms in the series is " +sum);
	}



}
