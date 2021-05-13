import java.io.*;
import java.util.*;

class reverse_string{
	public static void main(String[] args)
	{
		String str;
        Scanner in=new Scanner (System.in);
        str = in.nextLine();
	
        char[] reverse= new char[str.length()];
        
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        int i = 0;
        while (!stack.isEmpty()) {
            reverse[i++] = stack.pop();
        }
        String s = String.valueOf(reverse);
        System.out.println("reverse string : "+s);
		
	}
}
