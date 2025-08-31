
package trabajopractico3.ejercicio4;

public class Gallina {
    private int idGallina;
    private int edad; 
    private int huevosPuestos;
    
    public int ponerHuevo(int cantidad){
        huevosPuestos += cantidad;
        return huevosPuestos;
    }
    
    public int evejecer(int anios){
        edad += anios;
        return edad;
    }
    
    public void mostrarEstado(){
        System.out.println("La Gallina " + idGallina + " tiene " + edad + " años y ha puesto " + huevosPuestos + " huevos.");
    }

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        if (idGallina > 0){
            this.idGallina = idGallina;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 0){
            this.edad = edad;
        }
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if(huevosPuestos >= 0){
            this.huevosPuestos = huevosPuestos;
        }
    }
    
}
