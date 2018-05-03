import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tools {
	public static void MessageBox(String message) {
		JOptionPane.showMessageDialog(null, message);
		
	}
	//Create Folder
	public static void creatFolder(String folderName, String path) {
		File f = new File(path+ "/"+ folderName);
		f.mkdirs();
		
	}	
	
}
