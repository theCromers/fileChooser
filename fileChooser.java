package homework_5_1302;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;


import java.io.*;

public class fileChooser {
	public static void main(String[] args) throws IOException{
		JFrame frame = new JFrame ("File Chooser");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fileChooserPanel panel = new fileChooserPanel();
		
		frame.getContentPane().add(panel, 0);
		
		frame.pack();
		frame.setVisible(true);
	}
}
