
package reproductor;

public class Cancion {
    private String nombre, direccion;
    private Cancion siguiente;
    private Cancion anterior;

    public Cancion(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cancion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cancion siguiente) {
        this.siguiente = siguiente;
    }

    public Cancion getAnterior() {
        return anterior;
    }

    public void setAnterior(Cancion anterior) {
        this.anterior = anterior;
    }
    
    

}
