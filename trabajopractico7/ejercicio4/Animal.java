package trabajopractico7.ejercicio4;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public void hacerSonido(){
        System.out.println("Sonido genérico de animal");
    }
    
    public String describirAnimal() {
        return "Soy un animal y mi nombre es **" + this.nombre + "**.";
    }
}
