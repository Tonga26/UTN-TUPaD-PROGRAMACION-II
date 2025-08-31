
package trabajopractico3.ejercicio5;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    
    public void despegar(){
        if (combustible > 10) {
            System.out.println("Encendiendo los motores de la nave. Despegando...");
        }else{
            System.out.println("Combustible insuficiente para despegar.");
        }
    }
    
    public void avanzar(int distancia) {
        combustible -= distancia;
        System.out.println("Navegando... Distancia recorrida: " + distancia + " kms.");
    }
    
    public int recargarCombustible(int cantidad){
        combustible += cantidad;
        return combustible;
    }
    
    public void mostrarEstado(){
        String mensaje = String.format("""
        ---- Estado de la nave %s ----
        Sistemas: OK
        Defensas: OK
        Soporte vital: OK
        Combustible disponible: %d lts.
        """, nombre, combustible);
        System.out.println(mensaje);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int cantidad) {
        if(cantidad > 0){
            this.combustible = cantidad;
        }
    }
    
    
}
