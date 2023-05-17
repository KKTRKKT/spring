package me.kktrkkt.spring.ioc_container.databinding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/event/{event}")
    public String event(@PathVariable Event event) {
        System.out.println(event);
        return event.getId().toString();
    }
}
