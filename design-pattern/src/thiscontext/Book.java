package thiscontext;
//
//public class Book {
//    private String name;
//    private int price;
//    private Author author;
//    private int qty;
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPrice() {
//        return this.price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public Author getAuthor() {
//        return this.author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }
//
//    public int getQty() {
//        return this.qty;
//    }
//
//    public void setQty(int qty) {
//        this.qty = qty;
//    }
//
//    public Book(String name, int price, Author author, int qty) {
//        this.name = name;
//        this.price = price;
//        this.author = author;
//        this.qty = qty;
//    }
//
//    public String toString(){
//        return this.name + " " + this.price;
//    }
//
//    public String getNameAuthor(){
//        return author.getName();
//    }
//}
//
//



public class Book {
    public Book(String name, int price, Author[] authors, int qty) {
        this.name = name;
        this.price = price;
        this.authors = authors;
        this.qty = qty;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    private String name;
    private int price;
    private Author[] authors;
    private int qty;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getStrAuthors(){
        String strAuth = "";
        for(int i = 0; i < this.authors.length; i ++){
            System.out.println(this.authors[i].getName());
            strAuth += this.authors[i].getName();
        }
        return strAuth;
    }

    @Override
    public String toString(){
        String strAuth = this.getStrAuthors();
        return this.name + "/" + strAuth + "/" + this.price;
    }


}
