package com.app.mytix.domain;

import javax.persistence.*;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String eventName;
    private String eventDescription;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private EventType eventTypeId;

    //region CONSTRUCTORS
    public Event() {}
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

    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public EventType getEventTypeId() {
        return eventTypeId;
    }
    public void setEventTypeId(EventType eventTypeId) {
        this.eventTypeId = eventTypeId;
    }
    //endregion
}
