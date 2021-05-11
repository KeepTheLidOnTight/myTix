package com.app.mytix.services;

import com.app.mytix.domain.EventType;
import java.util.List;

public interface EventTypeService {
    List<EventType> listAllEventTypes();
    EventType getEventTypeById(Integer id);
    EventType saveEventType(EventType eventType);
    List<EventType> saveEventTypeList(List<EventType> eventTypeList);

    void deleteEventType(Integer id);
}
