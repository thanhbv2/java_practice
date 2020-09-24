package quanlyks;

import java.util.Date;
import java.util.Scanner;

public class Tax implements HotelBusiness {
    private String taxCode,customerName,roomCode;
    private Date createdTaxAt;
    private double price;
    public Scanner sc = new Scanner(System.in);

    public Tax() {
    }

    public Tax(String taxCode, String customerName, String roomCode, Date createdTaxAt, double price) {
        this.taxCode = taxCode;
        this.customerName = customerName;
        this.roomCode = roomCode;
        this.createdTaxAt = createdTaxAt;
        this.price = price;
    }

    public String getTaxCode() {
        return this.taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRoomCode() {
        return this.roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public Date getCreatedTaxAt() {
        return this.createdTaxAt;
    }

    public void setCreatedTaxAt(Date createdTaxAt) {
        this.createdTaxAt = createdTaxAt;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void input() {
        System.out.println("Nhap ma hoa don:");
        this.taxCode = this.sc.nextLine();
        System.out.println("Nhap ngay");
        String strDate = this.sc.nextLine();
        this.createdTaxAt = new Date(strDate);
        System.out.println("Ten khach hang");
        this.customerName = this.sc.nextLine();
        System.out.println("Ma Phong");
        this.roomCode = this.sc.nextLine();
        System.out.println("Don gia");
        this.price = this.sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Tax{" +
                "taxCode='" + this.taxCode + '\'' +
                ", customerName='" + this.customerName + '\'' +
                ", roomCode='" + this.roomCode + '\'' +
                ", createdTaxAt=" + this.createdTaxAt +
                ", price=" + this.price  +
                '}';
    }

    @Override
    public void display() {
        this.toString();
    }

    @Override
    public double sumTax() {
        return 0;
    }

    @Override
    public double Tbc() {
        return 0;
    }
}
