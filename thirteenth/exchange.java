import java.util.*;

public class exchange {
    public static final <T> void swap (T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args)
    {
        String [] a = {"1", "2"};
        swap(a, 0, 1);
        System.out.println("a:"+Arrays.toString(a));
    }

}