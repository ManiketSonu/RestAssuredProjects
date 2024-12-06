package Array;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		String name[] = new String[size];
		
		for(int i=0;i<size;i++)
		{
			name[i] = sc.next();
		}
		for(int i=0;i<name.length;i++)
		{
			System.out.println("name"+(i+1)+"is: "+name[i]);
		}
	}

}
    