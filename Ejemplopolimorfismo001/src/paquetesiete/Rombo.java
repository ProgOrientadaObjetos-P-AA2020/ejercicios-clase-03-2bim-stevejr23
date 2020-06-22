package paquetesiete;

/**
 *
 * @author reroes
 */
public class Rombo extends Figura {

    private double diagonal_menor;
    private double diagonal_mayor;

    public void establecerDiagonal_menor(double diagonalMenor) {
        diagonal_menor = diagonalMenor;
    }

    public void establecerDiagonal_mayor(double diagonalMayor) {
        diagonal_mayor = diagonalMayor;
    }

    @Override
    public void calcularArea() {
        area = (diagonal_menor * diagonal_mayor) / 2;
    }

    public double obtenerDiagonal_menor() {
        return diagonal_menor;
    }

    public double obtenerDiagonal_mayor() {
        return diagonal_mayor;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("\nInformacion del Rombo: %s", cadenaFinal);
        return cadenaFinal;

    }

}
