package com.vahner.airticketsapp.service.interf;

import com.vahner.airticketsapp.dto.TicketDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface TicketService {
    TicketDto getTicketById(String uuid);

    List<TicketDto> getAllTicket();

    TicketDto create(TicketDto ticketDto);

    void updateTicket(UUID uuid, TicketDto ticketDto);

    void deleteTicket(UUID uuid);

}