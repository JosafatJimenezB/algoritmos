import java.util.Scanner;
import java.util.*;
public class proovedores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int proovedores = 0;
        int menu = 0;
        int opc = 0;

        System.out.println("Ingrese el numero de proovedores: ");
        proovedores = sc.nextInt();

        //int[] provArray = new int[proovedores];
        String[] nameProovedores = new String[proovedores];
        String[] nameCity = new String[proovedores];
        int[] numberProduct = new int[proovedores];

        for (int i = 0; i < proovedores; i++) {

            sc.nextLine();

            System.out.println("Ingrese el nombre del proovedor " + i);
            nameProovedores[i] = sc.nextLine();

            System.out.println("Ingrese la ciudad del proovedor " + i);
            nameCity[i] = sc.nextLine();

            System.out.println("Ingrese el numero de productos del proovedor " + i);
            numberProduct[i] = sc.nextInt();
        }

        System.out.println("Datos cargados correctamente!");

        do {
            System.out.println("--------------- Gestion de proovedores ---------------");
            System.out.println("------------------------ Menu ------------------------");
            System.out.println("1.- Agregar proovedor");
            System.out.println("2.- Actualizar datos proovedor");
            System.out.println("3.- Actualizar articulos del proovedor");
            System.out.println("4.- Mostrar todos los proovedores");
            System.out.println("5.- Salir");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("********** Agregar proovedor ***********");
                    break;

                case 2:
                    System.out.println("********** Actualizar datos ***********");
                    break;

                case 3:
                    System.out.println("********** Actualizar artículos ***********");
                    break;

                case 4:
                    System.out.println("********** Mostrar todos los proovedores ***********");
                    for (int i = 0; i < proovedores; i++) {
                        System.out.println("Nombre del proovedor: " + nameProovedores[i]);
                        System.out.println("Ciudad de residencia: " + nameCity[i]);
                        System.out.println("Cantidad de productos: " + numberProduct[i] + "\n");
                    }

                    System.out.println("******************************************************\n\n");
                    break;

                 case 5:
                     System.out.println("********** EXIT *********");
                     break;

                default:
                    System.out.println("*********** Opcion no valida **************\n\n");
                    break;


            }


        }while (opc != 5) ;
    }
}
