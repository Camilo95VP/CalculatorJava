import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean estado;
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
                    int n1 = leerNumeros.nextInt();
                    System.out.println("Digite el segundo numero: ");
                    int n2 = leerNumeros.nextInt();
                    int resultadoSuma = n1 + n2;
                    System.out.println(n1 + " + " + n2 + " = " + resultadoSuma);
                    break;

                case 2:
                    System.out.println("Digite el primer numero: ");
                    int n3 = leerNumeros.nextInt();
                    System.out.println("Digite el segundo numero: ");
                    int n4 = leerNumeros.nextInt();
                    int resultadoResta = n3 - n4;
                    System.out.println(n3 + " - " + n4 + " = " + resultadoResta);
                    break;

                case 3:
                    System.out.println("Digite el primer numero: ");
                    int n5 = leerNumeros.nextInt();
                    System.out.println("Digite el segundo numero: ");
                    int n6 = leerNumeros.nextInt();
                    int resultadoMulti = n5 * n6;
                    System.out.println(n5 + " * " + n6 + " = " + resultadoMulti);
                    break;

                case 4:

                    System.out.println("Digite el primer numero: ");
                    double n7 = leerNumeros.nextDouble();
                    double n8 = 0;
                    if (n7 == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        System.out.println("Digite el segundo numero: ");
                        n8 = leerNumeros.nextDouble();
                    }

                    double resultadoDiv = n7 / n8;
                    System.out.println(n7 + " / " + n8 + " = " + resultadoDiv);
                    break;

                case 6:
                    estado = false;
            }

        } while (estado);
    }
}
