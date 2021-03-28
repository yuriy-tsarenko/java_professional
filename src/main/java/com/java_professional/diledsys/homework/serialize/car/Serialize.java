package diledsys.homework.serialize.car;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialize {

    public static void serializable(Object object) {

        String path = "src\\serialize\\car.car";
        try (FileOutputStream fs = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fs)) {
            oos.writeObject(object);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object deserializable() {

        String path = "src\\serialize\\car.car";
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            System.out.println("ClassNotFoundException");
        }
        return null;
    }
}
