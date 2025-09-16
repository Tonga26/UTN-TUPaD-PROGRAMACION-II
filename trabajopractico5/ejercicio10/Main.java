package trabajopractico5.ejercicio10;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("3462538729109372", 1000, "programacion.2025", "16-09-2025");
        Titular titular = new Titular("Gaston Giorgio", "35927663");
        
        // Asociacion bidireccional
        cuenta.setTitular(titular);
        
        // Mostramos informacion de la cuenta (sin mostrar clave ni ultima modificacion, como en la vida real)
        cuenta.mostrarInformacion();
    }

}
