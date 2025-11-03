package trabajopractico7.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        Circulo circulo = new Circulo("Circulo", 20);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 10, 5);

        figuras.add(circulo);
        figuras.add(rectangulo);

        for (Figura fig : figuras) {
            double area = fig.calcularArea();
            System.out.println("---");
            System.out.println("Figura: " + fig.nombre);
            System.out.println("Área calculada: " + area); 
        }
    }
}
