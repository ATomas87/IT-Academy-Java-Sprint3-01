package n3ex1;

public class Bicicleta extends Vehiculo{
    @Override
    public void arrancar() {
        System.out.println("El ciclista pone los pies en los pedales.");
    }

    @Override
    public void acelerar() {
        System.out.println("La bicicleta está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta está frenando");
    }
}
