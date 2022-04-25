package in.ashokit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


import org.springframework.stereotype.Service;

import in.ashokit.entity.Passenger;
import in.ashokit.entity.Ticket;

@Service
public class TicketServiceImpl implements TicketService{
	private Map<String, Ticket> map=new HashMap<>();
	
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		String ticketNum=UUID.randomUUID().toString().replace("-", "");
		Ticket tinfo=new Ticket();
		tinfo.setTicketNum(ticketNum);
		tinfo.setTicketStatus("confirmed");
		tinfo.setName(passenger.getName());
		tinfo.setTicketprice(450.00);
		tinfo.setFrom(passenger.getFrom());
		tinfo.setTo(passenger.getTo());
		tinfo.setJdate(passenger.getJdate());
		tinfo.setTrainNum(passenger.getTrainNum());
		map.put(ticketNum, tinfo);
		return tinfo;
	}


	
	@Override
	public Ticket getTicket(String ticketNum) {
		if(map.containsKey(ticketNum)) {
			return map.get(ticketNum);
		}
		return null;
	}

	/*
	 * @Override public List<Ticket> getAllTickets() { List<Ticket>
	 * tickets=getAllTickets(); return tickets; }
	 */

}
