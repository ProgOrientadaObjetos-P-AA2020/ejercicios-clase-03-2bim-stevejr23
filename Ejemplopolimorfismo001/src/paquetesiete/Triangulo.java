package paquetesiete;

/**
 *
 * @author reroes
 */
public class Triangulo extends Figura {

    private double base;
    private double altura;

    public double obtenerBase() {
        return base;
    }

    public void establecerBase(double bas) {
        base = bas;
    }

    public double obtenerAltura() {
        return altura;
    }

    public void establecerAltura(double alt) {
        altura = alt;
    }

    public static void main(String[] args) {

    }

    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("\nInformacion del Triangulo: %s", cadenaFinal);
        return cadenaFinal;

    }

}
