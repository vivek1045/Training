import java.util.*;

public class factor{

    public static void main(String[] args) {

      int num;
      Scanner in =new Scanner(System.in);
      num = in.nextInt();
      for (int i = 1; i <= num; ++i) {
        if (num%i == 0) {
          System.out.print(i + " ");
        }
      }
    }
  }