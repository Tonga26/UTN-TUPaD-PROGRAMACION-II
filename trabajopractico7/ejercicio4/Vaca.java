package trabajopractico7.ejercicio4;

public class Vaca extends Animal {

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public String describirAnimal() {
        return "Soy una vaca y mi nombre es **" + this.nombre + "**.";
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Muuu, muuu!");
    }
}
