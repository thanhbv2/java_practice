package decorator;

public class Cd extends ComponentDecorator{
    private Computer computer;

    public Cd(Computer c){
        computer = c;
    }

    @Override
    public String description() {
        return computer.description() + " and a CD";
    }
}
