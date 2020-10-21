
public class SumofArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=153;
       int r;
       int sum=0;
       int temp=num;
    
	System.out.println("Take num ");
	
	while(num>0)
	{
		r = num%10;
		sum = sum+(r*r*r);
		num= num/10;
	}
	
	if(sum==temp)
	{
		System.out.println("it is armstrong");
	}
	else
	{
		System.out.println("it is not");
	}
	}

}
