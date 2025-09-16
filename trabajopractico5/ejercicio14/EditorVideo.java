package trabajopractico5.ejercicio14;

public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
        Render render = new Render(formato, proyecto);
        System.out.println("Se generó el proyecto: \n- Nombre: " + render.getProyecto().getNombre() + "\n- Duración: " + render.getProyecto().getDuracionMin() + " minutos" + "\n- Formato: " + render.getFormato());
    }
}
