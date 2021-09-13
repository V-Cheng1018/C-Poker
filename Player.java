import java.util.ArrayList;
import java.util.Arrays;

public class Player {
	private String name;
	public ArrayList<Card> hand = new ArrayList<Card>();
	
	
	public Player(String name,ArrayList<Card> hand) {
		this.name = name;
		this.hand = hand;
		
	}
	public Player(String name) {
		this.name = name;
	}
	
	public String getname() {
		return this.name;
	}
	public void setname(String name) {
		this.name = name;
	}

	public ArrayList<Card> gethand() {
		return this.hand;
	}
	
	public void cardSort () {
		Card [] card_array = new Card [this.hand.size()];
		this.hand.toArray(card_array);
		quickSort(card_array, 0, card_array.length-1); 
		
		ArrayList <Card> new_list = new ArrayList <Card> (Arrays.asList(card_array));
		this.hand = new_list;
	}
	public void swap(Card [] arr,int i, int j) {
		Card temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void quickSort (Card [] arr, int low,int high) {
		if (arr == null || arr.length == 0) 
			return;
		if (low >= high)
			return;
		
		int mid = low + (high - low) / 2;
		Card pivot = arr[mid];
		

		int i = low, j = high;
		while (i <= j) {
			while (arr[i].getValue() < pivot.getValue()) {
				i++;
			}
			
			while (arr[j].getValue() > pivot.getValue()) {
				j--;
			}
			
			if(i <= j) {
				swap(arr, i ,j);
				
				
				i++;
				j--;
			}
		}
		
		if(low < j) {
			quickSort(arr,low,j);
		
		}
		if (high > i) {
			quickSort(arr, i, high);
		}
		
	}
	public void addToHand(Card card) {
		this.hand.add(card);
	}
	
	public void printHand() {
		for (int i=0; i<hand.size(); i++) {
			System.out.print(hand.get(i).getSuit_string() + hand.get(i).getValue() + " ");
			
		}
	}
	
	
	public void playHand(ArrayList<Card> hand) {
		 
	}
}
