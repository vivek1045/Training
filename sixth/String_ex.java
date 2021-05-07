import java.util.*;
import java.lang.*;

class String_ex extends Exception
{
	String_ex(String str) { super(str); }

	public static void main(String[] args)
	{
		try {
                int len1;
                String s;
                Scanner in = new Scanner (System.in);
                System.out.println("enter length of string and string:");
                len1 =Integer.parseInt(in.nextLine());
                s=in.nextLine();

                if(s.length()!=(int)len1){
                    String_ex me = new String_ex("LengthMatchException");
                    throw me;
                }
                
                
			}

		 
		catch (String_ex e) {
			e.printStackTrace();
		}
	}
}