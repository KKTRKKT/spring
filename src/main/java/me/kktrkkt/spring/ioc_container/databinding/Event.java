package me.kktrkkt.spring.ioc_container.databinding;

public class Event {

    private Integer id;

    public Event(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                '}';
    }
}
