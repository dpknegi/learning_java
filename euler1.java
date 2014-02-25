public class Euler1{
	public static void main (String []args){
		// default arguments
		int factor_1=3;
		int factor_2=5;
		int limit=1000;
		
		// if arguments are supplied
		if (args.length>0){
				factor_1=Integer.parseInt(args[0]);
				factor_2=Integer.parseInt(args[1]);
				limit=Integer.parseInt(args[2]);
		}
		
		int sum_factor_1,sum_factor_2,sum_lcm,result;
		int temp,count_factor_1,count_factor_2,count_lcm,lcm,hcf,hcf_variable;
		count_factor_1= limit/factor_1;
		count_factor_2= limit/factor_2;

		if (factor_1 >factor_2){
			hcf=factor_2;
			hcf_variable=factor_1;
		}
		else{
			hcf=factor_1;
			hcf_variable=factor_2;
		}
		while(hcf_variable%hcf != 0){
			temp=hcf;
			hcf=hcf_variable%hcf;
			hcf_variable=temp;
		}
			
		lcm=(factor_1*factor_2)/hcf;
		count_lcm=limit/lcm;
		
		sum_factor_1=(count_factor_1* (( 2*count_factor_1)+((count_factor_1-1)*count_factor_1))/2;
		sum_factor_2=(count_factor_2* (( 2*count_factor_2)+((count_factor_2-1)*count_factor_2))/2;
		sum_lcm=(count_lcm* (( 2*count_lcm)+((count_lcm-1)*count_lcm))/2;
		result=sum_factor_1+sum_factor_2-sum_lcm;

		System.out.println("The sum of multiples of "+ factor_1 +" and "+factor_2 +" is "+ sum);
	}
}