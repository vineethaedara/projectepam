package newyearsgift;

public class Wafer extends Chocolate {
	Wafer(int price, int weight) {
		super(price, weight);
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int getPrice() {
		return this.price;
	}
}
