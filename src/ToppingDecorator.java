
public class ToppingDecorator implements Pizza {

	Pizza tempPizza;
	
	public ToppingDecorator(Pizza a) {
		// TODO Auto-generated constructor stub
		tempPizza = a;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return tempPizza.getName();
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost();
	}
	
	
}
