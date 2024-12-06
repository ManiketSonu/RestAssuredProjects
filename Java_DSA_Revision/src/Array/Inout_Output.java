package Array;

import java.util.Scanner;

public class Inout_Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int marks[] = new int[50];
		marks[0] = sc.nextInt();
		marks[1] = sc.nextInt();
		marks[2] = sc.nextInt();
		
		System.out.println("phy " + marks[0]);
		System.out.println("chem " + marks[1]);
		System.out.println("math " + marks[2]);
		
		int percentage = (marks[0]+marks[1]+marks[2])/3;
		System.out.println("percentage is " +percentage);
		
		System.out.println("arrays length is " +marks.length);
	}

}
