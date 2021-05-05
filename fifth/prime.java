import java.util.*;

public class prime{   

    public static void main(String args[]){  
     Scanner in =new Scanner(System.in);   
     int n = in.nextInt();
     int i,flag=0; 
     if(n==0||n==1){  
      System.out.println(n+"not prime number");      
     }else{  
      for(i=2;i<=n/2;i++){      
       if(n%i==0){      
        System.out.println(n+"not prime number");      
        flag=1;      
        break;      
       }      
      }      
      if(flag==0)  { System.out.println(n+"prime number"); }  
     }
   }    
   }   