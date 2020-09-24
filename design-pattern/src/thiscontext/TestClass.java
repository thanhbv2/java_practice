package thiscontext;

public class TestClass {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        Author author1 = new Author("007", "2", "van89@gmail.com");
        Author author2 = new Author("00009", "1", "vanthanh89@gmail.com");
        authors[0] = author1;
        authors[1] = author2;
//        System.out.println(author.toString());
        Book book = new Book("node js", 1000, authors, 100);
        System.out.println(book.toString());

        MyPoint myPoint = new MyPoint(0, 5);
        MyPoint myPoint1 = new MyPoint(1, 9);
        System.out.println(myPoint.distance(0, 1));
        System.out.println(myPoint1.distance(myPoint));
    }
}
