import java.io.*; 
import java.util.*;

public class bufferedwriter {  
public static void main(String[] args) throws IOException{     
    FileWriter writer = new FileWriter("io.txt");  
    BufferedWriter b = new BufferedWriter(writer); 
    String str;
    Scanner in = new Scanner(System.in);
    System.out.println("enter a string :"); 
    str=in.nextLine(); 
    b.write(str);  
    b.close();  
    System.out.println("Success");  
    }  
}  