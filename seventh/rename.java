import java.io.*;

public class rename {
  public static void main(String[] args) {
    File file = new File("io.txt");
      
    File newFile = new File("input_output.txt");

    boolean value = file.renameTo(newFile);

    if(value) {
      System.out.println("The name changed.");
    }
    else {
      System.out.println("The name cannot be changed.");
    }
  }
}