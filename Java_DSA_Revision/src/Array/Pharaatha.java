package Array;

public class Pharaatha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu[] = {"aaloparatha", "Gobhi Paratha", "SattuParatha", "GannakaJuice"};
		String lelo = "GannakaJuice";
		int indexStr = Phool(menu,lelo);
		if(indexStr==-1)
		{
			System.out.println("Not available");
		}
		else
		{
			System.out.println("available at " +indexStr);
		}
		
	}
	public static int Phool(String[] menu, String lelo)
	{
		
		for(int i=0;i<menu.length;i++)
		{
			if(menu[i]==lelo)
			{
				return i;
			}
		}
		return -1;
	}
}
 