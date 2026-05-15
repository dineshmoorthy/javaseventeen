package playground;
class CommAddress implements Cloneable{
	String street;
	int flatno;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getFlatno() {
		return flatno;
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	@Override
	public String toString() {
		return "CommAddress [street=" + street + ", flatno=" + flatno + "]";
	}
	public CommAddress(String street, int flatno) {
		super();
		this.street = street;
		this.flatno = flatno;
	}
	
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
		
	}
}
class Agent implements Cloneable{
	String country;
	CommAddress comad;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public CommAddress getComad() {
		return comad;
	}
	public void setComad(CommAddress comad) {
		this.comad = comad;
	}
	public Agent(String country, CommAddress comad) {
		super();
		this.country = country;
		this.comad = comad;
	}
	@Override
	public String toString() {
		return "Agent [country=" + country + ", comad=" + comad + "]";
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		Agent agent = (Agent) super.clone();
	//	agent.comad = (CommAddress) comad.clone();
		return agent;
	}
}

public class PlayGroundTwo{
	public static void main(String[] args) throws CloneNotSupportedException {
		CommAddress com1 = new CommAddress("vijayalakshmi nagar", 153);
		Agent agent1 = new Agent("India", com1);
		Agent agent2 = (Agent) agent1.clone();
		
		agent2.comad.street = "newarkee Street";
		agent2.comad.flatno = 21;
		System.out.println(agent2.getComad().street);
		System.out.println(agent2.getComad().flatno);
		System.out.println(agent1.getComad().street);
		System.out.println(agent1.getComad().flatno);
	}
}