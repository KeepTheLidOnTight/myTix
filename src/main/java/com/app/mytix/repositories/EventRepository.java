package com.app.mytix.repositories;

import com.app.mytix.domain.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Integer> {
}
