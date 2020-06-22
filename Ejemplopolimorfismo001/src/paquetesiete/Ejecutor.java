package paquetesiete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
         */

        // inicio de la solución
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        double lado, altura, base;
        double diagonalMayor, diagonalMenor;
        ArrayList<Figura> figuras = new ArrayList<>();
        while (bandera) {
            System.out.println("Que figura desea ingresar:");
            System.out.println("1.-Cuadrado\n"
                    + "2.-Rombo\n"
                    + "3.-Triangulo\n"
                    + "4.-Salir\n"
                    + "Seleccione una opcion:");
            int op = entrada.nextInt();
            switch (op) {
                case 1:
                case 2:
                case 3:
                    if (op == 1) {
                        for (int i = 0; i < 4; i++) {
                            Cuadrado cua = new Cuadrado();
                            System.out.printf("Cuadrado (%d)\n", +i + 1);
                            System.out.println("Ingrese la el valor de los "
                                    + "lados del cuadrado");
                            lado = entrada.nextDouble();
                            cua.establecerLado(lado);
                            figuras.add(cua);
                        }
                    }
                    if (op == 2) {
                        for (int i = 0; i < 3; i++) {
                            Rombo rom = new Rombo();
                            System.out.printf("Rombo (%d)\n", +i + 1);
                            System.out.println("Ingrese el valor de la diagonal menor");
                            diagonalMenor = entrada.nextDouble();
                            System.out.println("Ingrese el valor de la diagonal menor");
                            diagonalMayor = entrada.nextDouble();
                            rom.establecerDiagonal_menor(diagonalMenor);
                            rom.establecerDiagonal_mayor(diagonalMayor);
                            figuras.add(rom);
                        }
                    }
                    if (op == 3) {
                        for (int i = 0; i < 5; i++) {
                            Triangulo trian = new Triangulo();
                            System.out.printf("Triangulo (%d)\n", +i + 1);
                            System.out.println("Ingrese ek valor de la altura");
                            altura = entrada.nextDouble();
                            System.out.println("Ingrese el valor de la base");
                            base = entrada.nextDouble();
                            trian.establecerAltura(altura);
                            trian.establecerBase(base);
                            figuras.add(trian);
                        }
                    }
                    for (int i = 0; i < figuras.size(); i++) {
                        // 1.  
                        figuras.get(i).calcularArea();
                        System.out.printf("Datos de Figura\n"
                                + "%s\n",
                                figuras.get(i));
                    }
                    break;
                case 4:
                    if (op == 4) {
                        bandera = false;
                        System.out.println("Gracias vuelva pronto");
                    }
                    break;
                default:
                    System.out.println("No existe la opcion ingresada:");
            }
        }

    }
}
