package in.ashokit.entity;


public class Ticket {
	private String name;
	private String from;
	private String to;
	private String jdate;
	private Long trainNum; 
	private String ticketNum;
	private String ticketStatus;
	private Double ticketprice;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Long getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Long trainNum) {
		this.trainNum = trainNum;
	}
	public String getTicketNum() {
		return ticketNum;
	}
	public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public Double getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(Double ticketprice) {
		this.ticketprice = ticketprice;
	}
	
	public String getJdate() {
		return jdate;
	}
	public void setJdate(String jdate) {
		this.jdate = jdate;
	}
	@Override
	public String toString() {
		return "Ticket [name=" + name + ",  from=" + from + ", to=" + to + ", jdate=" + jdate
				+ ", trainNum=" + trainNum + ", ticketNum=" + ticketNum + ", ticketStatus=" + ticketStatus
				+ ", ticketprice=" + ticketprice + "]";
	}
	
}
