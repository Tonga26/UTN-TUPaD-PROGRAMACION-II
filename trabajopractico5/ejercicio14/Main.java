package trabajopractico5.ejercicio14;

public class Main {

    public static void main(String[] args) {
        // Creamos un proyecto
        Proyecto proyecto = new Proyecto("Video Trabajo Practico Programacion II", 15);

        // Creamos un editor de video
        EditorVideo editor = new EditorVideo();

        // Usamos el editor para exportar el proyecto
        editor.exportar("MP4", proyecto);
    }
}

