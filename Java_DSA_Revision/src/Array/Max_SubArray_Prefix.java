package Array;

public class Max_SubArray_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {2,4,6,7};
		SubPref(numbers);
	}
	public static void SubPref(int numbers[])
	{
		int currSum=0;
		int maxSum=Integer.MIN_VALUE;
		int prefix[] = new int[numbers.length];
		
		prefix[0] = numbers[0];
		for(int i=1;i<prefix.length;i++)
		{
			prefix[i] = prefix[i-1]+numbers[i];
		}
		for(int i=0;i<numbers.length;i++)
		{
			int start=i;
			for(int j=i;j<numbers.length;j++)
			{
				int end=j;
				currSum= start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
				
				if(maxSum<currSum)
				{
					maxSum=currSum;
				}
			}
		}
		System.out.println("Maximum sum is " +maxSum);
	}
}
