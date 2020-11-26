package PR11;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Writer {
    public static void main(String[] args) {
        write3();
    }

    public static void write1() {
        try {
            FileOutputStream os = new FileOutputStream("C:/Games/file.txt");
            for(int i=0;i<=1000;i++) {
                for(char c : Integer.toString(i).toCharArray()) {
                 os.write(c);
                }
                os.write('\n');
            }
            os.flush();
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void write2() {
        try {
            PrintWriter writer = new PrintWriter("C:/Games/file.txt");
            for(int i=0;i<=1000;i++) {
                writer.write((i + "\n"));
                }
            writer.flush();
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void write3()
    {
        try {
            ArrayList<String> list = new ArrayList<>();
            for(int i=0;i<=1000;i++) {
                list.add(Integer.toString(i));
            }
            Files.write(Paths.get("C:/Games/file.txt"), list);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
