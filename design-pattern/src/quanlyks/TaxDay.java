package quanlyks;

import java.util.Date;

public class TaxDay extends Tax {
    private int days;
    private double cashPay;

    public TaxDay() {
    }

    public TaxDay(String taxCode, String customerName, String roomCode, Date createdTaxAt, double price, int days, double cashPay) {
        super(taxCode, customerName, roomCode, createdTaxAt, price);
        this.days = days;
        this.cashPay = cashPay;
    }

    public int getDays() {
        return this.days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getCashPay() {
        return this.cashPay;
    }

    public void setCashPay(double cashPay) {
        this.cashPay = cashPay;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("tong ngay thue");
        this.days = this.sc.nextInt();
        if(this.days > 7){
            this.cashPay = this.days * this.getPrice() * 0.2;
        }else {
            this.cashPay = this.days * this.getPrice();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public double sumTax() {
        return super.sumTax();
    }

    @Override
    public double Tbc() {
        return super.Tbc();
    }
}
