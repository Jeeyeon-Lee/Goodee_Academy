package jungsuk.chap7;
class Product{
	int price;
	int bonusPoint;
	Product(int price){
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
}
public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	public static void main(String[] args) {

	}

}
