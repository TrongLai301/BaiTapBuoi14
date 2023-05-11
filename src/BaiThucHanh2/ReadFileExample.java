package BaiThucHanh2;
import java.io.*;
public class ReadFileExample {
    public void readFileText (String filePath){
        try{
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int sum =0;
            while ((line = br.readLine())!=null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Total: "+sum);

        }catch (Exception e){
            System.out.println("Lỗi không tìm thấy file / Nội dung lỗi");
        }

    }
}


