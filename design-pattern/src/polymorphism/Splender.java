package polymorphism;

public class Splender extends Bike {
    @Override
    public void run(){
        System.out.println("Splender running");
    }

    public static void main(String[] args) {
        Splender splender = new Splender();
        splender.run();
    }
}
