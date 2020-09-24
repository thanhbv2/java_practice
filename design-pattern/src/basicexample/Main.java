package basicexample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListChuyenXe listChuyenXe = new ListChuyenXe();
        int x;
        do {
            System.out.println("\n \t ==========================");
            System.out.println("\t1. Them xe noi thanh");
            System.out.println("\t2. Them xe ngoai thanh");
            System.out.println("\t3. Hien thi danh muc xe");
            System.out.println("\t =========");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    listChuyenXe.nhap(1);
                    break;
                case 2:
                    listChuyenXe.nhap(2);
                    break;
                case 3:
                    listChuyenXe.xuat();
            }
        } while (x != 0);

    }
}
