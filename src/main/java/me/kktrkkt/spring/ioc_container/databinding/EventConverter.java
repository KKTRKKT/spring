package me.kktrkkt.spring.ioc_container.databinding;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public class EventConverter {

//    @Component
    static class StringToEventConverter implements Converter<String, Event>{

        @Override
        public Event convert(String id) {
            return new Event(Integer.valueOf(id));
        }
    }

//    @Component
    static class EventToStringConverter implements Converter<Event, String>{

        @Override
        public String convert(Event event) {
            return event.getId().toString();
        }
    }
}
