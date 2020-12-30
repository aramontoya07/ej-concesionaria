public class Auto extends Vehiculo {
    int puertas;

    public Auto(String marca, String modelo, Double precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public void mostrarse() {
        System.out.printf("Marca: " + marca + " // " +  "Modelo: " + modelo +  " // "  +  "Puertas: " + puertas +  " // " +  "Precio: $%,.2f" + "\n", precio);
    }



}
