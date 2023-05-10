package com.nttdata.bootcampmicroservicios.libreria;

public class Temperatura {

    private double grados;
    private String formato;

    public Temperatura(double grados, String formato) {
        this.grados = grados;
        this.formato = formato;
    }

    public Temperatura cambiarFormato(){
        switch (formato){
            case "Celsius":
                return new Temperatura(grados *(9/5) +32, "Farenheit");
            case "Farenheit":
                return new Temperatura((grados-32)*(5/9),"Celsius");
            default:
                return this;
        }
    }
}
