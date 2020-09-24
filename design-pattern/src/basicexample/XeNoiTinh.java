package basicexample;

import java.util.Scanner;

public class XeNoiTinh extends ChuyenXe {
    private String soTuyen;
    private double soKmChay;

    public XeNoiTinh() {
        super();
        this.soTuyen = "";
        this.soKmChay = 0;
    }

    public XeNoiTinh(String maTuyen, String taiXe, String soXe, double doanhThu, String soTuyen, double soKmChay) {
        super(maTuyen, taiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmChay = soKmChay;
    }

    public String getSoTuyen() {
        return this.soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKmChay() {
        return this.soKmChay;
    }

    public void setSoKmChay(double soKmChay) {
        this.soKmChay = soKmChay;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap vao so tuyen:");
        this.soTuyen = sc.nextLine();
        System.out.println("Nhap vao so km chay");
        this.soKmChay = sc.nextDouble();

    }

    @Override
    public String toString() {
        return "XeNoiTinh{" +
                "soTuyen='" + this.soTuyen + '\'' +
                ", soKmChay=" + this.soKmChay +
                '}';
    }
}
