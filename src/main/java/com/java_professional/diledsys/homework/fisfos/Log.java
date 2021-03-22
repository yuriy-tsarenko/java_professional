import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Log {
   String dir;
    File file;

    Log(String fileName) {
        this.dir = fileName;
        file = new File(dir);
        file.mkdir();
        file = new File(file.getPath()+"\\log.txt");
    }
    public void save(String str){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void load(){
        try {
            FileInputStream fis = new FileInputStream(file);
            while (fis.available()>0){
               char ch =(char) fis.read();
                System.out.print(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
