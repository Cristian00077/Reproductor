
package reproductor;

public class Cancion {
    String nombre, direccion;
    Cancion siguiente;
    Cancion anterior;

    public Cancion(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.siguiente = null;
        this.anterior = null;
    }

}
