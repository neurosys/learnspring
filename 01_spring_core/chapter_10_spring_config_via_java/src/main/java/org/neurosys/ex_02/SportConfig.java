package org.neurosys.ex_02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class SportConfig {
    @Bean
    public IFortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public ICoach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
