import java.util.*;   
class palindrome 
{  
   public static void main(String args[])  
   {  
      String main_number, reverse = "";
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a number");  
     
      main_number = in.nextLine();   
         
      for ( int i = (main_number.length()) - 1; i >= 0; i-- )  
         reverse = reverse + main_number.charAt(i);  
      if (main_number.equals(reverse))  
         System.out.println("yes");  
      else  
         System.out.println("no");   
   }  
}  