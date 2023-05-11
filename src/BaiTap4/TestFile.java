package BaiTap4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {
        try{
            System.out.println("Nhập đường dẫn: ");
            Scanner sc = new Scanner(System.in);
            String path = sc.nextLine();
            File file = new File(path);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
        }catch (Exception e){
            System.out.println("Không tìm thấy file");
        }
    }
}
