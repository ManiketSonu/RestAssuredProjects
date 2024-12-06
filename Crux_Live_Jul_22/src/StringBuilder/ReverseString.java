package StringBuilder;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("HelloWorld");
		
		for(int i=0;i<sb.length();i++)
		{
			int front = i;
			int back = sb.length()-i-1;
			char frontchar = sb.charAt(front);
			char backchar = sb.charAt(back);
			
			sb.setCharAt(front, backchar);
			sb.setCharAt(back, backchar);
		}
		
		System.out.println(sb);
	}

}
    