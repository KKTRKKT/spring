package me.kktrkkt.spring.ioc_container.event_publisher;

public class MyEvent {

    private final Object source;

    private final int data;

    public MyEvent(Object source, int data) {
        this.source = source;
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Object getSource() {
        return source;
    }
}
