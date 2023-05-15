package me.kktrkkt.spring.ioc_container.event_publisher;

import org.springframework.context.event.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EventHandler {

    @EventListener
//    @Order(Ordered.HIGHEST_PRECEDENCE)
    @Async
    public void handle(MyEvent myEvent){
        System.out.println("EventHandler");
        System.out.println(Thread.currentThread().getName());
        System.out.println(myEvent.getSource());
        System.out.println(myEvent.getData());
    }

    // ApplicationContext 초기화 및 새로고침시 실행
    @EventListener
    public void handle(ContextRefreshedEvent event){
        System.out.println("ContextRefreshedEvent");
    }

    // ApplicationContext 종료직전에 실행
    @EventListener
    public void handle(ContextClosedEvent event){
        System.out.println("ContextClosedEvent");
    }
}
