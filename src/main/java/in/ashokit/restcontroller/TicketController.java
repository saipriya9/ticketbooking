package in.ashokit.restcontroller;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Passenger;
import in.ashokit.entity.Ticket;
import in.ashokit.service.TicketService;

@RestController
public class TicketController {
	@Autowired
	private TicketService service;
	
	@PostMapping(value="/ticket",
			consumes={"application/json"},
	produces={"application/json"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){
		Ticket ticket=service.bookTicket(passenger);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	@GetMapping(value="/ticket/{ticketNum}",
			
			produces={"application/json"})
		public ResponseEntity<Ticket> getTicket(@PathVariable String ticketNum){
		Ticket ticket=service.getTicket(ticketNum);
		return new ResponseEntity<>(ticket,HttpStatus.OK);}
		
			@GetMapping("/tickets")
			public ResponseEntity<List<Ticket>> getAllTickets(){
			List<Ticket> ticketList=service.getAllTickets();
			return new ResponseEntity <>(ticketList,HttpStatus.OK);
		
			
	}  
}
