package me.kktrkkt.spring.ioc_container.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
// Spring이 모든 Aspect를 자동으로 활성화하고, AspectJ는 메서드 호출 전후에 보조 기능을 추가할 수 있다
@EnableAspectJAutoProxy
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
