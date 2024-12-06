package Sorting;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,8,3,1,2};
		
		for(int i=0;i<arr.length;i++)
		{
			int samllest=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[samllest])
				{
					samllest=j;
				}
			}
			int temp=arr[samllest];
			arr[samllest]=arr[i];
			arr[i]=temp;
		}
		printArray(arr);
	}
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
 
}
 