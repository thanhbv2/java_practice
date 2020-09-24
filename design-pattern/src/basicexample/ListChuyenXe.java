package basicexample;

import java.util.ArrayList;
import java.util.List;

public class ListChuyenXe {
    private List<ChuyenXe> ls = new ArrayList<>();
    private int ck = 0;
    private double sumNoiTinh;
    private double sumNgoaiTinh;
    private int count = 0;

   public void nhap(int type){
       if(type == 1){
           XeNoiTinh xe = new XeNoiTinh();
           xe.nhap();
           this.ls.add(this.count, xe);
           this.sumNgoaiTinh += xe.getDoanhThu();
       }else {
           XeNgoaiTinh xe1 = new XeNgoaiTinh();
           xe1.nhap();
           this.ls.add(xe1);
           this.sumNoiTinh += xe1.getDoanhThu();
       }

       this.count ++;
   }

   public void xuat(){
       for (ChuyenXe xe : this.ls){
           System.out.println(xe.toString());
       }
   }
}
