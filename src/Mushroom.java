
public class Mushroom extends ToppingDecorator{

	public Mushroom(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Mushroom");
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		
		return tempPizza.getName() + ",Mushroom";
		
	}

	
	public int getCost() {
		return tempPizza.getCost() + 1;
	}
	
}
