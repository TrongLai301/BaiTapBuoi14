package BaiTap3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class TestSave {
        public static void main(String[] args) {
            try {
                File file = new File("Luu.txt");
                file.createNewFile();
                FileWriter fw = new FileWriter(file);
                fw.write("Hello Anh linh ");
                fw.flush();
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
