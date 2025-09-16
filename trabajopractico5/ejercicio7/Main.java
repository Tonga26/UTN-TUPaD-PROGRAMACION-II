package trabajopractico5.ejercicio7;

public class Main {

    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "ASB2349982");
        Vehiculo vehiculo = new Vehiculo("AG974DF", "1.8", motor);
        Conductor conductor = new Conductor("Jose Perez", "B-2");
        
        // Asociacion bidireccional
        vehiculo.setConductor(conductor);
        
        // Mostramos informacion del vehiculo, motor y conductor
        vehiculo.mostrarInformacion();
    }

}
