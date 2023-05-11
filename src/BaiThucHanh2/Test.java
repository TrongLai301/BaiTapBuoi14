package BaiThucHanh2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Nhập đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        ReadFileExample readFileExample= new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
