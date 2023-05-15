package me.kktrkkt.spring.ioc_container.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext context;

    @Value("${app.version}")
    int version;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = context.getEnvironment();
        // VM options에 -Dapp.name=spring5
        // app.properties 변수보다 vm options 변수가 우선순위가 더 높음
        System.out.println(environment.getProperty("app.name"));
        System.out.println(version);
    }
}
