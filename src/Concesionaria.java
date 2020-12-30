import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Concesionaria {
    private List<Vehiculo> vehiculos = new ArrayList<>();


    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void mostrarVehiculos() {
        for(Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarse();
        }
    }

    public List<Vehiculo> ordenarVehiculosPorPrecio() {
      vehiculos.sort(Comparator.comparing(Vehiculo::getPrecio).reversed());
      return vehiculos;
    }

    public void mostrarVehiculosOrdenadosPorPrecio() {
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        for(Vehiculo vehiculo: ordenarVehiculosPorPrecio()) {
            System.out.println(vehiculo.getMarcaYModelo());
        }
    }

    public void mostrarVehiculoMasCaro() {
        System.out.println("Vehículo más caro: " + vehiculoMasCaro().getMarcaYModelo());
    }

    public void mostrarVehiculoMasBarato() {
        System.out.println("Vehículo más barato: " + vehiculoMasBarato().getMarcaYModelo());
    }

    public void mostrarModeloContieneY() {
        System.out.printf("Vehículo que contiene en el modelo la letra ‘Y’ : " + modeloContieneY().getMarca() + " " + modeloContieneY().getModelo() + " " + "Precio: $%,.2f" + "\n", modeloContieneY().getPrecio());
    }

    public Vehiculo vehiculoMasCaro() {
        return ordenarVehiculosPorPrecio().get(0);
    }

    public Vehiculo vehiculoMasBarato() {
        vehiculos.sort(Comparator.comparing(Vehiculo::getPrecio));
        return vehiculos.get(0);
    }


    public Vehiculo modeloContieneY() {
        return vehiculos.stream()
                .filter(vehiculo -> vehiculo.getModelo().contains("Y"))
                .collect(Collectors.toList())
                .get(0);
    }
}
