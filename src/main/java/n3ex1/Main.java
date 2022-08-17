package n3ex1;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        parking.addVehiculo(new Coche());
        parking.addVehiculo(new Barco());
        parking.addVehiculo(new Avion());
        parking.addVehiculo(new Bicicleta());

        parking.usarVehiculos();
    }
}
