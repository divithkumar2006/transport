package transport;

public class Drone extends Vehicle {

	public Drone(String id) {
		super(id);
		System.out.println("Drone constructor()is called");
	}

	@Override
	public void deliver(String item, String place) {
	if(!SecurityRules.Canfly(place)) {
		System.out.println("Delivery to"+place+"is blocked by security");
		return;
	}
	System.out.println("Delivering item"+"to place"+place+"by Drone");

	}
	public double cost(double distanceKm) {
		return distanceKm*20;
	}
	}
