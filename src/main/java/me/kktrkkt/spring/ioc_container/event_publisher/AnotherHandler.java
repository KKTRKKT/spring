package me.kktrkkt.spring.ioc_container.event_publisher;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {

    @EventListener
//    @Order(Ordered.HIGHEST_PRECEDENCE + 2)
    @Async
    public void handle(MyEvent myEvent){
        System.out.println("AnotherHandler");
        System.out.println(Thread.currentThread().getName());
        System.out.println(myEvent.getSource());
        System.out.println(myEvent.getData());
    }
}
