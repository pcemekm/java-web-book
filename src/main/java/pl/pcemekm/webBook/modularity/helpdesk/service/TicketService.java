package pl.pcemekm.webBook.modularity.helpdesk.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.pcemekm.webBook.core.exception.ResourceNotFoundException;
import pl.pcemekm.webBook.modularity.helpdesk.entity.Ticket;
import pl.pcemekm.webBook.modularity.helpdesk.repository.TicketRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TicketService {
    
    private final TicketRepository ticketRepository;
    
    public Ticket createTicket(String title) {
        Ticket ticket = new Ticket();
        ticket.setTitle(title);
        return ticketRepository.save(ticket);
    }
    
    @Transactional(readOnly = true)
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
    
    @Transactional(readOnly = true)
    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Ticket", id));
    }
}

