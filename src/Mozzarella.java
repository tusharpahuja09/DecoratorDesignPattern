
public class Mozzarella extends ToppingDecorator{

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Mozzarella");
		
		// TODO Auto-generated constructor stub
	}
	
public String getName() {
	
		return tempPizza.getName() + ", Mozzarella";
		
	}

public int getCost() {
	return tempPizza.getCost() + 2;
}
	

}
