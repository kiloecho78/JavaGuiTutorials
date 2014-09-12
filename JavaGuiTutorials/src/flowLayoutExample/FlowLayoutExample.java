package flowLayoutExample;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
	
	public JPanel createContentPane(){
		
		JPanel totalGUI = new JPanel();
		
		// We create a main panel with the Flow Layout
		JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING)); // Can also be FlowLayout.LEADING or FlowLayout.CENTER 
		mainPanel.setPreferredSize(new Dimension(200,120));
		
		JPanel red = createSqPanel(Color.red, 50);
		JPanel blue = createSqPanel(Color.blue, 50);
		JPanel green = createSqPanel(Color.green, 50);
		JPanel orange = createSqPanel(Color.orange, 50);
		JPanel yellow = createSqPanel(Color.yellow, 50);
		
		mainPanel.add(red);
		mainPanel.add(blue);
		mainPanel.add(yellow);
		mainPanel.add(green);
		mainPanel.add(orange);
		
		totalGUI.add(mainPanel);
		totalGUI.setOpaque(true);
		return totalGUI;
	}
	
	// In this method we create colored square JPanels of a dimension
	// specified by the size variable
	
	private JPanel createSqPanel(Color c, int size){
		JPanel tempPanel = new JPanel();
		tempPanel.setBackground(c);
		tempPanel.setMinimumSize(new Dimension(size, size));
		tempPanel.setMaximumSize(new Dimension(size,size));
		tempPanel.setPreferredSize(new Dimension(size,size));
		return tempPanel;
	}
	
	private static void createAndShowGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame(" ~ Flow Layout Demo ~");
		FlowLayoutExample demo = new FlowLayoutExample();
		frame.setContentPane(demo.createContentPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args){
		//Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}
}
