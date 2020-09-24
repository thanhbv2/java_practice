package basicexample;

import java.util.Scanner;

public class ChuyenXe {
    private String maTuyen;
    private String taiXe;
    private String soXe;
    private double doanhThu;

    public ChuyenXe() {
        this.maTuyen = "";
        this.taiXe = "";
        this.soXe = "";
        this.doanhThu = 0;
    }

    public ChuyenXe(String maTuyen, String taiXe, String soXe, double doanhThu) {
        this.maTuyen = maTuyen;
        this.taiXe = taiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaTuyen() {
        return this.maTuyen;
    }

    public void setMaTuyen(String maTuyen) {
        this.maTuyen = maTuyen;
    }

    public String getTaiXe() {
        return this.taiXe;
    }

    public void setTaiXe(String taiXe) {
        this.taiXe = taiXe;
    }

    public String getSoXe() {
        return this.soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return this.doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma tuyen:");
        this.maTuyen = sc.nextLine();
        System.out.println("Nhap vao ten tai xe:");
        this.taiXe = sc.nextLine();
        System.out.printf("Nhap vao so xe:");
        this.soXe = sc.nextLine();
        System.out.println("Nhap vao doanh thu");
        this.doanhThu = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "ChuyenXe{" +
                "maTuyen='" + this.maTuyen + '\'' +
                ", taiXe='" + this.taiXe + '\'' +
                ", soXe='" + this.soXe + '\'' +
                ", doanhThu=" + this.doanhThu +
                '}';
    }
}
