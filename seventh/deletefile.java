import java.io.*;  
public class deletefile  
{  
    public static void main(String[] args) throws IOException
    {            
            File f= new File("io.txt");     
            if(f.delete())               
            {  
                System.out.println(f.getName() + " deleted");     
            }  
            else  
            {  
                System.out.println("failed");  
            }
    }  
}  