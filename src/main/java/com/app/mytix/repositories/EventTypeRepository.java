package com.app.mytix.repositories;

import com.app.mytix.domain.EventType;
import org.springframework.data.repository.CrudRepository;

public interface EventTypeRepository extends CrudRepository<EventType, Integer> {
}
