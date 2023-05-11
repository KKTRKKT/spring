package me.kktrkkt.spring.ioc_container.application_context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        // xml에서 bean을 등록하는 방법
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicatoin_context/application_bean.xml");
        // xml에서 component-scan을 통해 bean을 등록하는 방법
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicatoin_context/application_component-scan.xml");
        // 자바에서 annotation을 이용해 bean을 등록하는 방법
//        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        // 자바에서 component-scan으로 bean을 등록하는 방법
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        // component-scan 방식은 클래스에 component 관련 annotation을 잘 붙여줘야함
        // @Controller, @Service, @Repository, @Configuration, @Component 등등

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }

}
