package paquetesiete;

/**
 *
 * @author reroes
 */
public class Cuadrado extends Figura {

    double lado;

    public void establecerLado(double lad) {
        lado = lad;
    }

    public double obtenerLado() {
        return lado;
    }

    @Override
    public void calcularArea() {
        area = Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("Informacion del Cuadrado: %s\n", cadenaFinal);
        return cadenaFinal;

    }
}
