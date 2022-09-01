public class logicaCosechas {
    double [] cosechaCerealAnual;
    int mes;

    public logicaCosechas(){
        cosechaCerealAnual= new double [12];
        mes=0;
    }
    public void insertarValorCosecha(double valorCosecha){
        cosechaCerealAnual[mes]= valorCosecha;
        mes ++;
    }
    public double obtenerPromedio(){
        double sumaMeses = 0.0;
        for(int i=0; i< mes;i++)
            sumaMeses+=cosechaCerealAnual[i];
        return sumaMeses/(mes + 1);
    }
    public int cosechaSuperiorPromedio () {
        double promedio= obtenerPromedio();
        int cantidadMeses=0;
        for (int i = 0; i < mes; i++)
            if(cosechaCerealAnual[i]> promedio)
                cantidadMeses++;
        return cantidadMeses;
    }
    public int cosechaInferiorPromedio() {
        double promedio = obtenerPromedio();
        int cantidadMeses = 0;
        for (int i = 0; i < mes; i++)
            if (cosechaCerealAnual[i] < promedio)
                cantidadMeses++;
        return cantidadMeses;
    }
}
