package com.app.mytix.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class EventType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String eventTypeName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Event> eventList;

    //region CONSTRUCTORS
    public EventType() {}
    //endregion

    //region GETTERS / SETTERS
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }
    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public List<Event> getEventList() {
        return eventList;
    }
    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
    //endregion
}
