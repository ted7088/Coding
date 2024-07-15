package test;

class Card {
	public int num=20;
	static int width = 0;
	static int height = 105;

}

public class Main{
	public static void main(String[] args) {
		
		int height= 105;
		Card.width=height;
		Card heart = new Card();
		
		System.out.println(Card.width++);
		System.out.println(heart.width);
		System.out.println(--height);
		System.out.println(heart.height);
		
	}
}
