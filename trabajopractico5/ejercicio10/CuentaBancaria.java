package trabajopractico5.ejercicio10;

public class CuentaBancaria {
    private String cbu;
    private int saldo;
    private ClaveSeguridad clave; // Composicion con ClaveSeguridad
    private Titular titular; // Asociacion bidireccional

    public CuentaBancaria(String cbu, int saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
    }
    
    public void mostrarInformacion(){
        System.out.println("---Información de la cuenta bancaria---\n" 
                           + "- CBU: " + cbu + "\n"
                           + "- Saldo: $" + saldo + "\n"
                           + "- " + titular);
    }
    
    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this){
            titular.setCuenta(this);
        }
    }
    
    
}
