package quanlyks;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       ListTax ls = new ListTax();
        Scanner sc = new Scanner(System.in);
        int in;
        do {
            System.out.println("please input");
            in = sc.nextInt();
            switch (in){
                case 1:
                    ls.addCustormer(HotelDefined.TAX_DAY);
                    break;
                case 2:
                    ls.addCustormer(HotelDefined.TAX_HOUR);
                    break;
                case 3:
                    ls.display();
                    break;
                case 0:
                    System.out.println("quit");
                    break;
            }
        }while (in != 0);

    }
}
