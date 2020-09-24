package basicexample;

import java.util.Scanner;

public class Rectange {
    private int height;
    private int width;
    private int sTich;
    private int cv;

    public Rectange(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return this.height;
    }

    public void setsTich(){
         this.sTich = this.width * this.height;
    }

    public int getsTich(){
        return this.sTich;
    }

    public void setCv(){
        this.cv = (this.height + this.width) * 2;
    }

    public int getCv(){
        return this.cv;
    }



    @Override
    public String toString() {
        return "Rectange{" +
                "height=" + this.height +
                ", width=" + this.width +
                ", sTich=" + this.sTich +
                ", cv=" + this.cv +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        int dai = sc.nextInt();

        System.out.println("Nhap chieu rong");
        int rong = sc.nextInt();

        Rectange rec = new Rectange(dai, rong);
        rec.setCv();
        rec.setsTich();
        System.out.println(rec.getCv());
        System.out.println(rec.getsTich());
        rec.toString();
    }
}
