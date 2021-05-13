import java.util.*;

public class swap {
	public static void main(String[] args)
	{
		Vector<String> v = new Vector();

        System.out.println("enter two element:");
        String x,y;
        Scanner in=new Scanner(System.in);
        x=in.nextLine();
        y=in.nextLine(); 
		v.add(x);
		v.add(y);
		
		System.out.println("Before Swapping = "+v);
		Collections.swap(v,0,1);
		System.out.println("After Swapping = "+v);
	}
}
