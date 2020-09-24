package thiscontext;

public class DellComputer extends Computer{
    public String name = "DEll";

    public DellComputer(String name){
        this.name = name;
    }

    public DellComputer(){

    }

    public DellComputer display(){
        return this;
    }

    @Override
    public String open(){
        return this.getName();
    }

    @Override
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Computer c = new DellComputer();
        System.out.println(c.name);
        System.out.println(c.getName());
        DellComputer dell = new DellComputer();
        System.out.println(dell);
        System.out.println(dell.display());
        DellComputer dell1 = new DellComputer("test");
        System.out.println(dell1);
        System.out.println(dell1.display());
    }
}
