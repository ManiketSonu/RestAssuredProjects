package Array;

public class BinarSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {2,4,6,8,10,12,14};
		int key=10;
		
		System.out.println("index at "+Binar(numbers,key));
	}
	public static int Binar(int numbers[], int key)
	{
		int start=0; 
		int end=numbers.length-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(numbers[mid]==key)
			{
				return mid;
			}
			if(numbers[mid]<key)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return -1;
	}
}
