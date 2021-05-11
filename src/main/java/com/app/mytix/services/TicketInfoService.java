package com.app.mytix.services;

import com.app.mytix.domain.TicketInfo;
import java.util.List;

public interface TicketInfoService {
    List<TicketInfo> listAllTicketInfo();
    TicketInfo getTicketInfoById(Integer id);
    TicketInfo saveTicketInfo(TicketInfo ticketInfo);
    List<TicketInfo> saveTicketInfoList(List<TicketInfo> ticketInfoList);

    void deleteTicketInfo(Integer id);
}
