package BaiThucHanh1;

import java.io.File;

public class TestFile {
        public static void main(String[] args) {
            File file = new File("doc2.txt");
            System.out.println(file.getName());
            System.out.println(file.getPath());
        }

    }


//Trả lời câu hỏi
//C1: Mục đích chung của lớp file là để tạo file, thư mục
//C2:file được kế thừa từ lớp object
//   file được thực thi từ 2 interface là Serializable, Comparable<file>
//C3: Lớp file có 4 phương thức khởi tạo :
//File(File parent, String child)
//Creates a new File instance from a parent abstract pathname and a child pathname string.
//
////Tạo một phiên bản Tệp mới từ tên đường dẫn trừu tượng gốc và chuỗi tên đường dẫn con
//
//File(String pathname)
//Creates a new File instance by converting the given pathname string into an abstract pathname.
//
////Tạo một phiên bản Tệp mới bằng cách chuyển đổi chuỗi tên đường dẫn đã cho thành một tên đường dẫn trừu tượng.
//
//
//File(URI uri)
//Creates a new File instance by converting the given file: URI into an abstract pathname.
//
////Tạo một phiên bản Tệp mới bằng cách chuyển đổi tệp đã cho: URI thành một tên đường dẫn trừu tượng.
//
//File(String parent, String child)
//Creates a new File instance from a parent pathname string and a child pathname string.
//
////Tạo một phiên bản Tệp mới từ chuỗi tên đường dẫn gốc và chuỗi tên đường dẫn con.




//getName()
// input: null;
//output: name;
// mục đích: lấy tên file;
//tên phương thức: getName;

//getPath()
//input: null;
//output: pathName
//mục đich:để chuyển đổi phương thức pathName sang chuỗi pathName
//Tên phương thức: getPath

