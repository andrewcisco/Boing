package cisco;

import javax.swing.JFrame;

public class Launcher {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(512, 512);
		frame.setTitle("Boing");
		frame.setResizable(false);
		Game game = new Game();
		frame.add(game);
		frame.setAlwaysOnTop(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}