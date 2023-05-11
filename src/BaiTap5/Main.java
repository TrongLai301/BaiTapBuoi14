package BaiTap5;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đường dẫn");
        String path = sc.nextLine();
        FileRW fileRW= new FileRW();
        System.out.println(fileRW.rWBoth(path));
    }
}

