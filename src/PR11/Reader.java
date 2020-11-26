package PR11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Reader {
    public static void main(String[] args) {
       read1();
    }
    public static void getFile() {
        File file = new File("C:/Games");
        //System.out.println(file.getPath());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File item : files) {
                System.out.println(item.getPath());
            }
        }
    }

    public static void read1() {
        StringBuffer buffer = new StringBuffer();
        try {
            FileInputStream inputStream = new FileInputStream("C:/Games/file.txt");
            while (true) {
                int code = inputStream.read();

                if(code<1) break;

                char ch = (char)code;
                buffer.append(ch);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(buffer);
    }

    public static void read2() {
        StringBuffer buffer = new StringBuffer();
        try {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Games/file.txt"));
            while (true){
                String line = bufferedReader.readLine();
                if(line==null)
                    break;
                buffer.append(line + "\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(buffer);
    }

    public static void read3() {
        StringBuffer buffer = new StringBuffer();
        try {
            List<String> files = Files.readAllLines(Paths.get("C:/Games/file.txt"));
            for(String item : files) {
                buffer.append(item + "\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(buffer);
    }
}
