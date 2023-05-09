package com.example.demo;

import ch.qos.logback.classic.pattern.ClassNameOnlyAbbreviator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Person{

    @Builder.Default
    private String name = "Fulanito";

    @Builder.Default
    private int age = 20;


}
