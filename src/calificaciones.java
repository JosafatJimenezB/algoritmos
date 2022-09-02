import java.util.Scanner;

public class calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alumnos = 0;
        System.out.println("ingrese el numero de alumnos");
        alumnos = sc.nextInt();

        int[] grupo;
        grupo = new int[alumnos];


        for (int i = 0; i < grupo.length; i++){
            System.out.println("Ingrese calificaion de el alumno "+i);
            grupo[i] = sc.nextInt();
        }

        System.out.println("Promedio de calificaciones = " + promedioCalificaciones(grupo));
        System.out.println("Numero de alumnos aprobados = "+ alumnosAprobados(grupo));
        System.out.println("Numero de alumnos reprobados = " + alumnosReprobados(grupo));
        System.out.println("Porcentaje de alumnos aprobados = "+ porcentajeAprobados(grupo) + "%");
        System.out.println("Porcentaje de alumnos reprobados = "+ porcentajeReprobados(grupo) + "%");
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


}
