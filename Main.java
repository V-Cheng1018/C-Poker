import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Main {
	
	
	
	

	public static void main(String[] args) {
				
		UI frame = new UI();
		
		
		Deck deck = new Deck();
		deck.populate();
		frame.displayCard(deck);
		//store all four frame.players
		
		//create four frame.players
		
		for (int i=0;i<=3;i++) {
			Player player = new Player("player" + i);
			frame.players.add(player);
		}
		
		//deck.shuffle();
		
		for (int i=0; i<deck.cards.length;i++) {
			
			if (i % 4 == 0){
				CardControl.move(deck.cards[i], deck.cards[i].getLocation(), new Point(50, 60 + i * 7));
				
				frame.players.get(1).addToHand(deck.cards[i]);
			}
			
			else if (i % 4 == 1){
				CardControl.move(deck.cards[i], deck.cards[i].getLocation(), new Point(180 + i * 7, 450));
				frame.players.get(0).addToHand(deck.cards[i]);
			}
			else if (i % 4 == 2){
				CardControl.move(deck.cards[i], deck.cards[i].getLocation(), new Point(700, 60 + i * 7));
				frame.players.get(2).addToHand(deck.cards[i]);
			}
			
			else{
				CardControl.move(deck.cards[i], deck.cards[i].getLocation(), new Point(180 + i * 7 , 30 ));
				frame.players.get(3).addToHand(deck.cards[i]);
			}
			
	
		}
		
		for (int i=0;i<=3;i++) {
			frame.players.get(i).cardSort();; 
		}
		/***
		for (int i=0; i<13; i++) {
				
				CardControl.move(frame.players.get(1).hand.get(i), frame.players.get(1).hand.get(i).getLocation(), new Point(50, 60 + i * 7));
				
			
			
				CardControl.move(frame.players.get(1).hand.get(i), frame.players.get(0).hand.get(i).getLocation(), new Point(180 + i * 15, 450));
				
			
			
				CardControl.move(frame.players.get(1).hand.get(i), frame.players.get(2).hand.get(i).getLocation(), new Point(700, 60 + i * 5));
					
			
				CardControl.move(frame.players.get(1).hand.get(i), frame.players.get(3).hand.get(i).getLocation(), new Point(180 + i * 7 , 30 ));
				
			
			
		}***/
		
	
		for (int i=0;i<=3;i++) {
			frame.players.get(i).printHand();
			System.out.println("\n");
			frame.players.get(i).cardSort();
			System.out.print("player" + i + " ");
			
			frame.players.get(i).printHand();
			System.out.println("\n");
		}
	}

}
