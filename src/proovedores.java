import java.util.Scanner;
public class proovedores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int proovedores = 0;

        System.out.println("Ingrese el numero de proovedores: ");
        proovedores = sc.nextInt();

        int[] provArray = new int[proovedores];
        String[] nameProovedores = new String[proovedores];
        String[] nameCity = new String[proovedores];
        int[] numberProduct = new int[proovedores];

        for (int i = 0; i < provArray.length; i++){

            System.out.println("Ingrese el nombre del proovedor "+ i);
            nameProovedores[i] = sc.nextLine();

            System.out.println("Ingrese la ciudad del proovedor "+ i);
            nameCity[i] = sc.nextLine();

            System.out.println("Ingrese el numero de productos del proovedor "+ i);
            numberProduct[i] = sc.nextInt();
        }


        for (int i = 0; i < provArray.length; i++){
            System.out.println(nameProovedores);
            System.out.println(nameCity);
            System.out.println(numberProduct);
        }



    }
}
