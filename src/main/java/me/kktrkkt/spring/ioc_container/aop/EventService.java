package me.kktrkkt.spring.ioc_container.aop;

import org.springframework.stereotype.Service;

@Service
public class EventService {

    @PerfLogging
    public void createEvent(){
        sleep(1000L);
        System.out.println("create event");
    }

    @PerfLogging
    public void publishEvent(){
        sleep(2000L);
        System.out.println("publish event");
    }

    public void deleteEvent(){
        System.out.println("delete event");
    }

    private void sleep(long l) {
        try {
            Thread.sleep(l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
