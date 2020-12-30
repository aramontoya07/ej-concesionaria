public class Main {

    public static void main(String[] args) {

        Concesionaria concesionaria = new Concesionaria();

        Vehiculo peugeot4Puertas = new Auto("Peugeot", "206", 200000.0,4);
        Vehiculo honda125 = new Moto("Honda", "Titan", 60000.00, 125);
        Vehiculo peugeot5Puertas = new Auto("Peugeot", "208", 250000.00, 5);
        Vehiculo yamaha160 = new Moto("Yamaha", "YBR", 80500.50,160);

        concesionaria.agregarVehiculo(peugeot4Puertas);
        concesionaria.agregarVehiculo(honda125);
        concesionaria.agregarVehiculo(peugeot5Puertas);
        concesionaria.agregarVehiculo(yamaha160);

        concesionaria.mostrarVehiculos();

        System.out.println("===============================================================");

        concesionaria.mostrarVehiculoMasCaro();
        concesionaria.mostrarVehiculoMasBarato();
        concesionaria.mostrarModeloContieneY();

        System.out.println("===============================================================");

        concesionaria.mostrarVehiculosOrdenadosPorPrecio();
    }
}
