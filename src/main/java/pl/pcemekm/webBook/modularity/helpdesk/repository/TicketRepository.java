package pl.pcemekm.webBook.modularity.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pcemekm.webBook.modularity.helpdesk.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Long> {

}
