package BaiTap2;
import java.io.*;
public class main {
    public static void main(String[] args) {
        try {
            File file = new File("TestDoc.txt");
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write("hello azinomoto");
            fw.flush();
            fw.close();
            FileReader fr = new FileReader(file);
            char [] a = new char[20];
            fr.read(a);
            for (char c: a
                 ) {
                System.out.println(c);
                fr.close();
            }

        } catch (IOException e){
            System.out.println("Lỗi phần giá trị");
        }

    }
}
