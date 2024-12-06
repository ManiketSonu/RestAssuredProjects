package Array;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = {2,4,6,8,10,12};
		int key=10;
		int index = linerS(number,key);
		if(index==-1)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println("key is index at " +index);
		}
	}
	public static int linerS(int number[], int key)
	{
		for(int i=0;i<number.length;i++)
		{
			if(number[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
}
