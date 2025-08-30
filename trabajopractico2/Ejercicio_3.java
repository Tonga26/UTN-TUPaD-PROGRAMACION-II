
package trabajo_practico_2;

import java.util.Scanner;

/*
3. Clasificación de Edad. 
Escribe un programa en Java que solicite al usuario su edad y clasifique su 
etapa de vida según la siguiente tabla:
-Menor de 12 años: "Niño" 
-Entre 12 y 17 años: "Adolescente" 
-Entre 18 y 59 años: "Adulto" 
-60 años o más: "Adulto mayor" 
*/

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad_usuario;
        
        System.out.println("Ingrese su edad: ");
        edad_usuario = Integer.parseInt(input.nextLine());
        
        if (edad_usuario < 12) {
            System.out.println("Eres un niño.");
        }else if (edad_usuario < 17) {
            System.out.println("Eres un adolescente.");
        }else if(edad_usuario < 59){
            System.out.println("Eres un adulto.");
        }else {
            System.out.println("Eres un adulto mayor.");
        }
    }

}
