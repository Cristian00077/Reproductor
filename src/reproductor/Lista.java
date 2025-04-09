
package reproductor;

public class Lista {
    Cancion PTR;
    Cancion FINAL;

    public Lista() {
        this.PTR = null;
        this.FINAL = null;
    }
    
    public void agregarCancion(String nombre, String direccion){
        Cancion nueva = new Cancion(nombre, direccion);
        if(PTR == null){
            PTR = nueva;
            FINAL = nueva;
        }else {
            FINAL.siguiente = nueva;
            nueva.anterior = FINAL;
        }
        FINAL = nueva;
        FINAL.siguiente = PTR;
        PTR.anterior = FINAL;
    }
    
    public void pasarSiguienteCancion(){
        Cancion actual = PTR;
        if (actual != null){
            actual = actual.siguiente;
        }
    }
    
    public void pasarAnteriorCancion(){
        Cancion actual = PTR;
        if (actual != null){
            actual = actual.anterior;
        }
    }
    
    public void ElimiarCancion(Cancion otra){
        if (PTR == null) {
            System.out.println("No hay cancion para eliminar");
        }else{
        
        }
    
    }
}
