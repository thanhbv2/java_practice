package thiscontext;

/*
* This gọi đến biến instance của lớp hiện tại
* This gọi đến contructor của lớp hiện tại
* This truyền vào method như 1 tham số
* This có
* */
public class Student {
    private int id;
    private String name;
    private Dog dog;

    Student(){
        System.out.println("contructor mac dinh");
    }
    Student(int i, String n){
        this();
        this.id = i;
        this.name = n;
    }

    public Student(Dog d){
        this.dog = d;
    }

    public void display(){
        this.dog.say();
    }

    public void test(){
        System.out.println("this default call method");
        this.display();
        this.hello(this);
    }

    public void hello(Student t){
        System.out.println("hello student");
    }


    public static void main(String[] args) {
//        Student student1 = new Student(1111, "test this");
//        Student student2 = new Student(1111, "test 1111");

//        student1.display();
//        student2.display();

//        Student st = new Student();
//        st.test();
        Dog d = new Dog();


    }
}



class Dog{
    private String name;
    private int id;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  Dog(){
        Student b  = new Student(this);
        b.display();
    }

    public void say(){
        System.out.println("hello world");
    }
}