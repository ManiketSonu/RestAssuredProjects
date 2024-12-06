package Array;
import java.util.*;
public class Largest_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1,2,9,4,5};
		System.out.println("largest value is "+ largetNum(numbers));
	}
	public static int largetNum(int numbers[])
	{
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<numbers.length;i++)
		{
			if(largest<numbers[i])
			{
				largest=numbers[i];
			}
			if(smallest>numbers[i])
			{
				smallest=numbers[i];
			}
		}
//		System.out.println("Smallest value is "+smallest);
		return largest;
	}
}
