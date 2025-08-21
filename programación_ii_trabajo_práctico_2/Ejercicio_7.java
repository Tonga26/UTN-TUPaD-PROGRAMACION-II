package trabajo_practico_2;

import java.util.Scanner;

/*
7. Validaci�n de Nota entre 0 y 10 (do-while). 
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un n�mero fuera de este rango, debe seguir pidi�ndole la nota
hasta que ingrese un valor v�lido. 
 */
public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota_usuario;
        
        do {   
            System.out.print("Ingrese una nota (0-10): ");
            nota_usuario = Integer.parseInt(input.nextLine());
            
            if (nota_usuario < 0 || nota_usuario > 10) {
                System.out.println("ERROR. Nota inv�lida. Ingrese una nota entre 0 y 10.");
            }

        } while (!(nota_usuario >= 0 && nota_usuario <= 10));
        
        System.out.println("Nota guardada correctamente.");
    }

}
