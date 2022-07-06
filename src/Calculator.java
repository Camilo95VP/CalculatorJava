import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean estado;
        do {
            System.out.println("OPERACIONES :\n 1.Sumar\n 2.Restar\n 3.Multiplicar\n 4.Dividir\n 5.Modulo\n 6.Salir");
            Scanner leerOpcion = new Scanner(System.in);
            System.out.println("Digite la opcion: ");
            int opcion = leerOpcion.nextInt();
            estado = true;

            switch (opcion) {

                case 1:
                    System.out.println("seleccionaste sumar");
                    break;

                case 2:
                    System.out.println("Seleccionaste restar");
                    break;

                case 6:
                    estado = false;
            }

        } while (estado);
    }
}
