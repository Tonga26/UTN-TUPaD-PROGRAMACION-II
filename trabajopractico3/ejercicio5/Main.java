
package trabajopractico3.ejercicio5;

public class Main {

    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial();
        
        nave1.setNombre("Normandy");
        
        System.out.println("Primera prueba de encendido: ");
        nave1.despegar();
        System.out.println();
        
        nave1.recargarCombustible(50);
        System.out.println("Combustible recargado.\nCantidad de combustible disponible: " + nave1.getCombustible() + " lts.");
        
        System.out.println();
        System.out.println("Segunda prueba de encendido: ");
        nave1.despegar();
        nave1.avanzar(20);
        
        System.out.println();
        nave1.mostrarEstado();
    }

}
