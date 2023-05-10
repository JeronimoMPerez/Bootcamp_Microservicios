package com.nttdata.bootcampmicroservicios.usolibreria.controller;


import com.nttdata.bootcampmicroservicios.libreria.Temperatura;
import com.nttdata.bootcampmicroservicios.usolibreria.service.TestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private TestService testService;

    public TestController(TestService testService){
        this.testService = testService;
    }

    @PostMapping("/temperatura")
    public Temperatura transformarTemperatura(@RequestBody Temperatura t){
        return testService.transformarTemperatura(t);
    }
}
