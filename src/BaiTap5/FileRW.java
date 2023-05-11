package BaiTap5;

import java.io.*;


public class FileRW {
    public String rWBoth(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException("Khong tim thay file");
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String newRead = bufferedReader.readLine();
            bufferedReader.close();
            return newRead;
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public Boolean Writer(String path, String data) {
        try {
            FileWriter fw = new FileWriter(path);
            try {
                if (data == "") {
                    throw new NullPointerException("Khong co gia tri tra ve");
                }
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
            fw.write(data);
            fw.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}


