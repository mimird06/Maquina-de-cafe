import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vaso vasoPequeno = new Vaso(3);
        Vaso vasoMediano = new Vaso(5);
        Vaso vasoGrande = new Vaso(7);
        Cafetera cafetera = new Cafetera(100);
        Azucarero azucarero = new Azucarero(50);

        MaquinaDeCafe maquina = new MaquinaDeCafe(cafetera, azucarero);
        System.out.println("---------------------------------------------");
        System.out.println("¡Bienvenido a la Maquina de Cafe: Nescafe!");

        while (true) {
            System.out.println("");
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Preparar cafe.");
            System.out.println("2. Salir. ");
            System.out.print(">>>> ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("");
                System.out.println("Selecciona el tamano del vaso: ");
                System.out.println("1. Pequeño (3 Oz)");
                System.out.println("2. Mediano (5 Oz)");
                System.out.println("3. Grande (7 Oz)");
                System.out.print(">>>> ");
                int opcionVaso = scanner.nextInt();

                System.out.println("");
                System.out.println("Seleccione la cantidad de azucar (cucharadas): ");
                System.out.print(">>>> ");
                int cucharadasAzucar = scanner.nextInt();

                Vaso vasoSeleccionado = null;
                switch (opcionVaso) {
                    case 1:
                        vasoSeleccionado = vasoPequeno;
                        break;
                    case 2:
                        vasoSeleccionado = vasoMediano;
                        break;
                    case 3:
                        vasoSeleccionado = vasoGrande;
                        break;
                    default:
                        System.out.println("");
                        System.out.println("Opcion no valida. Seleccionando vaso pequeno por defecto.");
                        vasoSeleccionado = vasoPequeno;
                        break;
                }

                String resultado = maquina.prepararCafe(vasoSeleccionado, cucharadasAzucar);
                System.out.println(resultado);
            } else if (opcion == 2) {
                System.out.println("");
                System.out.println("Cafe listo, ¡Nos vemos!");
                break;
            } else {
                System.out.println("");
                System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
            }
        }

        scanner.close();
    }
}
