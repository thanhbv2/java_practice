package polymorphism;

public class Dog extends  Animal{
    @Override
    public void eat() {
        System.out.println("Dog eating milk");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
    }
}
