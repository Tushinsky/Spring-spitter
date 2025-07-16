package com.example.demo.config;

import com.example.demo.domain.Juggler;
import com.example.demo.domain.Sonet29;
import com.example.demo.springidol.Performer;
import com.example.demo.springidol.Poem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {
    @Bean
    public Performer duke() {
        return new Juggler();
    }

    @Bean
    public Poem sonet29() {
        return new Sonet29();
    }
}
