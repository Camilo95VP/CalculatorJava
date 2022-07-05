import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean estado;
        do {
            System.out.println("OPERACIONES :\n 1.Sumar\n 2.restar");
            Scanner leerOpcion = new Scanner(System.in);
            int opcion = leerOpcion.nextInt();
            estado = true;

            switch (opcion) {

                case 1:
                    System.out.println("seleccionaste sumar");
                    break;

                case 2:
                    System.out.println("Seleccionaste restar");
                    break;

                case 3:
                    estado = false;
            }

        } while (estado);
    }
}
