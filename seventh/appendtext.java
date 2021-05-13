import java.io.*;
import java.util.*;

class appendtext
{
   public static void main( String[] args ) throws IOException
   {	
      
    	String content;
        Scanner in = new Scanner(System.in);
        System.out.println("enter string that you want to append:");
        content = in.nextLine();
    	File file =new File("io.txt");
    	if(!file.exists()){
    	   file.createNewFile();
    	}
    	FileWriter f = new FileWriter(file,true);
    	BufferedWriter b = new BufferedWriter(f);
        PrintWriter p = new PrintWriter(b);
    	p.write(content);
    	p.close();

	System.out.println("Data successfully appended at the end of file");

   }
}