package basicexample;

import java.util.Scanner;

public class BasicEx {

    public int ex1(int i) {
        int tong = 0, dem = 1;
//        i = new Random().nextInt(1000);
        while (dem <= 10) {

            if (i % 2 != 0) {
                i++;
            }

            System.out.println(i);
            tong += i;
            i += 2;
            dem++;
        }
        return tong;
    }


    public void drawTriangle(int canh){
        char x = '*';
        char space = '_';
        int iSpace = 1;
        System.out.println(x);

        for(int i = 1; i < canh - 2; i ++){
            System.out.print(x);
            this.printLine(iSpace, space);
            System.out.println(x);
            iSpace += 1;
        }
        this.printLine(canh, x);
    }

    public  void drawRectange(int canh) {
        char x = '*';
        char space = '-';
        this.printLine(canh, x);

        System.out.print(x);
        System.out.print(x);
    }


    public  void printLine(int len, char c){
        for(int i = 0; i < len; i ++){
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        BasicEx ex = new BasicEx();
        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        System.out.println(ex.ex1(i));
        ex.drawTriangle(10);
    }
}
