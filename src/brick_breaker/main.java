package brick_breaker;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		gameplay Gameplay = new gameplay();
		obj.setBounds(10, 10, 710, 600);
		obj.setTitle("Breakout ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(Gameplay);

	}

}
