import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class UI extends JFrame implements ActionListener {
	
	public Container container = null;
	JButton playCard [] = new JButton [2]; // button to play card or skip
	public ArrayList <Player> players = new ArrayList<>();
	public int currentPlayer;
	ArrayList <Card> graveYard  = new <Card> ArrayList ();
	UI(){
		
		this.setSize(830,620);
		this.setVisible(true);
		this.setTitle("Chinese Poker");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(new Color(0,112,26));
		this.setButton();
	}

	public void setButton () {
		playCard [0] = new JButton ("Play");
		playCard [1] = new JButton ("Skip");
		for (int i = 0; i < 2; i++) {
			playCard[i].setBounds(320 + i * 100, 400, 60, 20);
			playCard[i].setVisible(true);
			playCard[i].addActionListener(this);
			container.add(playCard[i]);
			
		}
		
	}
	public void displayCard (Deck deck) {
		for(int i=0; i < deck.cards.length; i++) {
			container.add(deck.cards[i]);
		}
	}
	
	
	public void rotatePlayer () {
		currentPlayer += 1;
		currentPlayer = currentPlayer % 4;
	}
	
	//sort first then send card
	public void sortCardImage (Player player) {
		
	}
	//add a add card button to play
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == playCard[0]) {
			ArrayList <Card> currentCards = new <Card> ArrayList ();
			for (int i = 0; i < players.get(currentPlayer).hand.size(); i++ ) {
				Card card = players.get(currentPlayer).hand.get(i);
				if (card.clicked) {
					currentCards.add(card);
					Point point = new Point ();
					point.x = (770 / 2) - (currentCards.size() + 1) * 15 / 2;
					point.y = 300;
					CardControl.move(card, card.getLocation(), point );
				}
			
				
			}
			
		}
		
		
		if (e.getSource() == playCard[1]) {
			
		}
		rotatePlayer ();
	}
}
