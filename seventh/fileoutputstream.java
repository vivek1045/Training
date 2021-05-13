import java.util.*;
import java.io.*;

public class fileoutputstream{  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("io.txt");    
             String str; 
             Scanner in=new Scanner(System.in);
             System.out.println("enter string :");
             str=in.nextLine();   
             byte s[]=str.getBytes();   
             fout.write(s);    
             fout.close();    
             System.out.println("success");    
            }
            catch(Exception e)
            {
                  System.out.println(e);
            }    
      }    
}  