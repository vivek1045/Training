import java.util.*;

class binary{

	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<>();

		v.add(1);
		v.add(5);
		v.add(2);
		v.add(4);
		v.add(3);

		Collections.sort(v);
		int index = Collections.binarySearch(v,2);
		System.out.println("Element is found at index : "
						+ index);
	}
}
