public class max {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
      T max = x; 
      if (y.compareTo(max) > 0)
        max = y; 
      if (z.compareTo(max) > 0)
        max = z; 
  
      return max; 
    }
  
    public static void main(String args[]) {
      System.out.printf("%d\n", maximum(10,20,30));
      System.out.printf("%.1f\n", maximum(61.6,81.8, 71.7));
      System.out.printf("%s\n", maximum("a","b","c"));
    }
  }