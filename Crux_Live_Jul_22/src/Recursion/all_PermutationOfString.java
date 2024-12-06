package Recursion;

import java.util.Scanner;

public class all_PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(getSum(arr,n));
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(arr[i]+" ");
//		}
//		int ar[] = {1,2,3,4,5};
//		int n=5;
//		System.out.println(getSum(ar,n));
	}
	 
	public static int getSum(int ar[], int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+ar[i];
		}
		return sum;
	}
}
 