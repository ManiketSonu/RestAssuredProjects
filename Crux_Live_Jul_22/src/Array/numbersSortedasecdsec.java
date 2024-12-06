package Array;

import java.util.Scanner;

public class numbersSortedasecdsec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int [size];
		
		for(int i=0;i<size;i++)
		{
			numbers[i] = sc.nextInt();
		}
		boolean isAccesnding = true; 
		for(int i=0;i<numbers.length-1;i++) 
		{
			if(numbers[i]>numbers[i+1])
			{
				isAccesnding=false;
			}
		}
		if(isAccesnding)
		{
			System.out.println("the array is sorted in ascending order");
		}
		else
		{
			System.out.println("the array is not sorted in ascending order");
		}
	}

}
 