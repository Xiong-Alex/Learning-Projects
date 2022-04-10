import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	

	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	private int r;
	
	ImageIcon img0 = new ImageIcon ("dice-target.png");
	ImageIcon img1 = new ImageIcon ("dice-six-faces-one.png");
	ImageIcon img2 = new ImageIcon ("dice-six-faces-two.png");
	ImageIcon img3 = new ImageIcon ("dice-six-faces-three.png");
	ImageIcon img4 = new ImageIcon ("dice-six-faces-four.png");
	ImageIcon img5 = new ImageIcon ("dice-six-faces-five.png");
	ImageIcon img6 = new ImageIcon ("dice-six-faces-six.png");
	
	
	public GUI() {
		
		frame = new JFrame();
		
		JButton button = new JButton ("Roll");
		button.addActionListener(this);
		button.setVerticalTextPosition(JLabel.BOTTOM);
		button.setHorizontalTextPosition(JLabel.CENTER);
		
		label = new JLabel ("You rolled a: 0");
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setIcon(img0);
	
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(420,420,420,420));
		panel.add(label);
		panel.add(button);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Roll the Die");
		frame.pack();
		frame.setVisible(true);
		

	}

	public static void main(String[] args) {
		new GUI();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Random dieNumber = new Random ();
		int r = dieNumber.nextInt(6) + 1;	
		
			label.setText("You rolled a: " + r);
			
		// Changing the img. to represent the dice roll (r)
			

		switch(r) {
		case 1:label.setIcon(img1);
		break;
		case 2:label.setIcon(img2);
		break;
		case 3:label.setIcon(img3);
		break;
		case 4:label.setIcon(img4);
		break;
		case 5:label.setIcon(img5);
		break;
		case 6:label.setIcon(img6);
		break;
		}
	

		
	}

}
