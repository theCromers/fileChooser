package homework_5_1302;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class fileChooserPanel extends JPanel {
	private JButton open;
	private JTextArea ta;
	private JCheckBox jpg, bmp, txt, doc;

	public fileChooserPanel() {
		jpg = new JCheckBox(".jpg");
		bmp = new JCheckBox(".bmp");
		txt = new JCheckBox(".txt");
		doc = new JCheckBox(".doc");
		open = new JButton("open");
		ta = new JTextArea(20, 20);
		open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				if (jpg.isSelected()) {
					FileNameExtensionFilter filter1 = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
					fc.addChoosableFileFilter(filter1);
					fc.setAcceptAllFileFilterUsed(false);
				}
				if (bmp.isSelected()) {
					FileNameExtensionFilter filter2 = new FileNameExtensionFilter("BMP file", "bmp");
					fc.addChoosableFileFilter(filter2);
					fc.setAcceptAllFileFilterUsed(false);
				}
				if (txt.isSelected()) {
					FileNameExtensionFilter filter3 = new FileNameExtensionFilter("TXT file", "txt");
					fc.addChoosableFileFilter(filter3);
					fc.setAcceptAllFileFilterUsed(false);
				}
				if (doc.isSelected()) {
					FileNameExtensionFilter filter4 = new FileNameExtensionFilter("Doc File", "doc");
					fc.addChoosableFileFilter(filter4);
					fc.setAcceptAllFileFilterUsed(false);
				}
				if (!ta.getText().equals("")) {
					File f = new File(ta.getText());
					fc.setCurrentDirectory(f);
				}
				int returnVal = fc.showOpenDialog(fileChooserPanel.this);
			}

		});
		;
		this.add(jpg);
		this.add(bmp);
		this.add(txt);
		this.add(doc);
		this.add(open);
		this.add(ta);
		this.setPreferredSize(new Dimension(300, 300));
	}
}
