package Array;

public class Arrays_as_argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = {97,98,99};
		update(marks);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]+ " ");
		}
		System.out.println();
	}
	
	public static void update(int marks[])
	{
		for(int i=0;i<marks.length;i++)
		{
			marks[i] = marks[i] +1;
		}
	}
	
}
