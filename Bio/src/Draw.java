import javax.swing.*;
import java.awt.*;
public class Draw extends JPanel{
	
	public Draw(){
		setBackground(Color.WHITE);
	}
	public void drawing() {
		System.out.print("dr");
		repaint();
		System.out.print("dr");
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(Color.GREEN);
		g.fillOval(50, 50, 80, 80);
		System.out.print("Green");
		
		g.setColor(Color.RED);
		g.fillOval(800, 500, 80, 80);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		g.fillRect(0, 0, 960, 700);
	}
}
