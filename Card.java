
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Card extends JLabel implements MouseListener {
		
	private int value;
	private int suit;
	private String suit_string;
	String image;
	boolean clicked = false;
	boolean canClick = true; 
	
	public Card (int value, int suit,String suit_string,String image) {
		this.value = value;
		this.suit = suit;
		this.setSuit_string(suit_string);
		this.image = image;
		
		this.displayIcon();
		this.setSize(71,96);
		this.setVisible(true);
		this.addMouseListener(this);
	}
	
	public void displayIcon() {
		this.setIcon(new ImageIcon("images/" + this.image + ".gif"));
		
	}
	
	int getValue () {
		return this.value;
	}
	
	int getSuit () {
		return this.suit;
	}
	
	void setValue (int value) {
		this.value = value;
	}
	
	void setSuit (int suit) {
		this.suit = suit;
	}

	public String getSuit_string() {
		return suit_string;
	}

	public void setSuit_string(String suit_string) {
		this.suit_string = suit_string;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		if(canClick) {
		Point current = this.getLocation();
		int distance;
		if (clicked)
			distance = -20;
		else {
			distance = 20;
		}
		clicked = !clicked;
		CardControl.move(this,current,new Point(current.x,current.y-distance));
	}
	}
	
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

	
	
}
