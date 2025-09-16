package trabajopractico5.ejercicio7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // agregacion con motor
    private Conductor conductor; // asociacion bidireccional con Conductor

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void mostrarInformacion(){
        System.out.println("Datos del vehiculo: \n"
                + "- Patente: " + patente + "\n"
                + "- Modelo: " + modelo + "\n"
                + "- " + motor.toString() 
                + "\nDatos del conductor: \n"
                + conductor.toString());
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }
    
    
}
