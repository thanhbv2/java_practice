package basicexample;

public class Vehice {
    private String name;
    private int dungtich;
    private Double price;


    public Vehice(String name, int dungtich, Double price) {
        this.name = name;
        this.dungtich = dungtich;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDungtich() {
        return this.dungtich;
    }

    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public Double getTaxByVehice() {
        Double tax = 0.0;
        if (this.dungtich < 100) {
            tax = this.price * 0.01;
        } else if (this.dungtich >= 100 && this.dungtich <= 200) {
            tax = this.price * 0.03;
        }else {
            tax = this.price * 0.05;
        }
        return tax;
    }


    public void displayTable(Vehice v){

        Double tax = v.getTaxByVehice();


        System.out.printf("%s          %d          %f          %f\n", v.name, v.dungtich, v.price, tax);

    }

    public static void main(String[] args) {
        Vehice vc1 = new Vehice("jupiter", 100, 200.2);
        Vehice vc2 = new Vehice("jupiter", 200, 200.2);
        Vehice vc3 = new Vehice("jupiter", 220, 200.2);
        System.out.println("--------Vehice---------");
        System.out.println("Name            Dung tich           Price           Tax");
        vc1.displayTable(vc1);
        vc2.displayTable(vc2);
        vc3.displayTable(vc3);
    }

}
