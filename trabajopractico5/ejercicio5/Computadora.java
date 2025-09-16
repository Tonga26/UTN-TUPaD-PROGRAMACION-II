package trabajopractico5.ejercicio5;

public class Computadora {
    
    private String marca;
    private String modeloSerie;
    private PlacaMadre placa;
    private Propietario propietario;
    
    public Computadora(String marca, String modeloSerie, String modelo, String chipset) {
        this.marca = marca;
        this.modeloSerie = modeloSerie;
        this.placa = new PlacaMadre(modelo, chipset); // Composicion con PlacaMadre
    }
    
    public void mostrarInformacion() {
        System.out.println("Datos de la Computadora: \n" + "- Marca: " + marca + "\n- Modelo de serie: " + modeloSerie + "\n- " + placa.toString());
    }
    
    public Propietario getPropietario() {
        return propietario;
    }
    
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    
}
