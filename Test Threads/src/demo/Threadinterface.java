package demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Threadinterface {

	JLabel text1;
	
	public static void main(String[] args) {
		Threadinterface test = new Threadinterface();
		test.go();
	}
	
	public void go(){
		JFrame frame = new JFrame();
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		
		JButton b1 = new JButton("Click");
		b1.addActionListener(new Runner());
		
		text1 = new JLabel("n");
		
		p.add(text1);
		p.add(b1);
		
		frame.add(p);
	}
	
	public class Runner implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Thread t1 = new Thread(new Runnable(){

				@Override
				public void run() {
					try {
						System.out.print("Yes");
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					text1.setText("");
					
				}
				
			});
			t1.start();
			dip("Hello");
		}
	}
	
	public void dip(String level){
		text1.setText(level);
	}


}
