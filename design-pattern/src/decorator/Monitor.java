package decorator;

public class Monitor extends ComponentDecorator {
    private Computer computer;

    public Monitor(Computer c){
        computer = c;
    }

    @Override
    public String description() {
        return computer.description() + " and a monitor";
    }
}
