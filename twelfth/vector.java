import java.util.ArrayList;
import java.util.Vector;

public class vector {
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);

		Vector<Integer> vector = new Vector<Integer>(a);
		System.out.println(" Vector : " + vector);
	}
}
