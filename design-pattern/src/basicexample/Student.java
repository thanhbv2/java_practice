package basicexample;

import java.util.Scanner;

public class Student {
    private int maSv;
    private String hoten;
    private double lythuyet;
    private double thuchanh;


    public Student() {
    }

    public Student(int maSv, String hoten, double lythuyet, double thuchanh) {
        this.maSv = maSv;
        this.hoten = hoten;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
    }

    public int getMaSv() {
        return this.maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public String getHoten() {
        return this.hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLythuyet() {
        return this.lythuyet;
    }

    public void setLythuyet(Double lythuyet) {
        this.lythuyet = lythuyet;
    }

    public double getThuchanh() {
        return this.thuchanh;
    }

    public void setThuchanh(Double thuchanh) {
        this.thuchanh = thuchanh;
    }

    public double aveargeScore(){
        return (this.thuchanh + this.lythuyet) / 2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSv=" + this.maSv +
                ", hoten='" + this.hoten + '\'' +
                ", lythuyet=" + this.lythuyet +
                ", thuchanh=" + this.thuchanh +
                '}';
    }

    public static void main(String[] args) {
        Student st1 = new Student(777, "vanthanh", 8.6,2.222);
        System.out.println(st1.getLythuyet());
        System.out.println(st1.aveargeScore());
        Student st2 = new Student(777, "duy linh", 8.6,4.22);

        Scanner sc = new Scanner(System.in);

//        int maSv = sc.nextInt();
//        String hoten = sc.nextLine();
//        Double lt = sc.nextDouble();
//        Double th = sc.nextDouble();

        Student st3 = new Student();
//        st3.setMaSv(maSv);
//        st3.setHoten(hoten);
//        st3.setLythuyet(lt);
//        st3.setThuchanh(th);
        System.out.println( st1.toString());
        st1.toString();
        st2.toString();
        st3.toString();

    }
}
