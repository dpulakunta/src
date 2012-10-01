import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyDialog extends JDialog {
	JButton ok = new JButton("OK");
	JButton cancel = new JButton("Cancel");
	JPanel panel1 = new JPanel(new BorderLayout());
	public MyDialog() {
		setSize(250,250);
		setTitle("MAGIC");
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
			}
		});
	}	   
	void paintWinText(String text){
		if(text =="magic"){
			//ImageIcon duke3 = new ImageIcon("/Users/dharm/Desktop/duke1.gif");
			ImageIcon duke3 = new ImageIcon("/Users/dharm/Desktop/javaduk2.gif");
			JButton magicalDuke = new JButton(duke3);
			add(magicalDuke,BorderLayout.CENTER);
			
			
		}else if(text == "exit"){
			System.out.println("calling system exit");
			System.exit(1);
		} else{
			JLabel printActivity= new JLabel(text);	
			JTextField textToDisplay = new JTextField(text,(int) CENTER_ALIGNMENT);
			textToDisplay.setEditable(false);
			textToDisplay.setColumns(2);
			textToDisplay.setHorizontalAlignment(JTextField.CENTER);
			add(textToDisplay,BorderLayout.CENTER);
		}
		add(ok,BorderLayout.PAGE_END);
		ActionListener al = new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				//JFrame.EXIT_ON_CLOSE;
				setVisible(false);
			}
		};
		repaint();
		setVisible(true);
		ok.addActionListener(al);
	}
}
