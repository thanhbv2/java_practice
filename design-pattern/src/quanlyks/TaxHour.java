package quanlyks;

import java.util.Date;

public class TaxHour extends Tax {
    private int hours;
    private double cashPay;

    public TaxHour() {
    }

    public TaxHour(String taxCode, String customerName, String roomCode, Date createdTaxAt, double price, int hours, double cashPay) {
        super(taxCode, customerName, roomCode, createdTaxAt, price);
        this.hours = hours;
        this.cashPay = cashPay;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
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
        System.out.println("Tong gio thue");
        this.hours = this.sc.nextInt();
        if(this.hours >= 30){
            this.hours = 24;
            this.cashPay = this.hours * this.getPrice();
        }else if(this.hours > 24 && this.hours < 30){
            this.cashPay = this.hours * this.getPrice();
        }else {
            throw new Error("Chuyen sang tinh tien hoa don theo ngay");
        }
    }

    @Override
    public String toString() {
        return "TaxHour{" +
                "hours=" + this.hours +
                ", cashPay=" + this.cashPay +
                '}';
    }

    @Override
    public void display() {
        this.toString();
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
