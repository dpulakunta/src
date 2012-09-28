import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DukeWindow {
	public JDialog dialogBox = new JDialog();
	public static void main(String[] args) {
		final JFrame mainWindow = new JFrame("DUKE'S MAGIC");
		
		mainWindow.setSize(800, 750);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panelToAddThings = new JPanel(new FlowLayout());
		mainWindow.add(panelToAddThings);
		ImageIcon duke1 = new ImageIcon("/Users/dharm/Desktop/DukeSaltimbanqueSmall.png");
		ImageIcon duke3 = new ImageIcon("/Users/dharm/Desktop/javaduk2.gif");
		ImageIcon duke2 = new ImageIcon("/Users/dharm/Desktop/duke_with_cape.gif");
		ImageIcon duke4 = new ImageIcon("/Users/dharm/Desktop/java-duke-teaching.png");
		
		JButton firstButton = new JButton(duke2);
		firstButton.setToolTipText("Click to know more about DUKE");
		
		
		JButton secondButton =  new JButton(duke4);
		
		JButton thirdButton = new JButton(duke1);
		
		JButton fourthButton = new JButton("Click to Get Surprised");
		
		
		//JButton fifthButton = new JButton("FifthButton");
		
		
		panelToAddThings.add(firstButton);
		panelToAddThings.add(secondButton);
		panelToAddThings.add(thirdButton);
		panelToAddThings.add(fourthButton);
		//panelToAddThings.add(fifthButton);
		ActionListener al = new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				MyDialog dialogBox = new MyDialog();
				
				String toIdentifyTheSource =e.getSource().toString();
				if(toIdentifyTheSource.contains("duke_with_cape")){
					dialogBox.paintWinText("Get Ready for the Magic");
				}else if (toIdentifyTheSource.contains("java-duke-teaching")) {
					dialogBox.paintWinText("Abracadabra");
				}else if (toIdentifyTheSource.contains("DukeSaltimbanqueSmall")) {
					dialogBox.paintWinText("Try again!!!! Hocus Pocus ");
				}else{
					dialogBox.paintWinText("Magic");
				}
			}
		};
		firstButton.addActionListener(al);
		secondButton.addActionListener(al);
		thirdButton.addActionListener(al);
		fourthButton.addActionListener(al);
		mainWindow.setVisible(true);
	}


}
