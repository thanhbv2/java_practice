package thiscontext;

public class Circle {
    private double radius;
    private String color;


    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double rad){
        this.radius = rad;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getArea());
        Circle c2 = new Circle(2.3);
        System.out.println(c2.getArea());
    }
}






