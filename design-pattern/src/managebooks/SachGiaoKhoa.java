package managebooks;

import java.util.Date;

public class SachGiaoKhoa extends Book {
    private int status;
    public SachGiaoKhoa() {
        super();
        this.status = 1;
    }

    public SachGiaoKhoa(String code, Date importIn, double price, int quanity, String author, int status) {
        super(code, importIn, price, quanity, author);
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getMoneyOfBook(){
        double total;
        if(this.getStatus() == 1){
            total = this.getPrice() * this.getQuanity();
        }else {
            total = this.getPrice() * this.getQuanity() * 0.5;
        }
        return total;
    }

    @Override
    public String toString() {
        return "SachGiaoKhoa{" +
                "status=" + this.status +
                '}';
    }
}
