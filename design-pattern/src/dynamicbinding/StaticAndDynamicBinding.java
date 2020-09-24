package dynamicbinding;


class Human {
    public  static void walk (){
        System.out.println("Human walk");
    }
}

class Boy extends  Human {
    public static void walk(){
        System.out.println("Boy walk");
    }
}

public class StaticAndDynamicBinding {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Boy();


        obj.walk();
        obj1.walk();
    }
}
