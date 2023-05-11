package BaiTap6;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("101","Trọng", 10, 10,4);
        Student student1 = new Student("102","Mai", 9, 10,4);
        Student st = new Student();
        File file = new File("Student.txt");
        st.studentM(student, file);
        st.studentM(student1, file);
        Student[] dsSV = st.fileNeedRead("Student.txt");
        for (int i = 0; i < dsSV.length; i++) {
            System.out.println(dsSV[i]);
//        System.out.println( student.fileNeedRead("Student.txt"));
    }
}
}
