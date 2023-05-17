package me.kktrkkt.spring.ioc_container.databinding;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class EventFormatter implements Formatter<Event> {

    @Override
    public Event parse(String text, Locale locale) {
        return new Event(Integer.valueOf(text));
    }

    @Override
    public String print(Event object, Locale locale) {
        return object.getId().toString();
    }
}
