package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

import edu.FileSystemObject;

public class FileSystemView extends JComponent
{
	private FileSystemObject fsObject;
	
	public FileSystemView(Rectangle dimensions, FileSystemObject fsObject)
	{
		this.fsObject = fsObject;
		this.setBounds(dimensions);
	}
	
	public void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		Graphics2D g = (Graphics2D)graphics;
		g.setColor(Color.BLACK);
		g.drawRect(5, 5, this.getWidth()-10, this.getHeight()-10);
		
		String fsObjectInfo = String.format("%s (%d bytes", this.fsObject.getName(),
				this.fsObject.getSize());
		g.drawString(fsObjectInfo, 10, 20);
		
		Graphics2D f = (Graphics2D)graphics;
		f.setColor(Color.BLACK);
		f.drawRect(5, 10, this.getWidth()-15, this.getHeight()-15);
		f.setBackground(Color.YELLOW);
	}
	
}
