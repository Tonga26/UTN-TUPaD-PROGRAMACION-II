package trabajopractico7.ejercicio4;

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String describirAnimal() {
        return "Soy un gato y mi nombre es **" + this.nombre + "**.";
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Miau miau!");
    }
}
