package gridLayout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
	
	public JPanel createContentPane(){
		JPanel totalGui = new JPanel();
		
		//We create a JPanel with the GridLayout
		JPanel mainPanel = new JPanel(new GridLayout(3, 4, 15, 20));
		
		JPanel red = createSqPanel(Color.red, 50);
		JPanel orange = createSqPanel(Color.orange, 50);
		JPanel yellow = createSqPanel(Color.yellow, 50);
		JPanel green = createSqPanel(Color.green, 50);
		JPanel blue = createSqPanel(Color.blue, 50);
		JPanel pink = createSqPanel(Color.pink, 50);
		JPanel purple = createSqPanel(Color.magenta, 50);
		JPanel black = createSqPanel(Color.black,50);
		JPanel grey = createSqPanel(Color.gray, 50);
		JPanel cyan = createSqPanel(Color.cyan, 50);
		
		mainPanel.add(red);
		mainPanel.add(orange);
		mainPanel.add(yellow);
		mainPanel.add(green);
		mainPanel.add(blue);
		mainPanel.add(pink);
		mainPanel.add(purple);
		mainPanel.add(black);
		mainPanel.add(grey);
		mainPanel.add(cyan);
		
		totalGui.add(mainPanel);
		totalGui.setOpaque(true);
		return totalGui;
	}
	
	private JPanel createSqPanel(Color color, int size){
		JPanel tempPanel = new JPanel();
		tempPanel.setBackground(color);
		tempPanel.setMinimumSize(new Dimension(size, size));
		tempPanel.setMaximumSize(new Dimension(size, size));
		tempPanel.setPreferredSize(new Dimension(size, size));
		return tempPanel;
	}
	
	private static void createAndShowGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame(" ~ Grid Layout Example Demo ~ ");
		
		GridLayoutExample demo = new GridLayoutExample();
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
