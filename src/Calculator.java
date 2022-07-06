import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        boolean estado;
        double n1=0;
        double n2=0;
        do {
            System.out.println("OPERACIONES :\n 1.Sumar\n 2.Restar\n 3.Multiplicar\n 4.Dividir\n 5.Modulo\n 6.Salir");
            Scanner leerOpcion = new Scanner(System.in);
            System.out.println("Digite la opcion: ");
            int opcion = leerOpcion.nextInt();
            Scanner leerNumeros = new Scanner(System.in);
            estado = true;

            switch (opcion) {

                case 1:

                    System.out.println("Digite el primer numero: ");
                    n1 = leerNumeros.nextDouble();
                    System.out.println("Digite el segundo numero: ");
                    n2 = leerNumeros.nextDouble();
                    double resultadoSuma = n1 + n2;
                    System.out.println(n1 + " + " + n2 + " = " + resultadoSuma);
                    break;

                case 2:

                    System.out.println("Digite el primer numero: ");
                    n1= leerNumeros.nextDouble();
                    System.out.println("Digite el segundo numero: ");
                    n2 = leerNumeros.nextDouble();
                    double resultadoResta = n1 - n2;
                    System.out.println(n1 + " - " + n2 + " = " + resultadoResta);
                    break;

                case 3:

                    System.out.println("Digite el primer numero: ");
                    n1 = leerNumeros.nextDouble();
                    System.out.println("Digite el segundo numero: ");
                    n2 = leerNumeros.nextDouble();
                    double resultadoMulti = n1 * n2;
                    System.out.println(n1 + " * " + n2 + " = " + resultadoMulti);
                    break;

                case 4:

                    System.out.println("Digite el numerador: ");

                    n1 = leerNumeros.nextDouble();
                    System.out.println("Digite el divisor: ");
                    n2= leerNumeros.nextDouble();

                    if (n2 == 0) {
                        System.out.println("No se puede dividir entre 0");
                        break;
                    }

                    double resultadoDiv = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + resultadoDiv);
                    break;

                case 5:
                    System.out.println("Digite el primer numero: ");
                    n1 = leerNumeros.nextDouble();
                    System.out.println("Digite el segundo numero: ");
                    n2 = leerNumeros.nextDouble();
                    if (n2 == 0) {
                        System.out.println("El divisor no debe ser 0");
                        break;
                    }

                    double resultadoModulo=n1%n2;
                    System.out.println(n1 + " % " + n2 + " = " + resultadoModulo);
                    break;

                case 6:
                    estado = false;
            }

        } while (estado);
    }
}
