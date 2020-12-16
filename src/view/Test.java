package view;

import java.awt.Rectangle;

import javax.swing.JFrame;

import edu.File;
import edu.FileSystemObject;
import edu.Folder;

public class Test {

	public static void main(String[] args) 
	{
		File file1 = new File("Parks.txt", 20);
		File file2 = new File("Gardens.txt", 30);
		File file3 = new File("Reservations.txt", 60);
		FileSystemObject[] files = {file1, file2, file3};
		Folder folder = new Folder("Green files", files);
		
		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);

		FileSystemView fsView = new FileSystemView(new Rectangle(50, 50, 200, 25), folder);
		frame.add(fsView);
		
	}

}
