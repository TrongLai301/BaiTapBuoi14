package BaiTap6;

import java.io.*;

public class Student {
    public String id;
    public String nameS;
    public double mathSc;
    public double physicsSc;
    public double chemistrySc;
    public Student (){}
    public Student (String id){
      this.id=id;
    }
    public Student (String id, String nameS){
        this.id=id;
        this.nameS=nameS;
    }
    public Student (String id, String nameS, double mathSc){
        this.id=id;
        this.nameS=nameS;
        this.mathSc=mathSc;
    }
    public Student (String id, String nameS, double mathSc, double physicsSc){
        this.id=id;
        this.nameS=nameS;
        this.mathSc=mathSc;
        this.physicsSc=physicsSc;

    }
    public Student (String id, String nameS, double mathSc, double physicsSc, double chemistrySc){
        this.id=id;
        this.nameS=nameS;
        this.mathSc=mathSc;
        this.physicsSc=physicsSc;
        this.chemistrySc=chemistrySc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS;
    }

    public double getMathSc() {
        return mathSc;
    }

    public void setMathSc(double mathSc) {
        this.mathSc = mathSc;
    }

    public double getPhysicsSc() {
        return physicsSc;
    }

    public void setPhysicsSc(double physicsSc) {
        this.physicsSc = physicsSc;
    }

    public double getChemistrySc() {
        return chemistrySc;
    }

    public void setChemistrySc(double chemistrySc) {
        this.chemistrySc = chemistrySc;
    }
    @Override
    public String toString(){
        return id + ", " + nameS + ", " + mathSc + ", " + physicsSc + ", " + chemistrySc;
    }

    public boolean studentM (Student std, File file){
//        try{
//            try{
//                FileWriter fileWriter = new FileWriter(file);
//                fileWriter.write(std.toString() +"\n");
//                fileWriter.close();
//                if (mathSc>10 || mathSc<0 || physicsSc>10 || physicsSc<0 || chemistrySc>10 || chemistrySc<0){
//                    throw new ArithmeticException("Loi diem");
//                }
//            }catch (IOException e){
//                System.out.println("Khong tim thay du lieu");
//            }
//            return true;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            return false;
//        }
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write(std.toString() + "\n");
            fw.close();
            return true;
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
            return false;
        }
    }
    public Student[] fileNeedRead(String file){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            String [] s;
            Student [] student = new Student[100];
            int i=0;
            while ((line = bufferedReader.readLine())!=null){
                s = line.split(",");
                student[i] = new Student(s[0] ,s[1],Double.parseDouble(s[2]),Double.parseDouble(s[3]),Double.parseDouble(s[4]));
                i++;
            }
            bufferedReader.close();
            if (i==0){
                return null;
            }else {
                Student [] display = new Student[i];
                System.arraycopy(student,0,display,0,i);
                return display;
            }
        } catch (IOException e) {
            return null;
        }

    }
}
