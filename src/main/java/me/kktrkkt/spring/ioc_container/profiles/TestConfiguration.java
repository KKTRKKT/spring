package me.kktrkkt.spring.ioc_container.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestConfiguration {

    @Bean
    @Profile("test")
    public TestBean testBean(){
        return new TestBean();
    }
}
