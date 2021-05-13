import java.io.*;
import java.nio.file.*;
import java.util.zip.*;
 
public class zip {
    public static void main(String[] args) throws IOException{
        String filePath = "input_output.txt";

        File file = new File(filePath);
            String zipFileName = file.getName().concat(".zip");
 
            FileOutputStream f = new FileOutputStream(zipFileName);
            ZipOutputStream z = new ZipOutputStream(f);
 
            z.putNextEntry(new ZipEntry(file.getName()));
 
            byte[] b = Files.readAllBytes(Paths.get(filePath));
            z.write(b, 0, b.length);
            z.closeEntry();
            z.close();
 
        
    }
}