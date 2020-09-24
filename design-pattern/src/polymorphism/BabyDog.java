package polymorphism;

public class BabyDog extends Dog {
//    @Override
//    public void eat() {
//        System.out.println("Babydog eating");
//    }

    public static void main(String[] args) {
        Animal dog = new BabyDog();
        dog.eat();
    }
}
