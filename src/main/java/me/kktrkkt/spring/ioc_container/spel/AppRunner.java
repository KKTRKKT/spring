package me.kktrkkt.spring.ioc_container.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Value("#{1 + 1 * 1 / 1 - 1}")
    int value;

    @Value("#{(1 == 1) || not (1 < 1) || 1 > 1 || 1 <= 1 || 1 >= 1 && 1 eq 1}")
    boolean trueOrFalse;

    @Value("#{'Hello' + 'World'}")
    String hello;

    @Value("#{${value} eq 10}")
    boolean isValue10;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(value);
        System.out.println(trueOrFalse);
        System.out.println(hello);
        System.out.println(isValue10);
    }
}
