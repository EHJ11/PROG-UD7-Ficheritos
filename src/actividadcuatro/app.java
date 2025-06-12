package actividadcuatro;

import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        MesaDao dao = new MesaDao();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Nueva mesa");
            System.out.println("2. Mostrar todas las mesas almacenadas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Introduce el color de la mesa: ");
                    String color = scanner.nextLine();

                    int patas = 0;
                    while (true) {
                        System.out.print("Introduce el número de patas: ");
                        try {
                            patas = Integer.parseInt(scanner.nextLine());
                            if (patas <= 0) {
                                System.out.println("El número debe ser positivo.");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Introduce un número válido.");
                        }
                    }

                    Mesa mesa = new Mesa(color, patas);
                    dao.guardarMesa(mesa);
                    System.out.println("Mesa guardada: " + mesa);
                    break;

                case "2":
                    List<Mesa> mesas = dao.obtenerMesas();
                    if (mesas.isEmpty()) {
                        System.out.println("No hay mesas almacenadas.");
                    } else {
                        System.out.println("Mesas almacenadas:");
                        for (Mesa m : mesas) {
                            System.out.println(m);
                        }
                    }
                    break;

                case "3":
                    salir = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
