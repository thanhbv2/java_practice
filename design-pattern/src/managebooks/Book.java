package managebooks;

import java.util.Date;

public class Book {
    private String code;
    private Date importIn;
    private double price;
    private int quanity;
    private String author;

    public Book() {
        this.code = "";
        this.importIn = new Date("DD/MM/YYYY");
        this.price = 0.0;
        this.quanity = 0;
        this.author = "";
    }

    public Book(String code, Date importIn, double price, int quanity, String author) {
        this.code = code;
        this.importIn = importIn;
        this.price = price;
        this.quanity = quanity;
        this.author = author;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getImportIn() {
        return this.importIn;
    }

    public void setImportIn(Date importIn) {
        this.importIn = importIn;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanity() {
        return this.quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "code='" + this.code + '\'' +
                ", importIn=" + this.importIn +
                ", price=" + this.price +
                ", quanity=" + this.quanity +
                ", author='" + this.author + '\'' +
                '}';
    }
}
