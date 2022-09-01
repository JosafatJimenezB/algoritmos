import java.util.Scanner;

public class arreglos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros;
        numeros = new int[10];



        for (int i = 0; i < 9; i++){
            System.out.println("Ingresa un numero para la posicion " +i);
            numeros[i] = sc.nextInt();
        }

        for (int j = 0; j < numeros.length; j++){
            System.out.println(numeros[j]);
        }

    }
}
