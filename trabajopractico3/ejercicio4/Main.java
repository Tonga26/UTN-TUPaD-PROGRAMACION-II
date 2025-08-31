
package trabajopractico3.ejercicio4;

public class Main {

    public static void main(String[] args) {
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();
        g1.setIdGallina(1);
        g2.setIdGallina(2);
        
        
        g1.evejecer(2);
        g1.ponerHuevo(100);
        g1.mostrarEstado();
        
        g2.evejecer(3);
        g2.ponerHuevo(200);
        g2.mostrarEstado();
        
    }

}
