package com.app.mytix.repositories;

import com.app.mytix.domain.TicketInfo;
import org.springframework.data.repository.CrudRepository;

public interface TicketInfoRepository extends CrudRepository<TicketInfo, Integer> {
}
