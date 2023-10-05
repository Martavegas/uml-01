import java.security.PublicKey;
*esta clase esta añadida a git.
public class Procesador {
     //Estados, atributos, propiedades
    public String brand;
    public String model;
    public Double price;

    //comportamiento o metodo(funciones)
    // public(+) metodo accesible desde cualquier otra clase
    // String tipo devuelto por el metodo
    public String getFullName() {
        // Cconcatenar cadenas con +
        // AMD 7600 32.2
        // COMILLAS PARA SEPARAR LA INFORMACION
        return brand + model + price;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }
}