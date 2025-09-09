package transport;

public class Main {

	public static void main(String[] args) {
		Ebike e=new Ebike("EB-101",50);
		e.deliver("sandwich","library");
		Drone d=new Drone("DR-1");
		d.deliver("notes","Examcell");
		d.deliver("USB","CSE Blocks");
		double bill=d.cost(5);
		System.out.println("drone delivery cost:Rs."+bill);

	}

}
