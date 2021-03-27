package diledsys.homework.decoder;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.File;
import java.io.IOException;

public class IOfile {
    public static StringBuilder load() {
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(new File("diledsys\\homework\\decoder\\book.txt"))) {
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            while (br.ready()) {
                char ch = (char) br.read();
                sb.append(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb;
    }

    public static void save(StringBuilder sb) {
        try (FileOutputStream fos = new FileOutputStream(new File("diledsys\\homework\\decoder\\book.txt"))) {
            fos.write(sb.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
