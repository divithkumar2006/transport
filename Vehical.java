package transport;

public abstract class Vehical {
	protected String id;
	public Vehical(String id) {
		this.id=id;
		System.out.println("Vehicle()constructor called");
	}
	public abstract void deliver(String item,String place);
}


