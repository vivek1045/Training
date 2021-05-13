import java.io.*;  
public class bufferedreader {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("io.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          String s;    
          while((s=br.readLine())!=null){  
          System.out.print(s);  
          }  
          br.close();    
          fr.close();    
    }    
}  