package in.ashokit.service;


import in.ashokit.entity.Passenger;
import in.ashokit.entity.Ticket;

public interface TicketService {
public Ticket bookTicket(Passenger passenger);
public Ticket getTicket(String ticketNum);

}
