package com.nttdata.bootcampmicroservicios.actuator.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class TestController {

    private Counter counter;

    public TestController(MeterRegistry registry) {
        this.counter = Counter.builder("invocaciones.saludo")
                .description("invocaciones totales del endpoint saludo")
                .register(registry);
    }

    @GetMapping("/saludo")
    public String saludo(){
        System.out.println("\n\n\n================================");
        System.out.println(counter.count());
        System.out.println("================================\n\n\n");
        counter.increment();
        return "Welcome";
    }
}
