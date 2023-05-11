package BaiTap1;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            File file = new File("Read.txt");
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write("hello ");
            fw.flush();
            fw.close();
            FileReader fr = new FileReader(file);
            char [] a = new char[5];
            fr.read(a);
            for (char c: a) {
                System.out.println(c);
                fr.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}


//trả lời câu hỏi
//FileReader được kế thừa từ lớp InputStreamReader
//được thực thi bới 3 interface : Closeable, AutoCloseable, Readable
//mục đích: đọc các dòng hoặc các ký tự
//FileReader có 3 phương thức khởi tạo
//1. FileReader(File file)
// tham số đầu vào là File
// mục đích: cung cấp 1 file và đọc từ đó
//2. FileReader(FileDescriptor fd)
//tham số đầu vào FileDescriptor
//mục đích : cung cấp 1 FileDescriptor và đọc từ đó
//3. FileReader(String fileName)
//tham số đầu vào : String
// mục đích: cung cấp tên file và đọc từ đó