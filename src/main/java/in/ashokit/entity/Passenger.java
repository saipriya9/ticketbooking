package in.ashokit.entity;

public class Passenger {
	private String name;
	private String email;
	private String from;
	private String to;
	private String jdate;
	private Long trainNum; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
	
	public String getJdate() {
		return jdate;
	}
	public void setJdate(String jdate) {
		this.jdate = jdate;
	}
	
	public Long getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Long trainNum) {
		this.trainNum = trainNum;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", email=" + email + ", from=" + from + ", to=" + to + ", jdate=" + jdate
				+ ", trainNum=" + trainNum + "]";
	}
	
	
	
}
