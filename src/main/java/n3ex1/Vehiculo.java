package n3ex1;

public abstract class Vehiculo implements Command {
    public void arrancar(){};
    public void acelerar(){};
    public void frenar(){};

    @Override
    public void execute() {
        arrancar();
        acelerar();
        frenar();
    }
}
