import java.util.*;
class PrimeNumber
{
	public static void main(String[] args)
	{
		System.out.println("enter the range for prime for prime number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++)
		{   if(i==1)
		      continue; 
			int flag=0;
			 for (int j = 2; j < i; j++)
			 { 
              if (i % j == 0)
              	flag=1;
             
             }
             if(flag!=1)
             	System.out.println(i + " ");
         }


	}
}