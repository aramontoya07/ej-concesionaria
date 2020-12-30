import java.util.Locale;

public abstract class Vehiculo {
    String marca;
    String modelo;
    Double precio;

    public Vehiculo(String marca, String modelo, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void mostrarse();

    public String mostrarMarcaYModelo() {
        return this.getMarca() + " " + this.getModelo();
    }


}
