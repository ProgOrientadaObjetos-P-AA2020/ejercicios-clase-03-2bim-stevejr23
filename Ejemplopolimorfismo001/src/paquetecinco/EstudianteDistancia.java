package paquetecinco;

import java.util.ArrayList;

public class EstudianteDistancia extends Estudiante {

    /*1.  Declarar
        numeroAsignaturas: Entero 
        costoAsginatura: Real 
     */
    int numeroAsignaturas;
    double costoAsignatura;
    private ArrayList<Estudiante> lista;

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero) {
        numeroAsignaturas = numero;
    }

    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor) {
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    @Override
    public void calcularMatricula() {
        matricula = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas() {
        return numeroAsignaturas;
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura() {
        return costoAsignatura;
    }

    public void establecerLista(ArrayList<Estudiante> lis) {
        lista = lis;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadenaFinal = "";
        for (int i = 0; i < obtenerLista().size(); i++) {
            cadenaFinal = String.format("%s\n"
                    + "%d)Nombre: %s\n"
                    + "Apellido: %s\n"
                    + "Identificación: %s\n"
                    + "Edad: %s\n"
                    + "Costo Credito: %.2f\n"
                    + "Número de Creditos: %d\n"
                    + "Total Matricula: %.2f\n", cadenaFinal, i + 1,
                    obtenerLista().get(i).obtenerNombresEstudiante(),
                    obtenerLista().get(i).obtenerApellidoEstudiante(),
                    obtenerLista().get(i).obtenerIdentificacionEstudiante(),
                    obtenerLista().get(i).obtenerEdadEstudiante(),
                    obtenerCostoAsignatura(),
                    obtenerNumeroAsignaturas(),
                    obtenerLista().get(i).obtenerMatricula());
        }
        return cadenaFinal;
    }

}
