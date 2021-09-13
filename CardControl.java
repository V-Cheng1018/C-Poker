import java.awt.Point;

public class CardControl {
	public static void move(Card card, Point start, Point end) {
		if (end.x != start.x) {
			double x = (1.0) * (end.y - start.y) / (end.x - start.x);
			double b = end.y - end.x * x;
			int distance = 0;
			if (start.x < end.x)
				distance = 20;
			else {
				distance = -20;
			}
			for (int i = start.x; Math.abs(i - end.x) > 20; i += distance) {
				double y = x * i + b;

				card.setLocation(i, (int) y);
				try {
					Thread.sleep(5); 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		card.setLocation(end);
	}
	
	
}
