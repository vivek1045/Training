import java.util.*;

public class hashmap {
	public static void main(String[] args) {
		Map<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "v");
		h.put(2, "j");
		for (Map.Entry<Integer, String> set : h.entrySet()) {
		    System.out.println(set.getKey() + " = " + set.getValue());
		}
	}
}