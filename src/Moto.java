public class Moto extends Vehiculo {
    int cilindrada;

    public Moto(String marca, String modelo, Double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public void mostrarse() {
        System.out.printf("Marca: " + marca + " // " +  "Modelo: " + modelo  +  " // " + "Cilindrada: " + this.cilindrada + "cc" +  " // " +  "Precio: $%,.2f" + "\n", precio);
    }
}
