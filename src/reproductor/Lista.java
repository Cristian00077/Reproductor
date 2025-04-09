
package reproductor;

public class Lista {
    private Cancion PTR;
    private Cancion FINAL;

    public Lista() {
        this.PTR = null;
        this.FINAL = null;
    }

    public Cancion getPTR() {
        return PTR;
    }

    public void setPTR(Cancion PTR) {
        this.PTR = PTR;
    }

    public Cancion getFINAL() {
        return FINAL;
    }

    public void setFINAL(Cancion FINAL) {
        this.FINAL = FINAL;
    }
    
    
    public void agregarCancion(String nombre, String direccion){
        Cancion nueva = new Cancion(nombre, direccion);
        if(PTR == null){
            PTR = nueva;
            FINAL = nueva;
        }else {
            FINAL.setSiguiente(nueva);
            nueva.setAnterior(nueva);
        }
        FINAL = nueva;
        FINAL.setSiguiente(nueva);
        PTR.setAnterior(nueva);
    }
    
    public void pasarSiguienteCancion(){
        Cancion actual = PTR;
        if (actual != null){
            actual = actual.getSiguiente();
        }
    }
    
    public void pasarAnteriorCancion(){
        Cancion actual = PTR;
        if (actual != null){
            actual = actual.getAnterior();
        }
    }
    
    
}
