package Array;

public class Print_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {2,4,6,8,10};
		PrintSub(numbers);
	}
	public static void PrintSub(int numbers[])
	{
		int ts=0;
		for(int i=0;i<numbers.length;i++)
		{
			int start=i;
			for(int j=i;j<numbers.length;j++)
			{
				int end=j;
				for(int k=start;k<=end;k++)
				{
					System.out.print(numbers[k]+ " ");
				}
				ts++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total subarray is " +ts);
	}
}