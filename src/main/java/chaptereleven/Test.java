package chaptereleven;

import java.io.*;
import java.time.LocalDateTime;

public class Test {

    private static final String URL = "src/main/java/chaptereleven/test.txt";

    public static void main(String[] args) {
        Period period = new Period(LocalDateTime.MIN, LocalDateTime.MAX);
        serialize(period);
        System.out.println(deserialize());
    }

    private static void serialize(Period period) {
        try {
            File file = new File(URL);
            if (!file.exists()) {
                file.createNewFile();
            }
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(period);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Period deserialize() {
        try {
            InputStream inputStream = new FileInputStream(URL);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Object o = objectInputStream.readObject();
            if (o instanceof Period) {
                return (Period) o;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
