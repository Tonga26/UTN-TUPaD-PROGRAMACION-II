package trabajo_practico_2;

/*
13.  Impresión recursiva de arrays antes y después de modificar un elemento. 
Crea un programa que: 
a.  Declare e inicialice un array con los precios de algunos productos. 
b.  Use una función recursiva para mostrar los precios originales. 
c.  Modifique el precio de un producto específico. 
d.  Use otra función recursiva para mostrar los valores modificados. 
 */
public class Ejercicio_13 {

    public static void mostrarPreciosOriginales(double[] precios, int indice) {
        if (precios.length == indice) {
            return;
        } else {
            System.out.println("Precio: " + precios[indice]);
            mostrarPreciosOriginales(precios, indice + 1);
        }
    }
    
    public static void mostrarPreciosModificados(double[] precios, int indice){
         if (precios.length == indice) {
            return;
        } else {
            System.out.println("Precio: " + precios[indice]);
            mostrarPreciosModificados(precios, indice + 1);
        }
    }

    public static void main(String[] args) {
        double[] precios = new double[]{199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales: ");
        mostrarPreciosOriginales(precios, 0);

        precios[2] = 129.75;
        
        System.out.println("Precios modificados: ");
        mostrarPreciosModificados(precios, 0);

    }
}
