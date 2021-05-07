import java.util.*;
public class word{  
   
  public static void main(String[] args){     
    String s;
    Scanner in=new Scanner(System.in);
    System.out.println("enter string:");
    s=in.nextLine();    
      String w = "", small = "", large="";    
      String[] ws = new String[100];    
      int length = 0;    
             
      s = s + " ";    
          
      for(int i = 0; i < s.length(); i++){       
          if(s.charAt(i) != ' '){    
              w = w + s.charAt(i);    
          }    
          else{        
              ws[length] = w;     
              length++;       
              w = "";    
          }    
      }               
      small = large = ws[0];    
       
      for(int k = 0; k < length; k++){     
          if(small.length() > ws[k].length())    
              small = ws[k];    
    
          if(large.length() < ws[k].length())    
              large = ws[k];    
      }    
      System.out.println("Smallest :" + small);    
      System.out.println("Largest :" + large);    
  } 
 }  