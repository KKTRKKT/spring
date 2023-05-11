package me.kktrkkt.spring.ioc_container.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext context;

    @Autowired(required = false)
    DefaultBean defaultBean;

    @Autowired(required = false)
    TestConfiguration testConfiguration;

    @Override
    public void run(ApplicationArguments args) {
        Environment environment = context.getEnvironment();
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));

        // profile은 Run/Debug Configuration에서 Environment -> Vm Option에 -DSpring.profiles.active="test" 입력
        // 또는 Active Profiles에 test 입력
        System.out.println(defaultBean);
        System.out.println(testConfiguration);
        System.out.println(context.getBean("testBean"));
    }
}
