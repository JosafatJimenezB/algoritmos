import java.util.Scanner;

public class calificaciones {
    public static void main(String[] args) {

        // objeto scanner para lectura de datos por consola
        Scanner sc = new Scanner(System.in);


        // determinacion de tamaño del arreglo por el usuario
        int alumnos = 0;
        System.out.println("ingrese el numero de alumnos");
        alumnos = sc.nextInt();

        // tamaño del arreglo por el usuario
        int[] grupo;
        grupo = new int[alumnos];


        // insertar valores de las calificaciones en el arreglo
        for (int i = 0; i < grupo.length; i++){
            System.out.println("Ingrese calificaion de el alumno "+i);
            grupo[i] = sc.nextInt();
        }

        System.out.println("Promedio de calificaciones: " + promedioCalificaciones(grupo));
        System.out.println("Numero de alumnos aprobados: "+ alumnosAprobados(grupo));
        System.out.println("Numero de alumnos reprobados: " + alumnosReprobados(grupo));
        System.out.println("Porcentaje de alumnos aprobados: "+ porcentajeAprobados(grupo) + "%");
        System.out.println("Porcentaje de alumnos reprobados: "+ porcentajeReprobados(grupo) + "%");
        System.out.println("Alumnos con calificaion menor o igual a ocho: " + calificacionMenor(grupo));
    }

    public static double promedioCalificaciones(int[] g){
        double total = 0;

        for (int j = 0; j < g.length; j++){
            total += g[j];
        }

        return total/g.length;
    }

    public static int alumnosAprobados(int[] g){
        int count = 0;
        for (int j = 0; j < g.length; j++){
            if (g[j] >= 6){
                count += 1;
            }
        }
        return count;
    }

    public static int alumnosReprobados(int[] g){
        int count = 0;

        for (int j = 0; j < g.length; j++){
            if (g[j] < 6){
                count += 1;
            }
        }
        return count;
    }

    public static double porcentajeAprobados(int[] g){
        int count = 0;

        for (int j = 0; j < g.length; j++){
            if (g[j] >= 6){
                count += 1;
            }
        }

        double per = (count * 100)/g.length;

        return per;
    }

    public static double porcentajeReprobados(int[] g){
        int count = 0;

        for (int j = 0; j < g.length; j++){
            if (g[j] < 6){
                count += 1;
            }
        }

        double per = (count * 100)/g.length;

        return per;
    }

    public static int calificacionMenor(int[] g){
        int count = 0;

        for (int j = 0; j < g.length; j++){
            if (g[j] <= 8){
                count += 1;
            }
        }

        return count;
    }
}
