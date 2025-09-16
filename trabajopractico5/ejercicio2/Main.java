package trabajopractico5.ejercicio2;

public class Main {

    public static void main(String[] args) {
        // Crear batería
        Bateria bateria = new Bateria("Hitachi", "4200");
        
        // Crear celular con batería
        Celular celular = new Celular("E2365123SN", "Samsung", "Galaxy", bateria);
        
        // Mostrar información inicial (sin usuario)
        System.out.println("=== Información inicial del celular ===");
        celular.mostrarInformacion();
        System.out.println();

        // Crear usuario
        Usuario usuario = new Usuario("Carlos Perez", "19903442");
        
        // Asociacion bidireccional
        celular.setUsuario(usuario);
        
        // Mostrar información después de la asociación
        System.out.println("=== Información después de asociar usuario ===");
        celular.mostrarInformacion();
        System.out.println("Datos del usuario: " + usuario);
    }
}

