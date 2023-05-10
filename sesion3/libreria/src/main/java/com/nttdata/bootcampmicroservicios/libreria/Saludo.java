package com.nttdata.bootcampmicroservicios.libreria;

public class Saludo {

    private String idioma;

    public Saludo(String idioma){
        this.idioma = idioma;
    }

    public String mensajeSaludo(){

        switch (idioma){
            case "Castellano":
                return "Bienvenido";
            case "Ingles":
                return "Welcome";
            case "Frances":
                return "Salut";
            default:
                return "Bienvenido";
        }
    }

}
