import java.util.*;

class Polynomial
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of expressions of 1st polynomial:");
		int n1=sc.nextInt();
		System.out.println("Enter the degree and coefficient of the expression in descending order of degree:(format->'Deg coef'");
		int arr1[][]=new int[2][n1];
		for(int i=0; i<n1; i++)
		{
			arr1[0][i]=sc.nextInt();
			arr1[1][i]=sc.nextInt();
		}

		System.out.print("Enter the number of expressions of 2nd polynomial:");
		int n2=sc.nextInt();
		System.out.println("Enter the degree and coefficient of the expression in descending order of degree:(format->'Deg coef'");
		int arr2[][]=new int[2][n2];
		for(int i=0; i<n2; i++)
		{
			arr2[0][i]=sc.nextInt();
			arr2[1][i]=sc.nextInt();
		}
		int n3=0;
		int a[][],b[][],na,nb;
		if(arr1[0][0]>arr2[0][0])
		{
			a=arr1;
			na=n1;
			b=arr2;
			nb=n2;
		}
		else
		{
			a=arr2;
			na=n2;
			b=arr1;
			nb=n1;
		}
		for(int i=0;i<na;i++)
		{
			for(int j=0;( j<nb && a[0][i]>=b[0][j] );j++)
			{
				if(a[0][i] == b[0][j])
				{
					n3++;
				}
				else
				{
					n3+=2;
				}
			}
		}
		int arr3[][]=new int[2][n3];
		for(int i=0;i<na;i++)
		{
			for(int j=0;( j<nb && a[0][i]>=b[0][j] );j++)
			{
				if(a[0][i]
