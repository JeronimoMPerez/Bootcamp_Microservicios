package com.nttdata.bootcampmicroservicios.actuator.estados;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Endpoint(id = "estados")
public class Estados {

    List<String> listaEstados = new ArrayList<>();

    @ReadOperation
    public List<String> listarEstados(){
        return listaEstados;
    }

    @WriteOperation
    public void saveEstados(@Selector String nuevoEstado){
        listaEstados.add(nuevoEstado);
    }

    @DeleteOperation
    public void deleteEstado(String estadoABorrar){
        listaEstados.remove(estadoABorrar);
    }

}
