package n3ex1;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private List<Vehiculo> vehiculos;

    public Parking() {
        this.vehiculos = new ArrayList<>();
    }

    public void addVehiculo(Vehiculo vehiculo){
        this.vehiculos.add(vehiculo);
    }

    public void usarVehiculos(){
        this.vehiculos.forEach(Vehiculo::execute);
    }
}
