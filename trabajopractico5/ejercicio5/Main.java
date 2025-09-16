package trabajopractico5.ejercicio5;

public class Main {
    
    public static void main(String[] args) {
        // Creamos la computadora y su placa madre (composición)
        Computadora pc = new Computadora("Gamer", "SE23391", "ASUS", "B550");
        
        // Mostramos los datos de la computadora (usa mostrarInformacion)
        pc.mostrarInformacion();
        
        // Creamos el propietario
        Propietario prop = new Propietario("Juan Menezes", "38762539");
        
        // Mostramos los datos del propietario (usa toString)
        System.out.println("\nPropietario creado: " + prop);
        
        // Asociación bidireccional 
        pc.setPropietario(prop);  
        
        // Verificamos que ambos quedaron vinculados
        System.out.println("\nLuego de asociar bidireccionalmente:");
        
        // Mostrar el propietario de la computadora (usa toString del Propietario)
        System.out.println("Propietario de la PC: " + pc.getPropietario());
        
        // Mostrar los datos de la computadora del propietario (usa mostrarInformacion)
        prop.getComputadora().mostrarInformacion();
    }
}


