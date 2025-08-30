/*
3. Crea un programa que declare las siguientes variables con valores asignados:
a. String nombre 
b. int edad 
c. double altura 
d. boolean estudiante 
Imprime los valores en pantalla usando System.out.println(). 
*/
package programación_ii_trabajo_práctico_1;

public class Ejercicio_3 {
    public static void main(String[] args) {
        String nombre = "Gaston";
        int edad = 34;
        double altura = 1.73;
        boolean estudiante = Boolean.TRUE;
        
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Tengo " + edad + " años.");
        System.out.println("Mi altura es de " + altura + " cm.");
        System.out.println("¿Soy estudiante de programación?: " + estudiante);
    }
}  
    
