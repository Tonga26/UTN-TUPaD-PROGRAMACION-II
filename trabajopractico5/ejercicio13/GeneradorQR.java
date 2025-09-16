package trabajopractico5.ejercicio13;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario){
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        System.out.println("Se generó el Código QR: " + codigoQR.getValor() +
                           "\n- Usuario: " + usuario.getNombre());
    }
}
