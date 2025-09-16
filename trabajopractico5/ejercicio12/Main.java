package trabajopractico5.ejercicio12;

public class Main {

    public static void main(String[] args) {
        Contribuyente contrib = new Contribuyente("Gaston Giorgio", "20359274367");
        Impuesto impuesto = new Impuesto(10000);
        
        // Asociacion unidireccional
        impuesto.setContribuyente(contrib);
        
        // Dependencia de uso
        Calculadora.calcular(impuesto);
    }

}
