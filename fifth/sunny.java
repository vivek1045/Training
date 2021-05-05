import java.util.*;  
public class sunny 
{   
    public static void main(String args[])   
    {    
        int num = 0;  
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter number: ");  
        num = in.nextInt(); 
        
        if(Math.sqrt(num+1)%1 == 0) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    
    }  
}  