package me.kktrkkt.spring.ioc_container.bean_scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext context;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("prototype");
        System.out.println(context.getBean("proto"));
        System.out.println(context.getBean("proto"));

        System.out.println("singleton");
        System.out.println(context.getBean("single"));
        System.out.println(context.getBean("single"));

        System.out.println("proto in single");
        System.out.println(context.getBean(Single.class).getProto());
        System.out.println(context.getBean(Single.class).getProto());
    }
}
