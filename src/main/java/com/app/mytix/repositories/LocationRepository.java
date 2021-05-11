package com.app.mytix.repositories;

import com.app.mytix.domain.Location;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface LocationRepository extends CrudRepository<Location, Integer> {
}
