import java.util.Scanner;
public class proovedores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int proovedores = 0;
        int opc = 0;


        System.out.println("*********** Precarga de datos ***********");
        System.out.println("Ingrese el numero de proovedores: ");
        proovedores = sc.nextInt();

        //int[] provArray = new int[proovedores];
        String[] nameProovedores = new String[proovedores];
        String[] nameCity = new String[nameProovedores.length];
        int[] numberProduct = new int[nameProovedores.length];

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
            System.out.println("                        Menu                          ");
            System.out.println("1.- Agregar proovedor");
            System.out.println("2.- Buscar proovedor");
            System.out.println("3.- Actualizar Ciudad del proovedor");
            System.out.println("4.- Actualizar articulos");
            System.out.println("5.- Listar todos los proovedores");
            System.out.println("6.- Salir");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    sc.nextLine();

                    System.out.println("********** Agregar proovedor ***********\n");

                    System.out.println("Datos del nuevo proovedor");

                    for (int i = 0; i < nameProovedores.length; i++) {
                        System.out.println("Nombre: ");
                        nameProovedores[i] = sc.nextLine();
                        System.out.println("Ciudad de residencia: ");
                        nameCity[i] = sc.nextLine();
                        System.out.println("Articulos: ");
                        numberProduct[i] = sc.nextInt();
                    }

                    break;

                case 2:

                    sc.nextLine();

                    System.out.println("********** Buscar proovedor ***********\n");

                    System.out.println("Ingrese el nombre del proovedor");
                    String name = sc.nextLine();

                    int res = buscarProovedor(nameProovedores, name);

                    if (res == -1) {
                        System.out.println("No se encontro al proovedor" + name + "\n");
                    }else{
                        System.out.println("El proovedor se encuentra en la posicion: " + res + "\n");

                        System.out.println("********* Info del proovedor *********");
                        System.out.println("Nombre: "+ nameProovedores[res]);
                        System.out.println("Ciudad de residencia: "+ nameCity[res]);
                        System.out.println("Articulos: "+ numberProduct[res] + "\n");
                    }

                    break;

                case 3:
                    sc.nextLine();

                    System.out.println("********** Actualizar Ciudad ***********\n");

                    System.out.println("Ingrese el nombre del proovedor: ");
                    String updateName = sc.nextLine();

                    int upRes = buscarProovedor(nameProovedores, updateName);


                    if (upRes == -1){
                        System.out.println("No se encontro al proovedor" + updateName + "\n");
                    }else {
                        System.out.println("Ingrese la nueva ciudad de residencia: ");
                        String newCity = sc.nextLine();

                        nameCity[upRes] = newCity;

                        System.out.println("Los nuevos datos son");
                        System.out.println("Nombre: "+ nameProovedores[upRes]);
                        System.out.println("Ciudad de residencia: "+ nameCity[upRes]);

                    }

                    break;

                case 4:
                    System.out.println("********** Actualizar articulos ***********\n");

                    int amount = 0, total = 0;
                    sc.nextLine();

                    System.out.println("Ingrese el nombre del proovedor: ");
                    name = sc.nextLine();

                    res = buscarProovedor(nameProovedores, name);

                    if (res == -1){
                        System.out.println("No se encontro al proovedor" + name + "\n");
                    }else{
                        System.out.println("1.- Aumentar articulos");
                        System.out.println("2.- Disminuir articulos");
                        int art = sc.nextInt();

                        if (art == 1) {

                            System.out.println("Ingrese el monto a umentar");
                            amount = sc.nextInt();

                            numberProduct[res] = numberProduct[res] + amount;

                            System.out.println("********* Info del proovedor *********");
                            System.out.println("Nombre: " + nameProovedores[res]);
                            System.out.println("Articulos: " + numberProduct[res] + "\n");

                        }else {
                            System.out.println("Ingrese el monto a disminuir");
                            amount = sc.nextInt();

                            numberProduct[res] = numberProduct[res] - amount;

                            System.out.println("********* Info del proovedor *********");
                            System.out.println("Nombre: " + nameProovedores[res]);
                            System.out.println("Articulos: " + numberProduct[res] + "\n");
                        }
                    }

                    break;


                case 5:
                    System.out.println("********** Listado de proovedores ***********\n");
                    for (int i = 0; i < proovedores; i++) {
                        System.out.println("Nombre del proovedor: " + nameProovedores[i]);
                        System.out.println("Ciudad de residencia: " + nameCity[i]);
                        System.out.println("Cantidad de productos: " + numberProduct[i] + "\n");
                    }

                    System.out.println("******************************************************\n");
                    break;

                 case 6:
                     System.out.println("********** EXIT *********");
                     break;

                default:
                    System.out.println("*********** Opcion no valida **************\n\n");
                    break;


            }


        }while (opc != 6 ) ;
    }

    public static int buscarProovedor(String[] p,String n){

        for (int i = 0; i < p.length; i++) {

            if(p[i].equals(n)){
                return i;
            }

        }

        return -1;
    }


}
