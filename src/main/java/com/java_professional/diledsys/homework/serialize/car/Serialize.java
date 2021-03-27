package diledsys.homework.serialize.car;

import java.io.*;

public class Serialize {

    public static void serializable(Object object) {

        String fPath = "src\\serialize\\car.car";
        try (FileOutputStream fs = new FileOutputStream(fPath);
             ObjectOutputStream oos = new ObjectOutputStream(fs)) {
            oos.writeObject(object);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object deserializable() {

        String fPath = "src\\serialize\\car.car";
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fPath);
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
