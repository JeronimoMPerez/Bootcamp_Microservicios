package com.nttdata.bootcampmicroservicios.usolibreria.service;

import com.nttdata.bootcampmicroservicios.libreria.Temperatura;
import org.springframework.stereotype.Service;


@Service
public class TestService {

    //SALUDO METHOD?


    //TEMPERATURA METHOD
    public Temperatura transformarTemperatura(Temperatura t){
        return t.cambiarFormato();
    }

}
