package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configurable
public class Config {

    @Bean("personSingleton")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person personSingleton(){
        return Person.builder()
                .name("Jero")
                .age(29)
                .build();
    }

    @Bean("personPrototype")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person personPrototype(){
        return Person.builder()
                .build();
    }



}
