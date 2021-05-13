import java.util.*;
import java.io.*;
 
public class read
{
 
    public static void main(String[] args) throws Exception
    {	
    	File myfile = new File("copy.txt");
    	boolean f = myfile.setReadOnly();	
    	System.out.println("file convert to read only:"+f);
    }
}