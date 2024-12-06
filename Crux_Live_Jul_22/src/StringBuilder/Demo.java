package StringBuilder;

public class Demo {

	public static void main(String[] args) {
		
		//declaration 
		StringBuilder sb=new StringBuilder("Laura");
		System.out.println(sb);
		
		//get character from index
		System.out.println(sb.charAt(0)); 
		
		//set character at index
		sb.setCharAt(0,'p');
		System.out.println(sb); 
		
		//Insert a Character at Some Index
		sb.insert(0, 'K');
		System.out.println(sb); 
		
		//delete character at some index
		sb.delete(0, 1);
		System.out.println(sb);
		
		//Append a char
		sb.append("stark");
		System.out.println(sb);
		
		//print length of the string 
		System.out.println(sb.length()); 
	}

}
  