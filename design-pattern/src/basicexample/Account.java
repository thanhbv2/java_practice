package basicexample;

public class Account {
    private long cardNumber;
    private String userAccount;
    private Double tk;
    private final Double LAI = 0.035;

    public Account() {
    }

    public Account(long cardNumber, String userAccount, Double tk) {
        this.cardNumber = cardNumber;
        this.userAccount = userAccount;
        this.tk = tk;
    }

    public Account(long cardNumber, String userAccount) {
        this.tk = 50.0;
        this.cardNumber = cardNumber;
        this.userAccount = userAccount;
    }

    public long getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUserAccount() {
        return this.userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Double getTk() {
        return this.tk;
    }

    public void setTk(Double tk) {
        this.tk = tk;
    }

    public void naptien(Double st) {
        this.tk += st;
    }

    public void withDrawal(Double st) {
        Double curentTk = this.tk - st;
        if (st < 0) {
            throw new Error("Nhap sai so tien");
        } else if (curentTk <= 50) {
            throw new Error("Khong du so tien trong tk");
        } else {
            this.tk = curentTk;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardNumber=" + this.cardNumber +
                ", userAccount='" + this.userAccount + '\'' +
                ", tk=" + this.tk +
                ", LAI=" + this.LAI +
                '}';
    }

    public static void main(String[] args) {
        Account ac = new Account(1239483, "vanthanh");
        ac.naptien(20000.89);
        ac.withDrawal(10000.0);
        ac.withDrawal(59999.0);
        System.out.println(ac.toString());

    }

}
