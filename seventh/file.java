import java.io.File;  
import java.io.IOException;  
public class file   
{  
    public static void main(String[] args)   
    {     
        File f = new File("C:\\Users\\asus'\\Desktop\\Training\\seventh\\io.txt"); 
        boolean result;  
        try   
        {  
            result = f.createNewFile();  
            if(result)      
            {  
                System.out.println("file created "); 
            }  
            else  
            {  
                System.out.println("File already exist at location: ");  
            }  
        }   
        catch (IOException e)   
        {  
             e.printStackTrace();    
        } 
        
        finally{
            System.out.println("Finally program end:");
        }
    }  
}  