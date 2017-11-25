
public class PizzaMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Mozzarella m=new Mozzarella(null);
//		ToppingDecorator Pizza = new ToppingDecorator(m);
		Pizza myPizza = new Mozzarella(new Mushroom(new PlainPizza()));
		int a=myPizza.getCost();
		System.out.println(a);
	// Person needs extra Mozzarella
		myPizza = new Mozzarella(new Mozzarella(new PlainPizza()));
		a=myPizza.getCost();
		System.out.println(a);
		
	}

}
