package com.example.Imtihon.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Beann {
    @Bean
    @Scope("singleton")
    public void salom(){
        System.out.println("Salom");
    }

    @Bean
    @Scope("prototype")
    public void hayr(){
        System.out.println("hayr");
    }

    @Bean
    public void alvido(){
        System.out.println("alvido");
    }


}
