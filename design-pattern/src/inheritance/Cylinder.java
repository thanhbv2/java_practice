package inheritance;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
    }

    public Cylinder(double height){
        this.height = height;
    }

//    public Cylinder(double radius, String color, double height) {
//        super(radius, color);
//        this.height = height;
//    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumn(){
        return this.height * this.getArea();
    }

    public String getName(){
        return "Cylinder";
    }

    public void display(){
        System.out.println(super.getName());
        System.out.println(getName());
    }

    public static void main(String[] args) {
//        Cylinder cylinder1 = new Cylinder();

        Cylinder cylinder = new Cylinder(1111.1);
        System.out.println(cylinder.getVolumn());
        cylinder.display();

    }
}
