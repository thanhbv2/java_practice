package inheritance;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
        System.out.println("contructor default parent");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public String getName(){
        return "circle";
    }

    @Override
    public String toString(){
        return this.radius + " " + this.color;
    }
}
