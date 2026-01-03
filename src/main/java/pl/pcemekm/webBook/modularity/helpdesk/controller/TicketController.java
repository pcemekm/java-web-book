package pl.pcemekm.webBook.modularity.helpdesk.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pcemekm.webBook.modularity.helpdesk.entity.Ticket;
import pl.pcemekm.webBook.modularity.helpdesk.service.TicketService;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@RequiredArgsConstructor
public class TicketController {
    
    private final TicketService ticketService;
    
    @PostMapping
    public ResponseEntity<Ticket> createTicket(@RequestBody String title) {
        Ticket ticket = ticketService.createTicket(title);
        return ResponseEntity.status(HttpStatus.CREATED).body(ticket);
    }
    
    @GetMapping
    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> tickets = ticketService.getAllTickets();
        return ResponseEntity.ok(tickets);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable Long id) {
        Ticket ticket = ticketService.getTicketById(id);
        return ResponseEntity.ok(ticket);
    }
}

