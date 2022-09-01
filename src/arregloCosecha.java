import java.util.Scanner;

public class arregloCosecha {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        // arreglo de tonelada en el año
        int[] toneladas = new int[12];

        for (int i = 1; i < 13; i++ ){
            System.out.println("Ingrese la cantidad para el mes: "+ i);
            toneladas[i] = sc.nextInt();
        }

        System.out.println("El promedio anual es de: "+promedioCosecha(toneladas));*/

        logicaCosechas arregloCosecha = new logicaCosechas ();
        Scanner teclado= new Scanner(System.in);

        double valorCosecha;
        System.out.println("Se almacenará el número total de toneladas de cereal cosechadas");
        for(int i=0;i<12;i++){
            System.out.print ("Introduce las toneladas cosechadas en el "+i+"° mes: ");
            valorCosecha = teclado.nextDouble ();
            arregloCosecha.insertarValorCosecha (valorCosecha);
        }

        System.out.println ("\nEl promedio anual de toneladas cosechadas  es de " + arregloCosecha.obtenerPromedio());
        System.out.println ("El número de meses con cantidad superior  al promedio anual son " + arregloCosecha.cosechaSuperiorPromedio());
        System.out.println ("El número de meses con cantidad  inferior  al promedio anual son " + arregloCosecha.cosechaInferiorPromedio());



    }
    /*public static double promedioCosecha(int[] t){

        double total = 0.0;

        for (int j = 0; j < t.length; j++){
            total += t[j];
        }

        return total/t.length;
    }*/
}
