package managebooks;

import java.util.Date;

public class SachThamKhao extends Book {
    private double tax;

    public SachThamKhao(double tax) {
        super();
        this.tax = tax;
    }

    public SachThamKhao(String code, Date importIn, double price, int quanity, String author, double tax) {
        super(code, importIn, price, quanity, author);
        this.tax = tax;
    }

    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getMoneyOfBook(){
        return this.getPrice() * this.getQuanity() + this.tax;
    }

    @Override
    public String toString() {
        return "SachThamKhao{" +
                "tax=" + this.tax +
                '}';
    }
}
