package trabajopractico5.ejercicio8;

public class Documento {

    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composicion con FirmaDigital
    private Usuario usuario; // Agregacion con Usuario

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha);
        this.usuario = usuario;
    }

    public void mostrarInformacion() {
        System.out.println("---Información del documento--- \n"
                + "- Título: " + titulo + " \n"
                + "- Contenido: " + contenido + "\n"
                + "- " + usuario + "\n"
                + "- " + firma);
    }

}
