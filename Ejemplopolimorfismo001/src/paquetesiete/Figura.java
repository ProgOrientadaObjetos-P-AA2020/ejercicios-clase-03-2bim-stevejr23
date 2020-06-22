package paquetesiete;

/**
 *
 * @author reroes
 */
public abstract class Figura {

    protected double area;

    public abstract void calcularArea();

    public double obtenerArea() {
        return area;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("\nArea:%.2f", obtenerArea());
        return cadenaFinal;

    }

}
