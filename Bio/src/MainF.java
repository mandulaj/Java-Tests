import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainF{

	int WIDTH = 960;
	int HEIGHT = 700;
	boolean start = false;
	JButton bS;
	JPanel p;
	JFrame frame;
	Thread t;
	Draw dr;
	
	public static void main(String[] args) {
		MainF mframe = new MainF();
		mframe.go();
		System.out.print("Endmain");
		
		

	}
	
	public void go() {
		
		frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		p = new JPanel();
		p.setBackground(Color.YELLOW);
		
		dr = new Draw();
		
		bS = new JButton("Start");
		bS.addActionListener(new bSt());
		
		frame.add(BorderLayout.SOUTH,bS);
		
		frame.add(BorderLayout.CENTER,dr);
		
		t = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					int count = 0;
					while (start) {
						System.out.println(count);
						dr.drawing();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						count ++;
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		});
		
		t.start();
		
		
	}
	


	
	public class bSt implements ActionListener {
		public void actionPerformed(ActionEvent a){
			
			System.out.print("Run");
			if (bS.getText() == "Stop") {
				bS.setText("Start");
				start = false;
				System.out.print("Start");
			} else {
				bS.setText("Stop");
				start = true;
				
				System.out.print("Stop");
			}
			
		}
	}

}
