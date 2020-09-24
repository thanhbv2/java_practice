package basicexample;

import java.util.Scanner;

public class XeNgoaiTinh extends ChuyenXe{
    private String noiDen;
    private int soNgayDi;

    public XeNgoaiTinh() {
        super();
        this.noiDen = "";
        this.soNgayDi = 0;
    }

    public XeNgoaiTinh(String maTuyen, String taiXe, String soXe, double doanhThu, String noiDen, int soNgayDi) {
        super(maTuyen, taiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public String getNoiDen() {
        return this.noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return this.soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.printf("Nhap vao noi den:");
        this.noiDen = sc.nextLine();
        System.out.println("Nhap vao so ngay di");
        this.soNgayDi = sc.nextInt();
    }

    @Override
    public String toString() {
        return "XeNgoaiTinh{" +
                "noiDen='" + this.noiDen + '\'' +
                ", soNgayDi=" + this.soNgayDi +
                '}';
    }
}
