package com.app.mytix.services;

import com.app.mytix.domain.Event;
import java.util.List;

public interface EventService {
    List<Event> listAllEvents();
    Event getEventById(Integer id);
    Event saveEvent(Event event);
    List<Event> saveEventList(List<Event> eventList);

    void deleteEvent(Integer id);
}
