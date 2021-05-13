import java.io.*;  
public class bufferinputstream{    
 public static void main(String args[]){    
  try{    
        FileInputStream fin=new FileInputStream("io.txt");    
        BufferedInputStream bin=new BufferedInputStream(fin);    
        int i;    
        while(bin.available()>0){    
            System.out.print((char)bin.read());    
        } 

        bin.close();    
        fin.close();    
  }catch(Exception e){System.out.println(e);}    
 }    
}  