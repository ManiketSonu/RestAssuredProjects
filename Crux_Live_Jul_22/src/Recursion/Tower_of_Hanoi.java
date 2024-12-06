package Recursion;

public class Tower_of_Hanoi {
	
	public static void TowerHanoi(int n, String src, String helper, String dest)
	{
		if(n==1)
		{
			System.out.println("transfer disk"+n+"from"+src+"to"+dest);
			return;
		}
		TowerHanoi(n-1,src,dest,helper);
		System.out.println("transfer disk"+n+"from"+src+"to"+dest);
		
		TowerHanoi(n-1,helper,src,dest);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		TowerHanoi(n,"S","H","D");
	}

}
