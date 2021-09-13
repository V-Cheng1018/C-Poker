
public class Deck{
	static final int cards_length = 52;
	static final int diamond = 0;
	static final int club = 1;
	static final int heart = 2;
	static final int spade = 3;
	
	static final int Jack = 11;
	static final int Queen = 12;
	static final int King = 13;
	static final int Ace = 14;
	static final int Two = 15;
	
	public Card [] cards = new Card [52];
	
	int suit_combos [] = {diamond,club,heart,spade};
	String suits_string [] = {"diamond" ,"club" ,"heart" ,"spade"};
	int number_combos [] = {3,4,5,6,7,8,9,10,Jack,Queen,King,Ace,Two};
	String numbers_string [] = {"3","4","5","6","7","8","9","10","Jack","Queen","King","Ace","Two"};
	public Deck () {	
	}
	
	//fill up a new cards of cards
	public void populate() {
		for (int i = 0; i< cards.length; i++) {
			
			Card card = new Card(number_combos[i % 13], suit_combos[i / 13],suits_string[i/13], String.valueOf(i) );
			cards[i] = card;
			
			
		}
	}
	
	// shuffle the cards
	void shuffle () {
		for (int i = 0; i< cards.length; i++) {
			int index = (int)(Math.random()*cards.length); 
			
			Card temp = cards[i];
			cards[i] = cards[index];
			cards[index] = temp;
		}
	}
	
	
	
	
}
