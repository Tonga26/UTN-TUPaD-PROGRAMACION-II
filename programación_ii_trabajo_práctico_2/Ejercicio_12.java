package trabajo_practico_2;
/*
12.  Modificación de un array de precios y visualización de resultados.  
Crea un programa que: 
a.  Declare e inicialice un array con los precios de algunos productos. 
b.  Muestre los valores originales de los precios. 
c.  Modifique el precio de un producto específico. 
d.  Muestre los valores modificados. 
*/
public class Ejercicio_12 {

    public static void main(String[] args) {
        double[] precios = new double[]{199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);
        }
        
        precios[2] = 129.75;
        
        System.out.println("Precios modificados: ");
        
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);
        }
    }

}
