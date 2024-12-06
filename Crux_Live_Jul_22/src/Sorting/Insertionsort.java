package Sorting;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 8, 1, 3, 2};
		
		for(int i=0;i<arr.length;i++)
		{
			int current =arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>current)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
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
