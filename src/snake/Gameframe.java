package snake;

import javax.swing.JFrame;
public class Gameframe extends JFrame {

	GameFrame(){
		
		this.add(new Gamepanel());
		rhis.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.pack();
		this.setVariable(true);
		this.setLocationRelativeTo(null);
	}
	
}
