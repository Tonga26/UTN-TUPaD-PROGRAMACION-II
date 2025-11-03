package trabajopractico7.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();

        Perro perro = new Perro("Fido");
        animales.add(perro);
        Gato gato = new Gato("Garfield");
        animales.add(gato);
        Vaca vaca = new Vaca("Lola");
        animales.add(vaca);

        for (Animal animal : animales) {
            System.out.println(animal.describirAnimal());
            animal.hacerSonido();
        }

    }

}
