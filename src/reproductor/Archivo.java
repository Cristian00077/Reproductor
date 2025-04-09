package reproductor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
    private String ruta;

    public Archivo(String ruta) {
        this.ruta = ruta;
    }
    
    public void escribirTexto(String usuario, String contraseña){
        try (FileWriter writer = new FileWriter(ruta, true);
                BufferedWriter buffer = new BufferedWriter(writer);
                PrintWriter print = new PrintWriter(buffer)){
                print.println(usuario + "," + contraseña);
            
        } catch (Exception e) {
            System.out.println("Error al registrar");
        }
    }
    
    public boolean leerTexto(String usuario, String contraseña) throws FileNotFoundException, IOException {
        try (FileReader reader = new FileReader(ruta);
                BufferedReader buffer = new BufferedReader(reader)){
                String linea;
                String [] partes = new String[2];
                while ((linea = buffer.readLine())!= null){
                    partes = linea.split(",");
                    String usuarioArchivo = partes[0].trim();
                    String contraseñaArchivo = partes[1].trim();
                    if (usuarioArchivo.equals(usuario.trim()) && contraseñaArchivo.equals(contraseña.trim())){
                    return true;
                    }
                }    
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        return false;
    }
    
}
