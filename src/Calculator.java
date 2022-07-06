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
                    System.out.println("SUMAR");
                    System.out.println("Digite el primer numero: ");
                    n1 = leerNumeros.nextDouble();
                    System.out.println("Digite el segundo numero: ");
                    n2 = leerNumeros.nextDouble();
                    double resultadoSuma = n1 + n2;
                    System.out.println(n1 + " + " + n2 + " = " + resultadoSuma + "\n");
                    break;

                case 2:
                    System.out.println("RESTAR");
                    System.out.println("Digite el primer numero: ");
                    n1= leerNumeros.nextDouble();
                    System.out.println("Digite el segundo numero: ");
                    n2 = leerNumeros.nextDouble();
                    double resultadoResta = n1 - n2;
                    System.out.println(n1 + " - " + n2 + " = " + resultadoResta+"\n");
                    break;

                case 3:
                    System.out.println("MULTIPLICAR");
                    System.out.println("Digite el primer numero: ");
                    n1 = leerNumeros.nextDouble();
                    System.out.println("Digite el segundo numero: ");
                    n2 = leerNumeros.nextDouble();
                    double resultadoMulti = n1 * n2;
                    System.out.println(n1 + " * " + n2 + " = " + resultadoMulti+"\n");
                    break;

                case 4:
                    System.out.println("DIVIDIR");
                    System.out.println("Digite el numerador: ");

                    n1 = leerNumeros.nextDouble();
                    System.out.println("Digite el divisor: ");
                    n2= leerNumeros.nextDouble();

                    if (n2 == 0) {
                        System.out.println("El divisor no debe ser 0\n");
                        break;
                    }

                    double resultadoDiv = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + resultadoDiv+"\n");
                    break;

                case 5:
                    System.out.println("MODULO");
                    System.out.println("Digite el primer numero: ");
                    n1 = leerNumeros.nextDouble();
                    System.out.println("Digite el segundo numero: ");
                    n2 = leerNumeros.nextDouble();
                    if (n2 == 0) {
                        System.out.println("El divisor no debe ser 0\n");
                        break;
                    }

                    double resultadoModulo=n1%n2;
                    System.out.println(n1 + " % " + n2 + " = " + resultadoModulo+"\n");
                    break;

                case 6:
                    System.out.println("HASTA PRONTO!");
                    estado = false;
            }

        } while (estado);
    }
}
