import java.util.*;
public class range{
public static <T extends Comparable<? super T>> T maximalElement (List<T> list, int from, int to) {
    T max = list.get(from);
    for (int i = from + 1; i < to; i++) {
        T elem1 = list.get(i);
        if (elem1.compareTo(max) > 0) {
            max = elem1;
        }
    }
    return max;
}
public static void main(String [] args) throws Exception{
    String a[]={"1","2","3","4","5"};
    List<String> l = new ArrayList<>(Arrays.asList(a));
    System.out.println(maximalElement(l,0,5));

}
}