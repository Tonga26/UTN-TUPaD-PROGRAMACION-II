package trabajopractico7.ejercicio4;

public class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String describirAnimal() {
        return "Soy un perro y mi nombre es **" + this.nombre + "**.";
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Guau guau!");
    }
}
